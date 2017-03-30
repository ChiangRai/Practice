package com.mybatis.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mybatis.dao.DocUserMapper;
import com.mybatis.model.DocUser;
import com.mybatis.model.DocUserExample;
import com.mybatis.service.DocUserService;
import com.utils.model.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: XIAOPING JIANG
 * Date: 2017/3/6
 * Time: 15:38
 */
@Service
public class DocUserServiceImpl implements DocUserService {

    @Autowired
    private DocUserMapper docUserMapper;

    public Page<DocUser> findPageByPageable(Pageable pageable) {
        Page<DocUser> page = PageHelper.startPage(pageable.getPageNumber(),pageable.getPageSize(),pageable.getOrderBy());
        docUserMapper.selectByExample(new DocUserExample());
        return page;
    }
}
