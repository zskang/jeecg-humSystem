package com.jeecg.service.impl.emppaymentinfo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeecg.service.emppaymentinfo.EmpPaymentInfoServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("empPaymentInfoService")
@Transactional
public class EmpPaymentInfoServiceImpl extends CommonServiceImpl implements EmpPaymentInfoServiceI {
	
}