package com.yixin.service;

import com.github.pagehelper.PageInfo;
import com.yixin.model.RuleUser;
import com.yixin.model.request.RuleUserRequest;

import java.util.List;

/**
 * Created by shaomaolin on 2018/10/23.
 */


public interface RuleUserService {

    RuleUser queryOne(String id);

    PageInfo<RuleUser> pageRuleUsers(RuleUserRequest request);


    RuleUser addRuleUser(RuleUserRequest request);
}
