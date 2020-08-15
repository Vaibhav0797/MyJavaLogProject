package com.log.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="log")
public class Log {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="log_id")
	private Long logId;
	
	@Column(name="logname",nullable=false)
	private String logname;

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public String getLogname() {
		return logname;
	}

	public void setLogname(String logname) {
		this.logname = logname;
	}
	
	
	
	
}

