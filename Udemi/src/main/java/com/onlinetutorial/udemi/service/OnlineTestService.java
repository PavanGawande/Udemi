package com.onlinetutorial.udemi.service;

import com.onlinetutorial.udemi.beans.OnlineTestQuestionBean;

public interface OnlineTestService {
	
	public void saveQueAnsOptions(OnlineTestQuestionBean onlineTestQuestionBean);
	
	public void saveQueAnsOptionsFromExcel(OnlineTestQuestionBean onlineTestQuestionBean);

}
