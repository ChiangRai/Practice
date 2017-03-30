package mogondb;

import com.mongodb.dao.UserDao;
import com.mongodb.model.User;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: XIAOPING JIANG
 * Date: 2017/3/4
 * Time: 16:01
 */
public class UserDaoTest extends BaseTest {

    @Resource
    private UserDao userDao;

    @Test //测试Spring IOC的开发环境
    public void save() {
        User user = new User();
        user.setUsername("skyLine23");
        user.setPassword("77777773");
        userDao.store(user);

        User user2 = userDao.findOneByUsername("skyLine23");
        logger.info("-------获取账户密码:-------" + user2.getPassword());
    }

    @Test
    public void find() {
        User user2 = userDao.findOneByUsername("skyLine23");
        logger.info("-------find获取账户密码:-------" + user2.getPassword());
    }

    @Test
    public void update() {
        User user = userDao.findOneByUsername("skyLine23");
        logger.info("-------更新之前账户密码:-------" + user.getPassword());
//46.13.27.29.02.
        user.setPassword("9999888");
        userDao.updateFirst(user);

        logger.info("-------更新之后账户密码:-------" + user.getPassword());
    }

    @Test
    public void delete() {
        User skyLine2 = userDao.findOneByUsername("skyLine23");
        userDao.delete(skyLine2.getId());
    }
}
