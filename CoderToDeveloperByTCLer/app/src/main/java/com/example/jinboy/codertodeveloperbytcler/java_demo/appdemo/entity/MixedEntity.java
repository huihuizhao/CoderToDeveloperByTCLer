package com.example.jinboy.codertodeveloperbytcler.java_demo.appdemo.entity;

/**
 * <pre>
 *     author : JinBiao
 *     CSDN : http://my.csdn.net/DT235201314
 *     time   : 2018/11/06
 *     desc   : 混合开发实体类
 *     version: 1.0
 * </pre>
 */

public class MixedEntity extends AbsBaseEntity {
    private String title; //名称
    private String intro; //简介

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public void parseData() {
        title = "Mixed development";
        intro = "混合开发";
    }
}