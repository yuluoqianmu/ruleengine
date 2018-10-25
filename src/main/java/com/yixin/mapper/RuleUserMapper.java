package com.yixin.mapper;

import com.yixin.model.RuleUser;
import com.yixin.model.RuleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface RuleUserMapper extends Mapper<RuleUser> {
    long countByExample(RuleUserExample example);

    int deleteByExample(RuleUserExample example);

    List<RuleUser> selectByExampleWithBLOBs(RuleUserExample example);

    List<RuleUser> selectByExample(RuleUserExample example);

    int updateByExampleSelective(@Param("record") RuleUser record, @Param("example") RuleUserExample example);

    int updateByExampleWithBLOBs(@Param("record") RuleUser record, @Param("example") RuleUserExample example);

    int updateByExample(@Param("record") RuleUser record, @Param("example") RuleUserExample example);
}