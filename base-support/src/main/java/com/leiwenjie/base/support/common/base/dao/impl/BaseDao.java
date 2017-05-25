package com.leiwenjie.base.support.common.base.dao.impl;

import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;

import com.leiwenjie.base.support.common.base.dao.IBaseDao;

/**
 * 数据访问基类
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月16日 下午8:23:47
 */
public class BaseDao<T> implements IBaseDao<T> {

    @Inject
    Dao dao;

    public T fastInsert(T t) {
        return dao.fastInsert(t);
    }

    public int update(T t) {
        return dao.update(t);
    }

    public int delete(java.lang.Class<T> classOfT, int id) {
        return dao.delete(classOfT, id);
    }

    public T fetchById(java.lang.Class<T> classOfT, int id) {
        return dao.fetch(classOfT, id);
    }
}
