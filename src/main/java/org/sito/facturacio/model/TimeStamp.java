package org.sito.facturacio.model;

import java.util.Date;

import lombok.Data;


@Data
public abstract class TimeStamp {
	public Date createDate;
	public Date modifiedDate;
	public User user;
}
