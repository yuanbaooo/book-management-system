package net.jeeshop.services.manage.comment.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.catalog.bean.Catalog;
import net.jeeshop.services.manage.comment.bean.Comment;
import net.jeeshop.services.manage.comment.dao.CommentDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("commentDaoManage")
public class CommentDaoImpl implements CommentDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(Comment e) {
		return dao.selectPageList("manage.comment.selectPageList",
				"manage.comment.selectPageCount", e);
	}

	public List selectList(Comment e) {
		return dao.selectList("manage.comment.selectList", e);
	}

	public Comment selectOne(Comment e) {
		return (Comment) dao.selectOne("manage.comment.selectOne", e);
	}

	public int delete(Comment e) {
		return dao.delete("manage.comment.delete", e);
	}

	public int update(Comment e) {
		return dao.update("manage.comment.update", e);
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
		return dao.insert("manage.comment.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("manage.comment.deleteById", id);
	}

	public Comment selectById(String id) {
		return (Comment) dao.selectOne(id);
	}

	@Override
	public int selectNotReplyCount() {
		return (Integer) dao.selectOne("manage.comment.selectNotReplyCount");
	}

	@Override
	public void updateStatus(Comment c) {
		dao.update("manage.comment.updateStatus",c);
	}
}
