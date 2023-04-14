package net.jeeshop.services.front.comment.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.catalog.bean.Catalog;
import net.jeeshop.services.front.comment.bean.Comment;
import net.jeeshop.services.front.comment.dao.CommentDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("commentDaoFront")
public class CommentDaoImpl implements CommentDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Comment e) {
		return dao.selectPageList("front.comment.selectPageList",
				"front.comment.selectPageCount", e);
	}

	public List selectList(Comment e) {
		return dao.selectList("front.comment.selectList", e);
	}

	public Comment selectOne(Comment e) {
		return (Comment) dao.selectOne("front.comment.selectOne", e);
	}

	public int delete(Comment e) {
		return dao.delete("front.comment.delete", e);
	}

	public int update(Comment e) {
		return dao.update("front.comment.update", e);
	}

	public int deletes(String[] ids) {
		Comment e = new Comment();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(Comment e) {
		return dao.insert("front.comment.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.comment.deleteById", id);
	}
	
	public Comment selectById(String id) {
		return (Comment) dao.selectOne("front.comment.selectById", id);
	}

	@Override
	public int selectCount(String orderid) {
		return (Integer) dao.selectOne("front.comment.selectCount",orderid);
	}
}