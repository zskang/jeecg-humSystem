package org.jeecgframework.web.sms.util.task;

import java.util.List;
import java.util.Map;

import org.jeecgframework.web.sms.service.TSSmsServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeecg.empbaseinfo.entity.EmpBaseInfoEntity;
import com.jeecg.empbaseinfo.service.EmpBaseInfoServiceI;



/**
 * 
 * @ClassName:SendMsgForContractEndingTask 所有信息的发送定时任务类
 * @Description: TODO
 * 
 */
@Service("sendMsgForContractEndingTask")
public class SendMsgForContractEndingTask {
	
	@Autowired
	private TSSmsServiceI tSSmsService;
	
	@Autowired
	private EmpBaseInfoServiceI empBaseInfoService;
	
	
	/*@Scheduled(cron="0 0/1 * * * ?")*/
	public void run() {
		long start = System.currentTimeMillis();
		org.jeecgframework.core.util.LogUtil.info("========检索合同到期的，并发送信息给相关人员..定时任务开始===================");
		
		String sql="select * from ";
		Object objs = null;
		List<Map<String, Object>> empList=this.empBaseInfoService.findForJdbc(sql, objs);
		try {
			tSSmsService.send();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		org.jeecgframework.core.util.LogUtil.info("========检索合同到期的，并发送信息给相关人员..定时任务结束===================");
		long end = System.currentTimeMillis();
		long times = end - start;
		org.jeecgframework.core.util.LogUtil.info("总耗时"+times+"毫秒");
	}
}
