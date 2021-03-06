package com.Essential.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@PropertySource("classpath:questionProperties/questionChapter3.properties")
@ConfigurationProperties(prefix = "3")
@Data
public class QuestionChapter3Config {
	//問題数
	private int count;
	//問題を変数として登録
}
