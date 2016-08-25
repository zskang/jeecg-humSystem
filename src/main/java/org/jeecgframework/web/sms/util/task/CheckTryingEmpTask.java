package org.jeecgframework.web.sms.util.task;

import org.jeecgframework.web.sms.service.TSSmsServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * 
 * @ClassName:CheckTryingEmpTask 所有信息的发送定时任务类
 * @Description: TODO
 * 
 */
@Service("checkTryingEmpTask")
public class CheckTryingEmpTask {
	
	@Autowired
	private TSSmsServiceI tSSmsService;
	
	/*@Scheduled(cron="0 0/1 * * * ?")*/
	public void run() {
		long start = System.currentTimeMillis();
		org.jeecgframework.core.util.LogUtil.info("===检测试用期员工的转正日期是否与当前日期差值15天，如果小于 则发通知信息de定时任务开始===================");
		try {
			tSSmsService.send();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		org.jeecgframework.core.util.LogUtil.info("===检测试用期员工的转正日期是否与当前日期差值15天，如果小于 则发通知信息de定时任务结束===================");
		long end = System.currentTimeMillis();
		long times = end - start;
		org.jeecgframework.core.util.LogUtil.info("总耗时"+times+"毫秒");
	}
}
