package com.crystal.framework.dao;

import java.sql.SQLException;
import java.util.List;

import android.content.Context;

import com.crystal.framework.application.MainApplication;
import com.crystal.framework.bean.User;
import com.crystal.framework.db.DatabaseHelper;
import com.j256.ormlite.dao.Dao;

public class UserDao extends AbstractDao<User>
{

	public UserDao(Class<User> clazz) {
		super(clazz);
	}


}
