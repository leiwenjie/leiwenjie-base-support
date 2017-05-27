package com.leiwenjie.base.support.base;

import org.junit.runners.model.InitializationError;
import org.nutz.ioc.Ioc;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.loader.combo.ComboIocLoader;
import org.nutz.mock.NutTestRunner;

/**
 * 
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月18日 下午10:02:32
 */
public class MyNutTestRunner extends NutTestRunner {

    public MyNutTestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    /**
     * 可覆盖createIoc,实现参数覆盖, bean替换,等定制.
     */
    protected Ioc createIoc() {
        Ioc ioc = null;
        try {
            ioc = new NutIoc(new ComboIocLoader("*js", "ioc/", "*anno", "com.leiwenjie.base.support.base",
                    "com.leiwenjie.base.support.user.dao"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ioc;
    }
}
