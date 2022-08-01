


import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;


@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class HikariCPTest {

	@Autowired
   private DataSource ds;
	
	@Test
	   public void test2() {
	      try {
	                Connection con = ds.getConnection();
	        
	            System.out.println("con = " + con);
	            log.info("!!!!!!!!!!!!!!!!11"+con);
	            
	            
	        } catch(Exception e) {
	           log.error(e.getMessage());
	        }
	    }
}
