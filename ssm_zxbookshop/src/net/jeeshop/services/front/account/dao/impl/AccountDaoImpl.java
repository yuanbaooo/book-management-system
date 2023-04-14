package net.jeeshop.services.front.account.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.account.bean.Account;
import net.jeeshop.services.front.account.dao.AccountDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("accountDaoFront")
public class AccountDaoImpl implements AccountDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Account e) {
		return dao.selectPageList("front.account.selectPageList",
				"front.account.selectPageCount", e);
	}

	public List selectList(Account e) {
		return dao.selectList("front.account.selectList", e);
	}

	public Account selectOne(Account e) {
		return (Account) dao.selectOne("front.account.selectOne", e);
	}

	public int delete(Account e) {
		return dao.delete("front.account.delete", e);
	}

	public int update(Account e) {
		return dao.update("front.account.update", e);
	}

	public int deletes(String[] ids) {
		Account e = new Account();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Account e) {
		return dao.insert("front.account.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.account.deleteById", id);
	}

	@Override
	public Account selectById(String id) {
		return (Account) dao.selectOne("front.account.selectById", id);
	}

	public int selectCount(Account e) {
		return dao.getCount("front.account.selectCount", e);
	}

	@Override
	public void updatePasswordByAccount(Account acc) {
		dao.update("front.account.updatePasswordByAccount",acc);		
	}

	@Override
	public void updateEmailByAccount(Account acc) {
		dao.update("front.account.updateEmailByAccount",acc);
	}

	@Override
	public Account selectAccountScore(String account) {
		return (Account) dao.selectOne("front.account.selectAccountScore",account);
	}

	@Override
	public void updateScore(Account acc) {
		dao.update("front.account.updateScore",acc);
	}
}
