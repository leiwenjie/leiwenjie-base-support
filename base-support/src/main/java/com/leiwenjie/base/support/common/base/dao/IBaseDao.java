package com.leiwenjie.base.support.common.base.dao;

/**
 * 数据访问对象接口
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月27日 上午9:09:00
 */
public interface IBaseDao<T> {

    /**
     * 插入对象
     *
     * @param t
     *            需要插入的对象
     * @return T 插入后的对象
     ** @throws
     */
    T insert(T t);

    /**
     * 根据ID删除对象
     *
     * @param id
     *            主键标识
     * @return int 受影响行数
     ** @throws
     */
    int delete(int id);

    /**
     * 更新一个对象，忽略为null的属性
     *
     * @param t
     *            要更新的对象
     * @return int 受影响的行数
     ** @throws
     */
    int updateIgnoreNull(T t);
}
