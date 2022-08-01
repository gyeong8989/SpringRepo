

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DBConn {

	@Test
	   public void test() {
	      String url = "jdbc:oracle:thin:@localhost:1521:XE";
	      String id = "book_ex";
	      String pw = "1234";
	      
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         Connection conn = DriverManager.getConnection(url, id, pw);
	         log.info(conn);
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      
	      
	   }
	
	
	
	
}
