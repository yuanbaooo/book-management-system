package net.jeeshop.services.front.attribute_link.dao;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.front.attribute_link.bean.Attribute_link;

public interface Attribute_linkDao extends DaoManager<Attribute_link> {

	/**
	 * @param e
	 * @return
	 */
	int deleteByCondition(Attribute_link e);
}
