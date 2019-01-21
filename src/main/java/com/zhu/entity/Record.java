package com.zhu.entity;

import java.util.Date;

/*
 *  @项目名：  nicemirror 
 *  @包名：    com.zhu.entity
 *  @文件名:   Record
 *  @创建者:   Unow
 *  @创建时间:  2018/11/30 8:55
 *  @描述：    TODO
 */
public class Record {
    private Long id;
    private String name;
    private String gender;
    private Long beauty;
    private Boolean isShow;
    private Date detectTime;
    private String faceFile;

    public String getfaceFile() {
        return faceFile;
    }

    public void setfaceFile(String faceFile) {
        this.faceFile = faceFile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getBeauty() {
        return beauty;
    }

    public void setBeauty(Long beauty) {
        this.beauty = beauty;
    }

    public Boolean getShow() {
        return isShow;
    }

    public void setShow(Boolean show) {
        isShow = show;
    }

    public Date getDetectTime() {
        return detectTime;
    }

    public void setDetectTime(Date detectTime) {
        this.detectTime = detectTime;
    }

    public Record() {
    }

    public Record(Long id, String name, String gender, Long beauty, Boolean isShow, Date detectTime, String face_file) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.beauty = beauty;
        this.isShow = isShow;
        this.detectTime = detectTime;
        this.faceFile = face_file;
    }
}
