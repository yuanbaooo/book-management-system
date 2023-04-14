package net.jeeshop.services.common;

import java.io.Serializable;

import net.jeeshop.core.dao.page.PagerModel;

public class Express extends PagerModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String code;
	private String name;
	private double fee;
	private int order1;

	public void clear() {
		super.clear();
		id = null;
		code = null;
		name = null;
		fee = 0;
		order1 = 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getOrder1() {
		return order1;
	}

	public void setOrder1(int order1) {
		this.order1 = order1;
	}
}
