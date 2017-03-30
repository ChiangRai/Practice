package com.mongodb.dao.impl;

import com.mongodb.dao.UserDao;
import com.mongodb.model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: XIAOPING JIANG
 * Date: 2017/3/4
 * Time: 15:53
 */
@Service
public class UserDaoImpl implements UserDao {
    //MongoTemplate是数据库和代码之间的接口，对数据库的操作都在它里面
    @Resource
    private MongoTemplate mongoTemplate;

    
    public List<User> findAll() {
        return this.mongoTemplate.find(new Query(), User.class);
    }

    public List<User> findList(int skip, int limit) {
        Query query = new Query();
        //Direction.ASC, "_id")
        query.with((Pageable) new Sort.Order (Sort.Direction.ASC ,"_id"));
        query.skip(skip).limit(limit);
        return this.mongoTemplate.find(query, User.class);
    }

    public void store(User user) {
        mongoTemplate.save(user);
    }

    /**
     * Criteria.where("username").is(username)
     * 前一个是数据库的字段,后一个是java类的字段
     *
     * @param username
     * @return
     */
    public User findOneByUsername(String username) {
        Query query = new Query();
        Criteria criteria = Criteria.where("username").is(username);
        query.addCriteria(criteria);
        return this.mongoTemplate.findOne(query, User.class);
    }

    public User findOne(String id) {
        Query query = new Query();
        Criteria criteria = Criteria.where("_id").is(id);
        query.addCriteria(criteria);
        return this.mongoTemplate.findOne(query, User.class);
    }

    public void updateFirst(User user) {
        Update update = new Update();
        Query query = new Query();
        update.set("username", user.getUsername());
        update.set("password", user.getPassword());
        this.mongoTemplate.updateFirst(query.addCriteria(Criteria.where("_id").is(user.getId())), update, User.class);
    }

    public void delete(String... ids) {
        if (ids == null || ids.length == 0) {
            return;
        }
        for (String id : ids) {
            Query query = new Query(Criteria.where("_id").is(id));
            this.mongoTemplate.remove(query, User.class);
        }
    }
}
