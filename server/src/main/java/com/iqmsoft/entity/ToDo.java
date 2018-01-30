package com.iqmsoft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "todos")
public class ToDo {
	
	/**
	 * Unique id for TODO
	 */
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * Flag  for TODO's completion state.
	 */
	private Boolean completed;
	
	/**
	 * Title of TODO
	 */
	private String title;
	
	public ToDo() {
		super();
	}
	
	public ToDo(String title) {
		super();
		this.title = title;
	}
	
	public ToDo(Boolean completed, String title) {
		super();
		this.title = title;
		this.completed = completed;
	}
	
	public ToDo(Long id, Boolean completed, String title) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "[id: " + this.id + " title: " + this.title + " completed: " + this.completed + "]";
	}

}


