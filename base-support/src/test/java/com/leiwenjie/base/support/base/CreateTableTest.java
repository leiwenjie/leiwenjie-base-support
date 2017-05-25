package com.leiwenjie.base.support.base;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nutz.dao.Dao;
import org.nutz.ioc.Ioc;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

import com.leiwenjie.base.support.dictionary.entity.Dictionary;
import com.leiwenjie.base.support.dictionary.entity.DictionaryDetail;
import com.leiwenjie.base.support.globalvar.entity.GlobalVar;
import com.leiwenjie.base.support.operalog.entity.OperatorLog;
import com.leiwenjie.base.support.user.entity.User;
import com.leiwenjie.base.support.user.entity.UserOpen;

@RunWith(MyNutTestRunner.class)
@IocBean
public class CreateTableTest {

    @Inject("refer:$ioc")
    protected Ioc ioc;

    @Inject
    protected Dao dao;

    @Test
    public void testSaveUser() {
        dao.create(User.class, true);
        dao.create(Dictionary.class, true);
        dao.create(DictionaryDetail.class, true);
        dao.create(GlobalVar.class, true);
        dao.create(OperatorLog.class, true);
        dao.create(UserOpen.class, true);
        Assert.assertTrue(true);
    }
}
