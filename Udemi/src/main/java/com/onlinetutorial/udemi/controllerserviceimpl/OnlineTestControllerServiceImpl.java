package com.onlinetutorial.udemi.controllerserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetutorial.udemi.beans.OnlineTestQuestionBean;
import com.onlinetutorial.udemi.model.TestType;
import com.onlinetutorial.udemi.service.OnlineTestService;
import com.onlinetutorial.udemi.service.TestTypeService;
import com.onlinetutorial.udemicontrollerservice.OnlineTestControllerService;

@Service
public class OnlineTestControllerServiceImpl implements OnlineTestControllerService {

	@Autowired
	private OnlineTestService onlineTestService;
	
	@Autowired
	private TestTypeService testTypeService;
	
	public void saveQueAnsOptions(OnlineTestQuestionBean onlineTestQuestionBean) {
		
		onlineTestService.saveQueAnsOptions(onlineTestQuestionBean);
	}

	@Override
	public void saveQueAnsOptionsFromExcel(OnlineTestQuestionBean onlineTestQuestionBean) {
		
		onlineTestService.saveQueAnsOptionsFromExcel(onlineTestQuestionBean);
	}
	
	@Override
	public List<TestType> getAllTestType(){
		
		return testTypeService.getAllTestType();
	}
}
