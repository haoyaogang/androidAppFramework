package com.crystal.framework.application;

import android.app.Application;

import com.crystal.framework.db.DatabaseHelper;
import com.google.code.microlog4android.Logger;
import com.google.code.microlog4android.LoggerFactory;
import com.google.code.microlog4android.config.PropertyConfigurator;
import com.loonandroid.pc.ioc.Ioc;

/**
 * Created by blackcrystaling on 16-9-18.
 */
public class MainApplication extends Application {
    private static final Logger logger = LoggerFactory.getLogger();
    private  static MainApplication app;
    private DatabaseHelper databaseHelper;

    public static MainApplication getAppInstance()
    {
        return app;
    }


    @Override
    public void onCreate() {
        //初始化注解
        Ioc.getIoc().init(this);
        //初始化log
        PropertyConfigurator.getConfigurator(this).configure();
        super.onCreate();
        app = this;
        //初始化数据库
        databaseHelper = DatabaseHelper.getHelper(this);


        logger.debug("MainApplication onCreate>>");
    }
    public DatabaseHelper getDbHelper()
    {
        return databaseHelper;
    }

}
