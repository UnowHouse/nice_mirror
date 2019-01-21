package com.zhu.controller;

import com.zhu.entity.Record;
import com.zhu.service.DetectService;
import com.zhu.service.RecordService;
import com.zhu.vo.RecordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/*
 *  @项目名：  nicemirror
 *  @包名：    com.zhu.controller
 *  @文件名:   testController
 *  @创建者:   Unow
 *  @创建时间:  2018/10/28 14:46
 *  @描述：    TODO
 */
@RestController
@RequestMapping("api")
public class MainController {

    @Autowired
    private DetectService detectService;
    @Autowired
    private RecordService recordService;

    @RequestMapping(value = "/detect",method = RequestMethod.POST)
    public ResponseEntity<Map<String,Object>> detectFace(
            @RequestParam(value="imgdata")String imgdata) throws IOException {
        return ResponseEntity.ok(detectService.detectImg(imgdata));
    }

    @RequestMapping(value="/record",method = RequestMethod.POST)
    public ResponseEntity<Void> saveRecord(@RequestBody RecordVo record){

        recordService.saveRecord(record);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @RequestMapping(value="/chart",method = RequestMethod.GET)
    public ResponseEntity<List<Record>> getChart(){
        return ResponseEntity.ok(recordService.queryTopFive());
    }

    @RequestMapping(value="/test_demo",method = RequestMethod.POST)
    public ResponseEntity<String> test_demo(){
        return ResponseEntity.ok("hello");
    }
}
