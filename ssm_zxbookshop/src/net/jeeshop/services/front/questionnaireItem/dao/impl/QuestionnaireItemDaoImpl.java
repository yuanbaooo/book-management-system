package net.jeeshop.services.front.questionnaireItem.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.questionnaire.bean.Questionnaire;
import net.jeeshop.services.front.questionnaireItem.bean.QuestionnaireItem;
import net.jeeshop.services.front.questionnaireItem.dao.QuestionnaireItemDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class QuestionnaireItemDaoImpl implements QuestionnaireItemDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(QuestionnaireItem e) {
		return dao.selectPageList("front.questionnaireItem.selectPageList",
				"front.questionnaireItem.selectPageCount", e);
	}

	public List selectList(QuestionnaireItem e) {
		return dao.selectList("front.questionnaireItem.selectList", e);
	}

	public QuestionnaireItem selectOne(QuestionnaireItem e) {
		return (QuestionnaireItem) dao.selectOne("front.questionnaireItem.selectOne",
				e);
	}

	public int delete(QuestionnaireItem e) {
		return dao.delete("front.questionnaireItem.delete", e);
	}

	public int update(QuestionnaireItem e) {
		return dao.update("front.questionnaireItem.update", e);
	}

	public int deletes(String[] ids) {
		QuestionnaireItem e = new QuestionnaireItem();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(QuestionnaireItem e) {
		return dao.insert("front.questionnaireItem.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.questionnaireItem.deleteById", id);
	}
	
	@Override
	public QuestionnaireItem selectById(String id) {
		return (QuestionnaireItem) dao.selectOne("front.questionnaireItem.selectById", id);
	}

	@Override
	public int uniqeItem(QuestionnaireItem questionnaireItem) {
		return (Integer) dao.selectOne("front.questionnaireItem.uniqeItem", questionnaireItem);
	}
}
