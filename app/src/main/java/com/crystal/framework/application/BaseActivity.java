package com.crystal.framework.application;

import android.app.Activity;
import android.os.Bundle;

import com.crystal.framework.db.DatabaseHelper;
import com.crystal.framework.event.AnyEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by blackcrystaling on 16-9-18.
 */
public abstract  class BaseActivity extends Activity {
    /**
     * 代替主线程的handler
     * @param event
     */
    protected  EventBus eventBus;

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(AnyEvent event){};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //订阅事件
        eventBus = new EventBus();
        eventBus.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        eventBus.unregister(this);//
    }
}
