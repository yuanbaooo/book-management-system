package net.jeeshop.services.front.keyvalue.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.keyvalue.bean.Keyvalue;
import net.jeeshop.services.front.keyvalue.dao.KeyvalueDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class KeyvalueDaoImpl implements KeyvalueDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Keyvalue e) {
		return dao.selectPageList("front.keyvalue.selectPageList",
				"front.keyvalue.selectPageCount", e);
	}

	public List selectList(Keyvalue e) {
		return dao.selectList("front.keyvalue.selectList", e);
	}

	public Keyvalue selectOne(Keyvalue e) {
		return (Keyvalue) dao.selectOne("front.keyvalue.selectOne", e);
	}

	public int delete(Keyvalue e) {
		return dao.delete("front.keyvalue.delete", e);
	}

	public int update(Keyvalue e) {
		return dao.update("front.keyvalue.update", e);
	}

	public int deletes(String[] ids) {
		Keyvalue e = new Keyvalue();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Keyvalue e) {
		return dao.insert("front.keyvalue.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.keyvalue.deleteById", id);
	}
	
	public Keyvalue selectById(String id) {
		return (Keyvalue) dao.selectOne("account.selectById", id);
	}
}
