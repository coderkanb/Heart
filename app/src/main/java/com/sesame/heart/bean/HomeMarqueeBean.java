package com.sesame.heart.bean;

import java.util.List;

/**
 * 首页跑马灯数据类
 * Created by Administrator on 2016/11/2.
 */
public class HomeMarqueeBean {

    /**
     * errorCode : 0
     * errorStr : success
     * resultCount : 10
     * score : 0
     * balance : 0
     * results : [{"label":"用户 全** 支付￥300 预约了咨询师 曹华"},{"label":"用户 育** 支付￥300 预约了咨询师 趙健兵"},{"label":"用户 义** 支付￥180 预约了咨询师 陈琳"},{"label":"用户 信** 支付￥500 预约了咨询师 王薇"},{"label":"用户 信** 支付￥500 预约了咨询师 王薇"},{"label":"用户 仪** 购买咨询师 陈琳 电话倾诉25分钟"},{"label":"用户 B** 购买咨询师 金新新 电话倾诉25分钟"},{"label":"用户 B** 购买咨询师 金新新 电话倾诉25分钟"},{"label":"用户 丽** 购买咨询师 杨振军 电话倾诉25分钟"},{"label":"用户 育** 购买咨询师 趙健兵 电话倾诉25分钟"}]
     */

    private int errorCode;
    private String errorStr;
    private int resultCount;
    private int score;
    private int balance;
    /**
     * label : 用户 全** 支付￥300 预约了咨询师 曹华
     */

    private List<ResultsBean> results;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorStr() {
        return errorStr;
    }

    public void setErrorStr(String errorStr) {
        this.errorStr = errorStr;
    }

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String label;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
    }
}
