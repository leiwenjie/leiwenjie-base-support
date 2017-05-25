package com.leiwenjie.base.support.user.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nutz.dao.Dao;
import org.nutz.ioc.Ioc;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

import com.leiwenjie.base.support.base.MyNutTestRunner;
import com.leiwenjie.base.support.user.entity.User;

@RunWith(MyNutTestRunner.class)
@IocBean
public class UserDaoTest {

    @Inject("refer:$ioc")
    protected Ioc ioc;

    @Inject
    protected Dao dao;

    @Test
    public void testSaveUser() {
        Assert.assertNotNull(dao);
        dao.create(User.class, false);
    }
}
