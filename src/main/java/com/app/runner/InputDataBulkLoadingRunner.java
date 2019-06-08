package com.app.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("my.data")
public class InputDataBulkLoadingRunner implements ApplicationRunner {


	private int id;
	private String code;
	private double cost;
	private boolean enable;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public boolean isEnable() {
		return enable;
	}


	public void setEnable(boolean enable) {
		this.enable = enable;
	}


	@Override
	public String toString() {
		return "InputDataBulkLoadingRunner [id=" + id + ", code=" + code + ", cost=" + cost + ", enable=" + enable
				+ "]";
	}

	public void run(ApplicationArguments args) throws Exception {
		System.out.println(this);

	}

}
