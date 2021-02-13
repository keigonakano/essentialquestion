package com.Essential.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@PropertySource("classpath:questionProperties/questionChapter8.properties")
@ConfigurationProperties(prefix = "8")
@Data
public class QuestionChapter8Config {
	//問題数
	private int count;
	//問題を変数として登録
	private String q1;
	private String q2;
	private String q3;
	private String q4;
	private String q5;
	private String q6;
	private String q7;
	private String q8;
	private String q9;
	private String q10;
	private String q11;
	private String q12;
	private String q13;
	private String q14;
	private String q15;
	private String q16;
	private String q17;
}
