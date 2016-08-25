package org.jeecgframework.web.sms.util.task;

import org.jeecgframework.web.sms.service.TSSmsServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * 
 * @ClassName:WarnContractEndedTask 所有信息的发送定时任务类
 * @Description: TODO
 * 
 */
@Service("warnContractEndedTask")
public class WarnContractEndedTask {
	
	@Autowired
	private TSSmsServiceI tSSmsService;
	
	/*@Scheduled(cron="0 0/1 * * * ?")*/
	public void run() {
		long start = System.currentTimeMillis();
		org.jeecgframework.core.util.LogUtil.info("====扫描库中 员工劳动合同到期员工仍未续签合同者 然后发邮件给部门主管..定时任务开始===================");
		try {
			tSSmsService.send();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		org.jeecgframework.core.util.LogUtil.info("====扫描库中 员工劳动合同到期员工仍未续签合同者 然后发邮件给部门主管..定时任务结束===================");
		long end = System.currentTimeMillis();
		long times = end - start;
		org.jeecgframework.core.util.LogUtil.info("总耗时"+times+"毫秒");
	}
}
