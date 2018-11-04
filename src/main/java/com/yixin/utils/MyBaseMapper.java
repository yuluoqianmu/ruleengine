package com.yixin.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by shaomaolin on 2018/11/2.
 */
public interface MyBaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}

