package com.mongodb.dao;

import com.mongodb.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: XIAOPING JIANG
 * Date: 2017/3/4
 * Time: 15:53
 */
public interface UserDao {
    /**
     * 查询所有数据
     *
     * @return
     */
    List<User> findAll();

    /**
     * 用于分页查询
     *
     * @param skip(第一个坐标为0)
     * @param limit
     * @return
     */
    List<User> findList(int skip, int limit);

    /**
     * 保存用户
     *
     * @param user
     */
    void store(User user);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    User findOne(String id);

    /**
     * 根据用户名查询
     *
     * @param username
     * @return
     */
    User findOneByUsername(String username);

    /**
     * 更新
     *
     * @param user
     */
    void updateFirst(User user);

    /**
     * 删除
     *
     * @param ids
     */
    void delete(String... ids);
}
