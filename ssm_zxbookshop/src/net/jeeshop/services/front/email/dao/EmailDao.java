package net.jeeshop.services.front.email.dao;
import net.jeeshop.core.DaoManager;
import net.jeeshop.services.front.email.bean.Email;
public interface EmailDao extends DaoManager<Email> {

	void updateEmailInvalidWhenReg(Email email);
}
