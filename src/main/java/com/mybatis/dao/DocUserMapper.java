package com.mybatis.dao;

import com.mybatis.model.DocUser;
import com.mybatis.model.DocUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocUserMapper {
    long countByExample(DocUserExample example);

    int deleteByExample(DocUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DocUser record);

    int insertSelective(DocUser record);

    List<DocUser> selectByExample(DocUserExample example);

    DocUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DocUser record, @Param("example") DocUserExample example);

    int updateByExample(@Param("record") DocUser record, @Param("example") DocUserExample example);

    int updateByPrimaryKeySelective(DocUser record);

    int updateByPrimaryKey(DocUser record);
}