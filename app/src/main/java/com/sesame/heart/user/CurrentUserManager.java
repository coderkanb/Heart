package com.sesame.heart.user;

import com.sesame.heart.MainApplication;
import com.sesame.heart.utils.SPUtils;

/**
 * 当前登录用户信息管理
 *
 * @date 2016/7/9
 */
public class CurrentUserManager {
    public static final String SP_CURRENT_USER = "current_user";
    public static final String SP_USER_TOKEN = "user_token";


    /**
     * 清除当前登录用户（退出登录时调用）
     */
    public static void clearCurrentUser() {
        SPUtils.remove(MainApplication.getContext(), SP_CURRENT_USER);

    }

    /**
     * 设置当前登录用户（登录成功时调用）
     *
     * @param userInfo
     * @return
     */
    public static UserInfo setCurrentUser(UserInfo userInfo) {
        SPUtils.put(MainApplication.getContext(), SP_CURRENT_USER, userInfo);
        return userInfo;
    }

    /**
     * 获取当前登录用户信息
     *
     * @return
     */
    public static UserInfo getCurrentUser() {
        return (UserInfo) SPUtils.get(MainApplication.getContext(), SP_CURRENT_USER, null);
    }

    /**
     * 设置登录用户Token
     *
     * @param token
     */
    public static void setUserToken(String token) {
        if (token != null) {
            SPUtils.put(MainApplication.getContext(), SP_USER_TOKEN, token);
        }
    }

    /**
     * 获取登录用户Token
     *
     * @return
     */
    public static String getUserToken() {
        String token=(String) SPUtils.get(MainApplication.getContext(), SP_USER_TOKEN,"");
        return token;

    }

    /**
     * 清除登录用户Token
     */
    public static void clearUserToken() {
        SPUtils.remove(MainApplication.getContext(), SP_USER_TOKEN);
    }
}
