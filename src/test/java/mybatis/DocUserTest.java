package mybatis;


import com.mybatis.service.DocUserService;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
 
public class DocUserTest {
 
	private DocUserService userService;
     
    @Before
    public void before(){        
    	  System.out.println("1");
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring.xml"
                ,"classpath:spring/spring-mybatis.xml"});
        System.out.println("2");
        userService = (DocUserService) context.getBean("userService");
    }
     
}