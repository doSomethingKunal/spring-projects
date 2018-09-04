package com.example.model;

import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.Indexed;

public class AnswerChoice {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger _id;
	private String cStatement;
	private boolean isCorrect;
	private boolean isAnsChecked;
	
	public boolean isAnsChecked() {
		return isAnsChecked;
	}
	public void setAnsChecked(boolean isAnsChecked) {
		this.isAnsChecked = isAnsChecked;
	}
	public BigInteger get_id() {
		return _id;
	}
	public void set_id(BigInteger _id) {
		this._id = _id;
	}
	public String getcStatement() {
		return cStatement;
	}
	public void setcStatement(String cStatement) {
		this.cStatement = cStatement;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
}
