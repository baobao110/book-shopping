package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.mapper.catalogMapper;
import com.mapper.commodityMapper;

@RunWith(SpringRunner.class)
@ContextConfiguration({ "/spring-config.xml" })
public class test {
	
	@Autowired
	private catalogMapper cata;
	
	@Autowired
	private commodityMapper comm;
	
	
	@Test
	public void testSet() {
		/*assertNotNull(comm.Flow("100", 10));*/
	}

}
