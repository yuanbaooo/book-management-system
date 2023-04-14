package net.jeeshop.services.manage.navigation.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.navigation.bean.Navigation;
import net.jeeshop.services.manage.navigation.dao.NavigationDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("navigationDaoManage")
public class NavigationDaoImpl implements NavigationDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Navigation e) {
		return dao.selectPageList("manage.navigation.selectPageList",
				"manage.navigation.selectPageCount", e);
	}

	public List selectList(Navigation e) {
		return dao.selectList("manage.navigation.selectList", e);
	}

	public Navigation selectOne(Navigation e) {
		return (Navigation) dao.selectOne("manage.navigation.selectOne", e);
	}

	public int delete(Navigation e) {
		return dao.delete("manage.navigation.delete", e);
	}

	public int update(Navigation e) {
		return dao.update("manage.navigation.update", e);
	}

	public int deletes(String[] ids) {
		Navigation e = new Navigation();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Navigation e) {
		return dao.insert("manage.navigation.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.navigation.deleteById", id);
	}

	public Navigation selectById(String id) {
		return (Navigation) dao.selectOne(id);
	}
}
