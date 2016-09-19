package com.crystal.framework.service;

/**
 * Created by blackcrystaling on 16-9-19.
 */
public class ServiceManager {
    public static final int SERVICE_USER = 1000;


    private static ServiceManager serviceManager;

    private ServiceManager(){};

    public static DataHandleService getService(int type)
    {
//        if(serviceManager == null)
//        {
//            serviceManager = new ServiceManager();
//        }
        switch (type)
        {
            case SERVICE_USER:
            {
                return new UserService();
            }
            default: return null;
        }
    }

}
