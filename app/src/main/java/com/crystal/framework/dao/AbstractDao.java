package com.crystal.framework.dao;

import com.crystal.framework.application.MainApplication;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by blackcrystaling on 16-9-19.
 */
public class AbstractDao<T> implements DaoImpl<T> {

    private Dao<T, Integer> dao;

    public AbstractDao(Class<T> clazz)
    {
        try {
            dao = MainApplication.getAppInstance().getDbHelper().getDao(clazz);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void add(T cls) {
        try {
            dao.create(cls);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(T cls) {
        try {
            dao.delete(cls);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(T cls) {
        try {
            dao.update(cls);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public T getById(int id) {
        try {
           return  dao.queryForId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<T> getList() {
        try {
            return dao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
