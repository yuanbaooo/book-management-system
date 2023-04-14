package net.jeeshop.services.manage.systemlog.dao;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.manage.systemlog.bean.Systemlog;

public interface SystemlogDao extends DaoManager<Systemlog> {

	Systemlog selectFirstOne(String account);
}