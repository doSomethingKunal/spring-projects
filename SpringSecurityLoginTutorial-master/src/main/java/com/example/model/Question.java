package com.example.model;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger _id;
	private String qTopic;
	private String qStatement;
	private List<AnswerChoice> answerChoices;
	private AnswerTip answerTip;

	public BigInteger get_id() {
		return _id;
	}

	public void set_id(BigInteger _id) {
		this._id = _id;
	}

	public String getqTopic() {
		return qTopic;
	}

	public void setqTopic(String qTopic) {
		this.qTopic = qTopic;
	}

	public String getqStatement() {
		return qStatement;
	}

	public void setqStatement(String qStatement) {
		this.qStatement = qStatement;
	}

	public List<AnswerChoice> getAnswerChoices() {
		return answerChoices;
	}

	public void setAnswerChoices(List<AnswerChoice> answerChoices) {
		this.answerChoices = answerChoices;
	}

	public AnswerTip getAnswerTip() {
		return answerTip;
	}

	public void setAnswerTip(AnswerTip answerTip) {
		this.answerTip = answerTip;
	}
}
