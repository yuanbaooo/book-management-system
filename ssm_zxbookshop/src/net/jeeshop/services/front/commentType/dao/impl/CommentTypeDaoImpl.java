package net.jeeshop.services.front.commentType.dao.impl;

import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.front.commentType.bean.CommentType;
import net.jeeshop.services.front.commentType.dao.CommentTypeDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("commentTypeDaoFront")
public class CommentTypeDaoImpl implements CommentTypeDao {
    @Resource
	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	public PagerModel selectPageList(CommentType e) {
		return dao.selectPageList("front.commentType.selectPageList",
				"front.commentType.selectPageCount", e);
	}

	public List selectList(CommentType e) {
		return dao.selectList("front.commentType.selectList", e);
	}

	public CommentType selectOne(CommentType e) {
		return (CommentType) dao.selectOne("front.commentType.selectOne", e);
	}

	public int delete(CommentType e) {
		return dao.delete("front.commentType.delete", e);
	}

	public int update(CommentType e) {
		return dao.update("front.commentType.update", e);
	}

	public int deletes(String[] ids) {
		CommentType e = new CommentType();
		for (int i = 0; i < ids.length; i++) {
			e.setId(ids[i]);
			delete(e);
		}
		return 0;
	}

	public int insert(CommentType e) {
		return dao.insert("front.commentType.insert", e);
	}

	public int deleteById(int id) {
		return dao.delete("front.commentType.deleteById", id);
	}

	@Override
	public CommentType selectById(String id) {
		return (CommentType) dao.selectOne("front.commentType.selectById", id);
	}
}
