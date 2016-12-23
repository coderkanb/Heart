package com.sesame.heart.client;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;

/**
 * ClientAPI实体管理类
 * <p>
 * Created by sesame on 2016/12/8.
 */
public class ClientAPIHelper {
    public static final String TAG = ClientAPIHelper.class.getSimpleName();

    private static ClientAPIHelper mInstance;

    private Map<Class<? extends BaseClientAPI>, BaseClientAPI> clientMap = new HashMap<>();

    private Context mApplicationContext;

    /**
     * 设置全局上下文
     *
     * @param context
     */
    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }

    private ClientAPIHelper() {
    }

    /** 获取client的实体 **/
    public BaseClientAPI getClientAPI(Class<? extends BaseClientAPI> clazz) {
        BaseClientAPI clientAPI = clientMap.get(clazz);
        if (clientAPI == null) {
            synchronized (ClientAPIHelper.class) {
                if (clientMap.get(clazz) == null) {
                    try {
                        Class itemClazz = Class.forName(clazz.getName());
                        BaseClientAPI instance = (BaseClientAPI) itemClazz.newInstance();
                        clientMap.put(clazz, instance);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();

                    } catch (InstantiationException e) {
                        e.printStackTrace();

                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }

                return clientMap.get(clazz);
            }
        }
        return clientMap.get(clazz);
    }

    public static ClientAPIHelper getInstance() {
        if (mInstance != null) {
            return mInstance;
        } else {
            synchronized (ClientAPIHelper.class) {
                if (mInstance == null) {
                    mInstance = new ClientAPIHelper();
                }
                return mInstance;
            }
        }
    }
}
