package com.jeecg.service.impl.sixdata;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeecg.service.sixdata.SixDataServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("sixDataService")
@Transactional
public class SixDataServiceImpl extends CommonServiceImpl implements SixDataServiceI {
	
}