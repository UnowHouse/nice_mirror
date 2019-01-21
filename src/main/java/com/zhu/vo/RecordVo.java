package com.zhu.vo;

/*
 *  @项目名：  nicemirror 
 *  @包名：    com.zhu.vo
 *  @文件名:   RecordVo
 *  @创建者:   Unow
 *  @创建时间:  2018/11/30 11:03
 *  @描述：    TODO
 */
public class RecordVo {
    private String name;
    private Long beauty;
    private String gender;
    private Boolean show;
    private String imgData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBeauty() {
        return beauty;
    }

    public void setBeauty(Long beauty) {
        this.beauty = beauty;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public RecordVo() {
    }

    public RecordVo(String name, Long beauty, String gender, Boolean show, String imgData) {
        this.name = name;
        this.beauty = beauty;
        this.gender = gender;
        this.show = show;
        this.imgData = imgData;
    }

    public String getImgData() {
        return imgData;
    }

    public void setImgData(String imgData) {
        this.imgData = imgData;
    }

    @Override
    public String toString() {
        return "RecordVo{" +
                "name='" + name + '\'' +
                ", beauty=" + beauty +
                ", gender='" + gender + '\'' +
                ", show=" + show +
                '}';
    }
}
