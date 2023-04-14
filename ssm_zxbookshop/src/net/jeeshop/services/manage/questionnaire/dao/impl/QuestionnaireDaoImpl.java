package net.jeeshop.services.manage.questionnaire.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.questionnaire.bean.Questionnaire;
import net.jeeshop.services.manage.questionnaire.dao.QuestionnaireDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("questionnaireDaoManage")
public class QuestionnaireDaoImpl implements QuestionnaireDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Questionnaire e) {
		return dao.selectPageList("manage.questionnaire.selectPageList",
				"manage.questionnaire.selectPageCount", e);
	}

	public List selectList(Questionnaire e) {
		return dao.selectList("manage.questionnaire.selectList", e);
	}

	public Questionnaire selectOne(Questionnaire e) {
		return (Questionnaire) dao.selectOne("manage.questionnaire.selectOne", e);
	}

	public int delete(Questionnaire e) {
		return dao.delete("manage.questionnaire.delete", e);
	}

	public int update(Questionnaire e) {
		return dao.update("manage.questionnaire.update", e);
	}

	public int deletes(String[] ids) {
		Questionnaire e = new Questionnaire();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Questionnaire e) {
		return dao.insert("manage.questionnaire.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.questionnaire.deleteById", id);
	}

	@Override
	public Questionnaire selectById(String id) {
		return (Questionnaire) dao.selectOne("manage.questionnaire.selectById", id);
	}
}