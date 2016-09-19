package com.crystal.framework.dao;

import java.util.List;

/**
 * Created by blackcrystaling on 16-9-19.
 */
public interface DaoImpl<T> {

    public void add(T cls);
    public void delete(T cls);
    public void update(T cls);
    public T  getById(int id);

    public List<T> getList();
}
