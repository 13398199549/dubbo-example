package org.framestudy.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_user",catalog="amoeba")
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3808776109005617132L;

	@Id
	@Column
	@GenericGenerator(name="hibernate.strategy",strategy="identity")
	@GeneratedValue(generator="hibernate.strategy")
	private Long id;
	
	@Column(name="user_name",length=20)
	private String userName;
	
	@Column(name="age")
	private Integer age;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String userName, Integer age) {
		super();
		this.userName = userName;
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", age=" + age + "]";
	}
}
