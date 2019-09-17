package com.onlinetutorial.udemicontrollerservice;

import java.util.List;

import com.onlinetutorial.udemi.beans.OnlineTestQuestionBean;
import com.onlinetutorial.udemi.model.Course;

public interface OnlineTestControllerService{
	
	public void saveQueAnsOptions(OnlineTestQuestionBean onlineTestQuestionBean);
	
	public void saveQueAnsOptionsFromExcel(OnlineTestQuestionBean onlineTestQuestionBean);

	public List<Course> getAllCources();
	
	public List<OnlineTestQuestionBean> getTestQuestionByTestType(Long testTypeId);

}
