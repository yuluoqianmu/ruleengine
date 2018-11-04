package com.yixin.controller;

import com.google.common.base.Preconditions;
import com.yixin.model.RuleUser;
import com.yixin.model.response.RuleUserResponse;
import com.yixin.service.RuleUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by shaomaolin on 2018/11/2.
 */
@Api(value = "用户接口")
@Log4j2
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RuleUserService userService;


    @ApiOperation(value = "获取用户", notes = "根据id查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", required=true, dataType = "String")
    @ResponseBody
    @GetMapping(value = "/queryUser/{id}")
    public RuleUserResponse queryRuleUser(@PathVariable String id) {
        RuleUserResponse resp = new RuleUserResponse();
        try {
            RuleUser user = userService.queryOne(id);
            Preconditions.checkNotNull(user, "查询用户信息为空！");

            BeanUtils.copyProperties(resp, user);
            return resp;
        } catch (Exception e) {
            log.error("查询用户失败！", e);
            throw new RuntimeException(e.getMessage());
        }

    }
}
