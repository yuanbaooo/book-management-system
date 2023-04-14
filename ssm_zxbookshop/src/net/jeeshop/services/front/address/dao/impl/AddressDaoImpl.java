package net.jeeshop.services.front.address.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.address.bean.Address;
import net.jeeshop.services.front.address.dao.AddressDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("addressDaoFront")
public class AddressDaoImpl implements AddressDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Address e) {
		return dao.selectPageList("front.address.selectPageList",
				"front.address.selectPageCount", e);
	}

	public List selectList(Address e) {
		return dao.selectList("front.address.selectList", e);
	}

	public Address selectOne(Address e) {
		return (Address) dao.selectOne("front.address.selectOne", e);
	}

	public int delete(Address e) {
		return dao.delete("front.address.deleteById", e);
	}

	public int update(Address e) {
		return dao.update("front.address.update", e);
	}

	public int deletes(String[] ids) {
		Address e = new Address();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Address e) {
		return dao.insert("front.address.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.address.deleteById", id);
	}

	public Address selectById(String id) {
		return (Address) dao.selectOne("front.address.selectById", id);
	}

	@Override
	public void initAllAddress(Address address) {
		dao.update("front.address.initAllAddress",address);
	}
}
