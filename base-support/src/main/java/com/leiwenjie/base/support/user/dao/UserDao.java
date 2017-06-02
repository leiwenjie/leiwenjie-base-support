package com.leiwenjie.base.support.user.dao;

import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

import com.leiwenjie.base.support.common.SupportConstants;
import com.leiwenjie.base.support.user.entity.User;

/**
 * 用户的数据访问类
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月16日 下午8:14:18
 */
@IocBean
public class UserDao {

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

}