package mogondb;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: XIAOPING JIANG
 * Date: 2017/3/3
 * Time: 11:49
 */
//指定bean注入的配置文件
@ContextConfiguration(locations ={"classpath:spring/spring.xml"
        ,"classpath:spring/spring-mybatis.xml"})
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class BaseTest extends AbstractJUnit4SpringContextTests {
    protected Logger logger = LoggerFactory.getLogger(getClass());
}
