package org.sito.facturacio.model;

import lombok.Data;

@Data
public class ArticleLanguage {
	private Article article;
	private Language language;
	private String name;
	private String description;
}
