//package net.jeeshop.web.action.manage.questionnaireResult;
//
//import net.jeeshop.core.BaseAction;
//import net.jeeshop.services.manage.questionnaireResult.QuestionnaireResultService;
//import net.jeeshop.services.manage.questionnaireResult.bean.QuestionnaireResult;
//
//public class QuestionnaireResultAction extends BaseAction<QuestionnaireResult> {
//	private static final long serialVersionUID = 1L;
//	private QuestionnaireResultService questionnaireResultService;
//
//	public QuestionnaireResultService getQuestionnaireResultService() {
//		return questionnaireResultService;
//	}
//
//	protected void selectListAfter() {
//		pager.setPagerUrl("questionnaireResult!selectList.action");
//	}
//
//	public void setQuestionnaireResultService(
//			QuestionnaireResultService questionnaireResultService) {
//		this.questionnaireResultService = questionnaireResultService;
//	}
//
//	public QuestionnaireResult getE() {
//		return this.e;
//	}
//
//	public void prepare() throws Exception {
//		if (this.e == null) {
//			this.e = new QuestionnaireResult();
//		}
//	}
//
//	public void insertAfter(QuestionnaireResult e) {
//		e.clear();
//	}
//}
