package com.crystal.framework.service;

/**
 * Created by blackcrystaling on 16-9-19.
 */
public abstract class DataHandleService {
    public  final String TAG = DataHandleService.class.getSimpleName();

    /**
     * 异步数据
     * @param objects
     */
    public void doExecuteAsync(final Object... objects){
        new Thread(new Runnable() {
            @Override
            public void run() {
                doHandle(objects);
            }
        }).start();
    }
    public void doHandle(Object... objects){};

    /**
     * 同步数据
     * @param objects
     */
    public void doExecuteSync(Object... objects){};


}
