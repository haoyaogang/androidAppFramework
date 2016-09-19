package com.crystal.framework;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.crystal.framework.application.BaseActivity;
import com.crystal.framework.bean.User;
import com.crystal.framework.dao.UserDao;
import com.crystal.framework.event.AnyEvent;
import com.crystal.framework.service.DataHandleService;
import com.crystal.framework.service.ServiceManager;
import com.j256.ormlite.dao.Dao;
import com.loonandroid.pc.annotation.InLayer;
import com.loonandroid.pc.annotation.InView;
import com.loonandroid.pc.annotation.Init;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.sql.SQLException;

@InLayer(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @InView
    TextView text;
    DataHandleService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userService = ServiceManager.getService(ServiceManager.SERVICE_USER);
    }

    @Override
    public void onEventMainThread(AnyEvent event) {
        super.onEventMainThread(event);
        UserDao dao = new UserDao(User.class);
        Toast.makeText(this,"User:"+dao.getList().size(),Toast.LENGTH_SHORT).show();
    }

    @Init
    public void onInit()
    {
        text.setText("MainActivity ioc test");
        userService.doExecuteAsync(eventBus);
    }


}
