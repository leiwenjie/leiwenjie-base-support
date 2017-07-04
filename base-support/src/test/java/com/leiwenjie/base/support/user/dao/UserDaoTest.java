package com.leiwenjie.base.support.user.dao;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.leiwenjie.base.support.base.MyNutTestRunner;
import com.leiwenjie.base.support.common.SupportConstants;
import com.leiwenjie.base.support.user.entity.User;
import com.leiwenjie.base.support.user.service.UserService;

@RunWith(MyNutTestRunner.class)
@IocBean
public class UserDaoTest {

    static final Logger logger = LoggerFactory.getLogger(User.class);

    @Inject
    protected UserService userService;

    @Inject
    protected Dao dao;

    // @Test
    public void testSave() {
        System.out.println("-------------执行顺序：1-------------");
        User user = new User();
        user.setLoginName("zhangsan");
        user.setPassword("abc123");
        user.setType(User.USER_REGIST_TYPE_LOCAL);
        user.setStatus(SupportConstants.CONS_STR_YES);
        user.setRegisterTime(new Date());
        userService.insert(user);
        Assert.assertTrue(user.getId() != 0);
    }

    // @Test
    public void testUpdate() {
        int maxId = dao.getMaxId(User.class);
        User user = new User();
        user.setId(maxId);
        user.setLoginName("xiugai");
        userService.updateIgnoreNull(user);
        Assert.assertTrue("xiugai".equals(user.getLoginName()));
    }

    // @Test
    public void testDelete() {
        int maxId = dao.getMaxId(User.class);
        userService.delete(maxId);

        User user = dao.fetch(User.class, maxId);
        Assert.assertTrue(user.getStatus() == SupportConstants.CONS_STR_NO);
    }

    @Test
    public void testList() {
        List<User> userList = userService.query();
        Assert.assertTrue(userList != null);
    }
}
