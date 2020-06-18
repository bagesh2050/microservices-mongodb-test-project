package com.test.demo.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "User")
@Getter
@Setter
@ToString
public class User {
	private static final long serialVersionUID = 1L;
	@Id
	@JsonIgnore
	private String id;
	private String login;
	private String password;
	@CreatedDate
	private LocalDateTime createdDate;
	@LastModifiedDate
	private LocalDateTime modifiedDate;
}
