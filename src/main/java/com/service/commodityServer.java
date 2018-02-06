package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.catalog;
import com.domain.commodity;
import com.dto.bookDTO;
import com.mapper.catalogMapper;
import com.mapper.commodityMapper;

@Service
public class commodityServer {
	
	@Autowired
	private catalogMapper catalog;
	
	@Autowired
	private commodityMapper commodity;
	
	public  ArrayList<bookDTO> bookList(){
		 ArrayList<catalog> cata=catalog.List("-1");
		 ArrayList<bookDTO> book=new ArrayList<>(cata.size());
		 for(catalog i:cata) {
			 bookDTO dto=new bookDTO();
			 dto.setCatalog(i.getCatalogName());
			 book.add(dto);
			 ArrayList<commodity> list=commodity.Flow(i.getCatalogNum());
			 ArrayList<bookDTO> flow=new ArrayList<>(list.size());
			 dto.setDto(flow);
			 for(commodity j:list) {
				 bookDTO child=new bookDTO();
				 child.setBookName(j.getCommName());
				 if(child.getBookName().length()>10) {
					 child.setBookName(child.getBookName().substring(0,10)+"......");//防止书名过长
				 }
				 child.setBookPrice(j.getCommPrice());
				 child.setPictureName(j.getPictureName());
				 flow.add(child);
			 }
		 }
			 
		 return book;
	}
	
	public ArrayList<commodity> lazyLoad(String parentCatalogNum){
		 ArrayList<commodity> list=commodity.Flow(parentCatalogNum);
		 return list;
	}
	


}
