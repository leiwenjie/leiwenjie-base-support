package com.leiwenjie.base.support.common.base.dao;

/**
 * 数据基类访问接口
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月16日 下午8:23:47
 */
public interface IBaseDao<T> {

    T fastInsert(T t);

    int update(T t);

    int delete(java.lang.Class<T> classOfT, int id);

    T fetchById(java.lang.Class<T> classOfT, int id);
}
