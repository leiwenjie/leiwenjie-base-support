package com.leiwenjie.base.support.user.service;

import java.util.List;

import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.leiwenjie.base.support.common.SupportConstants;
import com.leiwenjie.base.support.user.entity.User;

/**
 * 用户访问实现类
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年6月2日 下午8:10:16
 */
@IocBean
public class UserService {

    static final Logger logger = LoggerFactory.getLogger(User.class);

    @Inject(optional = true)
    protected Dao dao;

    /**
     * 新增用户
     *
     * @param t
     *            用户对象
     * @return User 新增后的用户对象
     ** @throws
     */
    public User insert(User t) {
        return dao.fastInsert(t);
    }

    /**
     * 逻辑删除用户(status = 0)
     *
     * @param id
     *            要删除的用户ID
     * @return int 受影响的行数
     ** @throws
     */
    public int delete(int id) {
        User user = new User();
        user.setId(id);
        user.setStatus(SupportConstants.CONS_STR_NO);
        return updateIgnoreNull(user);
    }

    /**
     * 更新用户信息（忽略为null值的属性)
     *
     * @param t
     *            用户信息
     * @return int 收影响的行数
     ** @throws
     */
    public int updateIgnoreNull(User t) {
        return dao.updateIgnoreNull(t);
    }

    /**
     * 获取用户信息列表
     *
     * @return List<User>
     ** @throws
     */
    public List<User> query() {
        return dao.query(User.class, null);
    }

}
