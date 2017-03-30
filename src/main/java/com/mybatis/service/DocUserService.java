package com.mybatis.service;

import com.github.pagehelper.Page;
import com.mybatis.model.DocUser;
import com.utils.model.Pageable;

/**
 * Created with IntelliJ IDEA.
 * User: XIAOPING JIANG
 * Date: 2017/3/6
 * Time: 15:36
 */
public interface DocUserService {

    Page<DocUser> findPageByPageable(Pageable pageable);
}
