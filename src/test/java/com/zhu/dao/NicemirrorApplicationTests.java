package com.zhu.dao;

import com.zhu.entity.Record;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NicemirrorApplicationTests {
	@Autowired
	private RecordMapper chartMapper;
	@Test
	public void contextLoads() {
		Record chart = new Record();
		chart.setBeauty(new Long(2000));
		chart.setGender("男");
		chart.setName("呵呵");
		chart.setShow(false);
		chart.setDetectTime(new Date());
		chartMapper.insertRecord(chart);
	}

}
