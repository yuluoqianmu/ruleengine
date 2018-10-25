package com.yixin.service;

import com.github.pagehelper.Page;
import com.yixin.model.RuleUser;
import com.yixin.model.request.RuleUserRequest;

/**
 * Created by shaomaolin on 2018/10/23.
 */


public interface RuleUserService {

    RuleUser queryOne(String id);

    Page<RuleUser> pageRuleUsers(RuleUserRequest request);

    RuleUser addRuleUser(RuleUserRequest request);
}
