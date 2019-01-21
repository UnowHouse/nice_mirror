package com.zhu.service;

import com.zhu.dao.RecordMapper;
import com.zhu.entity.Record;
import com.zhu.myException.ExceptionEnum;
import com.zhu.myException.MyException;
import com.zhu.utils.ImgUtils;
import com.zhu.vo.RecordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.util.Date;
import java.util.List;

/*
 *  @项目名：  nicemirror 
 *  @包名：    com.zhu.service
 *  @文件名:   RecordService
 *  @创建者:   Unow
 *  @创建时间:  2018/11/30 10:41
 *  @描述：    TODO
 */
@Service
public class RecordService {
    @Value("${chart.path}")
    private String chartPath;
    @Value("${ImgStorage.extension}")
    private String extension;
    @Value("${chart.urlPath}")
    private String urlPath;
    @Autowired
    private RecordMapper recordMapper;


    public List<Record> queryTopFive() {
        List<Record> records = recordMapper.selectRecordsTopFive();
        if(CollectionUtils.isEmpty(records)){
            throw new MyException(ExceptionEnum.NOT_RECORD_FOUND);
        }
        return records;
    }

    public void saveRecord(RecordVo record) {
        File file = new File(chartPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        Record r = new Record();
        String filename = null;
        if (record.getShow()){
            filename = System.currentTimeMillis()+extension;

            ImgUtils.generateImage(record.getImgData(),chartPath + filename);
            r.setfaceFile(urlPath+filename);
        }
        r.setName(record.getName());
        r.setBeauty(record.getBeauty());
        r.setGender(record.getGender());
        r.setShow(record.getShow());
        r.setDetectTime(new Date());
        System.out.println(record);
        recordMapper.insertRecord(r);

    }
}
