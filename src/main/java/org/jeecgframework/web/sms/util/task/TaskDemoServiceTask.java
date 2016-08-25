package org.jeecgframework.web.sms.util.task;

import org.jeecgframework.web.sms.service.TSSmsServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * 
 * @ClassName:测试Demo
 * @Description: TODO
 * 
 */
@Service("taskDemoServiceTask")
public class TaskDemoServiceTask {
	
	@Autowired
	private TSSmsServiceI tSSmsService;
	
	/*@Scheduled(cron="0 0/1 * * * ?")*/
	public void run() {
		long start = System.currentTimeMillis();
		org.jeecgframework.core.util.LogUtil.info("===================测试Demo定时任务开始===================");
		try {
			tSSmsService.send();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		org.jeecgframework.core.util.LogUtil.info("===================测试Demo定时任务结束===================");
		long end = System.currentTimeMillis();
		long times = end - start;
		org.jeecgframework.core.util.LogUtil.info("总耗时"+times+"毫秒");
	}
}
