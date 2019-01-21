package com.zhu.service;

import com.zhu.config.BaiduProperties;
import com.zhu.myException.ExceptionEnum;
import com.zhu.myException.MyException;
import com.zhu.utils.BaiduDetect;
import com.zhu.utils.ImgUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.Map;

/*
 *  @项目名：  nicemirror 
 *  @包名：    com.zhu.service
 *  @文件名:   DetectService
 *  @创建者:   Unow
 *  @创建时间:  2018/11/19 10:32
 *  @描述：    TODO
 */
@Service
@EnableConfigurationProperties(BaiduProperties.class)
public class DetectService {
    @Autowired
    private BaiduProperties baiduProperties;

    @Value("${ImgStorage.path}")
    private String savePath;
    @Value("${ImgStorage.extension}")
    private String extension;

    public Map<String,Object> detectImg(String imgdata){

        if(imgdata==null)
            throw new MyException(ExceptionEnum.FILE_IS_NULL);

        Map<String, Object> stringObjectMap = BaiduDetect.clientApi(baiduProperties.getAppId(),
                baiduProperties.getApiKey(),baiduProperties.getSecretKey(),imgdata).toMap();

        if(stringObjectMap.get("error_msg").equals("SUCCESS")){
            ImgUtils.generateImage(imgdata,savePath+System.currentTimeMillis()+extension);
            //存入数据库
        }

        return stringObjectMap;
    }
}
