package com.leiwenjie.base.support.user.dao.impl;

import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

import com.leiwenjie.base.support.common.SupportConstants;
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
public class UserDao implements IUserDao {

    @Inject(optional = true)
    protected Dao dao;

    @Override
    public User insert(User t) {
        return dao.fastInsert(t);
    }

    @Override
    public int delete(int id) {
        User user = new User();
        user.setId(id);
        user.setStatus(SupportConstants.CONS_STR_NO);
        return updateIgnoreNull(user);
    }

    @Override
    public int updateIgnoreNull(User t) {
        return dao.updateIgnoreNull(t);
    }

}