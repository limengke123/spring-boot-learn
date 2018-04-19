package com.didispace;

import com.didispace.service.BlogProperties;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
public class Chapter1ApplicationTests {

	private static final Log log = LogFactory.getLog(Chapter1Application.class);

	@Autowired
	private BlogProperties blogProperties;

	@Test
	public void main() throws Exception {
		Assert.assertEquals("这是name",blogProperties.getName());
		Assert.assertEquals("spring 学习",blogProperties.getTitle());
		Assert.assertEquals("这是name正在努力写《spring 学习》",blogProperties.getDesc());

		log.info("随机数测试输出：");
		log.info("随机字符串 : " + blogProperties.getValue());
		log.info("随机int : " + blogProperties.getNumber());
		log.info("随机long : " + blogProperties.getBignumber());
		log.info("随机10以下 : " + blogProperties.getTest1());
		log.info("随机10-20 : " + blogProperties.getTest2());
	}

}
