package com.leiwenjie.base.support.user.dao;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

import com.leiwenjie.base.support.base.MyNutTestRunner;
import com.leiwenjie.base.support.common.SupportConstants;
import com.leiwenjie.base.support.user.entity.User;

@RunWith(MyNutTestRunner.class)
@IocBean
public class UserDaoTest {

    @Inject
    protected UserDao userDao;

    @Inject
    protected Dao dao;

    @Test
    public void testSave() {
        System.out.println("-------------执行顺序：1-------------");
        User user = new User();
        user.setLoginName("zhangsan");
        user.setPassword("abc123");
        user.setType(User.USER_REGIST_TYPE_LOCAL);
        user.setStatus(SupportConstants.CONS_STR_YES);
        user.setRegisterTime(new Date());
        userDao.insert(user);
        Assert.assertTrue(user.getId() != 0);
    }

    @Test
    public void testUpdate() {
        int maxId = dao.getMaxId(User.class);
        User user = new User();
        user.setId(maxId);
        user.setLoginName("xiugai");
        userDao.updateIgnoreNull(user);
        Assert.assertTrue("xiugai".equals(user.getLoginName()));
    }

    @Test
    public void testDelete() {
        int maxId = dao.getMaxId(User.class);
        userDao.delete(maxId);

        User user = dao.fetch(User.class, maxId);
        Assert.assertTrue(user.getStatus() == SupportConstants.CONS_STR_NO);
    }
}
