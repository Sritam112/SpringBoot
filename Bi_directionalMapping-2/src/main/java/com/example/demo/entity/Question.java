package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public String getQuen() {
		return quen;
	}
	public void setQuen(String quen) {
		this.quen = quen;
	}
	public Answar getAw() {
		return aw;
	}
	public void setAw(Answar aw) {
		this.aw = aw;
	}
	@Id
	private Integer qid;
	@Column(name="Question")
	private String quen;
	@OneToOne
	@JoinColumn(name="ansid")
	private Answar aw;
	

}
