package com.yixin.mapper;

import com.yixin.model.RuleUser;
import com.yixin.model.RuleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuleUserMapper {
    int countByExample(RuleUserExample example);

    int deleteByExample(RuleUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(RuleUser record);

    int insertSelective(RuleUser record);

    List<RuleUser> selectByExampleWithBLOBs(RuleUserExample example);

    List<RuleUser> selectByExample(RuleUserExample example);

    RuleUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RuleUser record, @Param("example") RuleUserExample example);

    int updateByExampleWithBLOBs(@Param("record") RuleUser record, @Param("example") RuleUserExample example);

    int updateByExample(@Param("record") RuleUser record, @Param("example") RuleUserExample example);

    int updateByPrimaryKeySelective(RuleUser record);

    int updateByPrimaryKeyWithBLOBs(RuleUser record);

    int updateByPrimaryKey(RuleUser record);
}