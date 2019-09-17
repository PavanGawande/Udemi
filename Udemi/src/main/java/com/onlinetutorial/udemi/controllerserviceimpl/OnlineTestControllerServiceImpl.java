package com.onlinetutorial.udemi.controllerserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetutorial.udemi.beans.OnlineTestQuestionBean;
import com.onlinetutorial.udemi.model.Course;
import com.onlinetutorial.udemi.service.CourseService;
import com.onlinetutorial.udemi.service.OnlineTestService;
import com.onlinetutorial.udemicontrollerservice.OnlineTestControllerService;

@Service
public class OnlineTestControllerServiceImpl implements OnlineTestControllerService {

	@Autowired
	private OnlineTestService onlineTestService;
	
	@Autowired
	private CourseService courseService;
	
	public void saveQueAnsOptions(OnlineTestQuestionBean onlineTestQuestionBean) {
		
		onlineTestService.saveQueAnsOptions(onlineTestQuestionBean);
	}

	@Override
	public void saveQueAnsOptionsFromExcel(OnlineTestQuestionBean onlineTestQuestionBean) {
		
		onlineTestService.saveQueAnsOptionsFromExcel(onlineTestQuestionBean);
	}
	
	@Override
	public List<Course> getAllCources(){
		
		return courseService.getAllCources();
	}

	@Override
	public List<OnlineTestQuestionBean> getTestQuestionByTestType(Long testTypeId) {
		
		return onlineTestService.getTestQuestionByTestType(testTypeId);
	}
}
