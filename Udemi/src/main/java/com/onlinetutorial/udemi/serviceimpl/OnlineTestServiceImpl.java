package com.onlinetutorial.udemi.serviceimpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetutorial.udemi.beans.OnlineTestQuestionBean;
import com.onlinetutorial.udemi.dao.OnlineTestQuestionDao;
import com.onlinetutorial.udemi.dao.TestTypeRepo;
import com.onlinetutorial.udemi.model.OnlineTestQuestion;
import com.onlinetutorial.udemi.model.QuestionOption;
import com.onlinetutorial.udemi.model.TestType;
import com.onlinetutorial.udemi.service.OnlineTestService;

@Service
public class OnlineTestServiceImpl implements OnlineTestService {

	@Autowired
	private OnlineTestQuestionDao onlineTestQuestionDao;
	/*
	 * @Autowired private CurrentUser currentUser;
	 */
	@Autowired 
	private TestTypeRepo testTypeRepo;

	@Override
	public void saveQueAnsOptions(OnlineTestQuestionBean onlineTestQuestionBean) {
		
		OnlineTestQuestion question = new OnlineTestQuestion();
		Optional<TestType> testType = testTypeRepo.findByTestTypeId(Long.parseLong(onlineTestQuestionBean.getTestType().trim()));
		QuestionOption option ;
		List<QuestionOption> optionLst = new ArrayList<>();
		
		/* Setting TestType data START */
		question.setTestType(testType.get());
		/* Setting TestType data START */
		question.setQuestion(onlineTestQuestionBean.getQuestion());
		int answerindex = 0;
		int ansBeanLstSize = onlineTestQuestionBean.getAnswer().size();
		for(String opt : onlineTestQuestionBean.getOptions()) {
			
			option = new QuestionOption();
			option.setMcq(opt);
			
			//we are getting max list = last checkbox number...
			//to handle this we apply check to avoid outof bound exception.
			if(ansBeanLstSize > answerindex) {
				option.setIsAnswer(onlineTestQuestionBean.getAnswer().get(answerindex));
			}
		
			
			option.setQuestion(question);
			
			optionLst.add(option);
			answerindex++;
		}
		/* question.setEnterByUser(); */
		question.setEnterDate(new Date());
		question.setOptions(optionLst);
		
		onlineTestQuestionDao.save(question);
		
		
	}

	@Override
	public void saveQueAnsOptionsFromExcel(OnlineTestQuestionBean onlineTestQuestionBean) {
	
		String fileExtesion = FilenameUtils.getExtension(onlineTestQuestionBean.getFiles().getOriginalFilename());
		
		Workbook workbook = null;
		if (fileExtesion.equals("xlsx")) {

			try {

				workbook = new XSSFWorkbook(onlineTestQuestionBean.getFiles().getInputStream());

			} catch (IOException e) {

				e.printStackTrace();
			}
		} else if (fileExtesion.equals("xls")) {

			try {

				workbook = new HSSFWorkbook(onlineTestQuestionBean.getFiles().getInputStream());

			} catch (IOException e) {

				e.printStackTrace();
			}
			
		}
	
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rows= sheet.iterator();
	
		OnlineTestQuestion onlineTestQuestion = null ;
		QuestionOption questionOption = null ;
		List<QuestionOption> questionOptionList = null ;
	//	List<OnlineTestQuestion> onlineTestQuestionsList = new ArrayList<OnlineTestQuestion>();
		
		String[] priNextque = new String[2];
		
		while(rows.hasNext()) {
	
			String question = null ;
			String option = null;
			String answer = null;
			String saveQuestion = null;
			
			Row row = rows.next();
			
			
			if(row.getCell(0) != null) {
				
				  question = row.getCell(0).getStringCellValue();
				  onlineTestQuestion = new OnlineTestQuestion();
				  questionOptionList = new ArrayList<QuestionOption>(); 

			}
			if(row.getCell(1) != null) {
				
				 option = row.getCell(1).getStringCellValue();
				 questionOption = new QuestionOption();
			}
			if(row.getCell(2) != null) {
				
				 answer = row.getCell(2).getStringCellValue();

				
			}
			
			if(question != null) {
				
				onlineTestQuestion.setQuestion(question);
				
				questionOption.setMcq(option);
				questionOption.setQuestion(onlineTestQuestion);
				
				if(answer != null) {
					
					questionOption.setIsAnswer(answer);
					
				}
				
				questionOptionList.add(questionOption);
				
				onlineTestQuestion.setOptions(questionOptionList);
				
			}else if(question == null) {
				
				questionOption.setMcq(option);
				questionOption.setQuestion(onlineTestQuestion);
				
				if(answer != null) {
					
					questionOption.setIsAnswer(answer);
					
				}
				
				questionOptionList.add(questionOption);
				
				onlineTestQuestion.setOptions(questionOptionList);
				
			}	
		   Row  nextRow = sheet.getRow(row.getRowNum() + 1);
			
			if(sheet.getLastRowNum() == row.getRowNum() ||  nextRow.getCell(0) !=null) {
				
				onlineTestQuestionDao.save(onlineTestQuestion);
			}
			
		}
		
	}

	@Override
	public List<OnlineTestQuestionBean> getTestQuestionByTestType(Long testTypeId) {

		Optional<TestType> testtype = testTypeRepo.findById(testTypeId);

		List<OnlineTestQuestion> OnlineTestQuestionLst = onlineTestQuestionDao.findByTestType(testtype);
		return null;
	}

}
