package com.zhu.utils;

import com.baidu.aip.face.AipFace;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class BaiduDetect {


    public static JSONObject clientApi(String appId,String apiKey,String secretKey,String imgData) {
        AipFace client = new AipFace(appId, apiKey, secretKey);
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(100000);
        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        System.setProperty("aip.log4j.conf", "log4j.properties");
        return sample(imgData,client);


    }
    public static JSONObject sample(String imgData,AipFace client) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("face_field", "age,beauty,gender");
        options.put("max_face_num", "1");
        options.put("face_type", "LIVE");

        String imageType = "BASE64";

        // 人脸检测
        JSONObject res = client.detect(imgData, imageType, options);
        System.out.println(res.toString(2));
        Map obj = res.toMap();
        return res;

    }

}
