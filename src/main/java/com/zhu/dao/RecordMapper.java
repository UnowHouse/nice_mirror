package com.zhu.dao;

import com.zhu.entity.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 *  @项目名：  nicemirror 
 *  @包名：    com.zhu.dao
 *  @文件名:   RecordMapper
 *  @创建者:   Unow
 *  @创建时间:  2018/11/30 9:00
 *  @描述：    TODO
 */
public interface RecordMapper {
    void insertRecord(@Param("record") Record chart);
    List<Record> selectRecordsTopFive();

}
