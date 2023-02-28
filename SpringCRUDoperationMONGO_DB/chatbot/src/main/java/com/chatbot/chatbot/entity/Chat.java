package com.chatbot.chatbot.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Data

public class Chat {
	@Id
//	private long count;
	private String question;
	private String answer;
	

}
