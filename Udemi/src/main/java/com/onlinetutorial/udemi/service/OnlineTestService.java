package com.onlinetutorial.udemi.service;

import java.util.List;

import com.onlinetutorial.udemi.beans.OnlineTestQuestionBean;

public interface OnlineTestService {
	
	public void saveQueAnsOptions(OnlineTestQuestionBean onlineTestQuestionBean);
	
	public void saveQueAnsOptionsFromExcel(OnlineTestQuestionBean onlineTestQuestionBean);
	
	public List<OnlineTestQuestionBean> getTestQuestionByTestType(Long testTypeId);

}
