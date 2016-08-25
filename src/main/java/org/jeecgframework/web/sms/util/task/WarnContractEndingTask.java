package org.jeecgframework.web.sms.util.task;

import org.jeecgframework.web.sms.service.TSSmsServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * 
 * @ClassName:WarnContractEndingTask 所有信息的发送定时任务类
 * @Description: TODO
 */
@Service("warnContractEndingTask")
public class WarnContractEndingTask {
	
	@Autowired
	private TSSmsServiceI tSSmsService;
	
	/*@Scheduled(cron="0 0/1 * * * ?")*/
	public void run() {
		long start = System.currentTimeMillis();
		org.jeecgframework.core.util.LogUtil.info("====检索合同到期时间与当前日期(<=15天)会发邮件通知 主管人员，确定是否续签劳动合同，并发邮件通知..定时任务开始===================");
		try {
			tSSmsService.send();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		org.jeecgframework.core.util.LogUtil.info("====检索合同到期时间与当前日期(<=15天)会发邮件通知 主管人员，确定是否续签劳动合同，并发邮件通知..定时任务结束===================");
		long end = System.currentTimeMillis();
		long times = end - start;
		org.jeecgframework.core.util.LogUtil.info("总耗时"+times+"毫秒");
	}
}
