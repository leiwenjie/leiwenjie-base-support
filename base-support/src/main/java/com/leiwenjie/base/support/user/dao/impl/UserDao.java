package com.leiwenjie.base.support.user.dao.impl;

import org.nutz.ioc.loader.annotation.IocBean;

import com.leiwenjie.base.support.common.base.dao.impl.BaseDao;
import com.leiwenjie.base.support.user.dao.IUserDao;
import com.leiwenjie.base.support.user.entity.User;

/**
 * 用户的数据访问类
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月16日 下午8:14:18
 */
@IocBean
public class UserDao extends BaseDao<User> implements IUserDao {
 
}