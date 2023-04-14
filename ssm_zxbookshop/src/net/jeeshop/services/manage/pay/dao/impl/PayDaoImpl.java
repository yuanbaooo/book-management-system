package net.jeeshop.services.manage.pay.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.pay.bean.Pay;
import net.jeeshop.services.manage.pay.dao.PayDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("payDaoManage")
public class PayDaoImpl implements PayDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Pay e) {
		return dao.selectPageList("manage.pay.selectPageList", "manage.pay.selectPageCount",
				e);
	}

	public List selectList(Pay e) {
		return dao.selectList("manage.pay.selectList", e);
	}

	public Pay selectOne(Pay e) {
		return (Pay) dao.selectOne("manage.pay.selectOne", e);
	}

	public int delete(Pay e) {
		return dao.delete("manage.pay.delete", e);
	}

	public int update(Pay e) {
		return dao.update("manage.pay.update", e);
	}

	public int deletes(String[] ids) {
		Pay e = new Pay();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Pay e) {
		return dao.insert("manage.pay.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.pay.deleteById", id);
	}

	@Override
	public Pay selectById(String id) {
		return (Pay) dao.selectOne("manage.pay.selectById", id);
	}
}
