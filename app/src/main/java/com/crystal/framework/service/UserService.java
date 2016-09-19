package com.crystal.framework.service;

import android.util.Log;

import com.crystal.framework.application.MainApplication;
import com.crystal.framework.bean.User;
import com.crystal.framework.dao.UserDao;
import com.crystal.framework.event.AnyEvent;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by blackcrystaling on 16-9-19.
 */
public class UserService extends   DataHandleService {

    @Override
    public void doHandle(Object... objects) {
        Log.i(TAG, "UserService doHandle");

        UserDao dao = new UserDao(User.class);
        User user = new User();
        user.setName("blackcrystaling");
        dao.add(user);

        AnyEvent event = new AnyEvent();
        event.msg = 1;
        event.obj = "testtest";
        ( (EventBus)objects[0]).post(event);
    }
}
