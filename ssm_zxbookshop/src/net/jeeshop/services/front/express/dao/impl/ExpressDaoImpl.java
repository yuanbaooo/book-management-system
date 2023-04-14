package net.jeeshop.services.front.express.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.express.bean.Express;
import net.jeeshop.services.front.express.dao.ExpressDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("expressDaoFront")
public class ExpressDaoImpl implements ExpressDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Express e) {
		return dao.selectPageList("front.express.selectPageList",
				"front.express.selectPageCount", e);
	}

	public List selectList(Express e) {
		return dao.selectList("front.express.selectList", e);
	}

	public Express selectOne(Express e) {
		return (Express) dao.selectOne("front.express.selectOne", e);
	}

	public int delete(Express e) {
		return dao.delete("front.express.delete", e);
	}

	public int update(Express e) {
		return dao.update("front.express.update", e);
	}

	public int deletes(String[] ids) {
		Express e = new Express();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Express e) {
		return dao.insert("front.express.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.express.deleteById", id);
	}

	@Override
	public Express selectById(String id) {
		return (Express) dao.selectOne("front.express.selectById", id);
	}
}