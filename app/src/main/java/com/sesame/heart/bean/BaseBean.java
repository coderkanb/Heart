package com.sesame.heart.bean;

import java.io.Serializable;

/**
 * 功能：基础的bean - 其它业务的bean要继承这个类
 *
 * Created by Administrator on 2017/1/12.
 */
public class BaseBean implements Serializable{

    public int code;
    public String desc;

    @Override
    public String toString() {
        return "BaseBean{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
