package com.vignesh.article;

import com.vignesh.article.model.Article;
import com.vignesh.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ArticleSpringBootApplication {

	@Autowired
	ArticleService articleService;

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ArticleSpringBootApplication.class, args);
		ArticleService articleService = applicationContext.getBean(ArticleService.class);

		//## Creating data and Inserting into Database ##
		Article insertArticle = new Article();
		insertArticle.setArticle_id(4);
		insertArticle.setArticle_name("Play Magazine");
		insertArticle.setArticle_type("Sports");
		insertArticle.setArticle_description("Information about international sports ");
		articleService.insertArticleService(insertArticle);

		//## Update the details in Database using ID ##
		Article updateArticle = new Article();
		updateArticle.setArticle_id(1);
		updateArticle.setArticle_name("Science news");
		updateArticle.setArticle_type("Technology");
		updateArticle.setArticle_description("Information about Science & Technology ");
		articleService.updateArticleService(updateArticle);

		//## Delete entire records in Database with id: 2##
		articleService.deleteArticleService(2);

		//## Display article with ID : 1 ##
		articleService.getArticleService(1);

		//## Display all articles from Database ##
		articleService.getAllArticlesService();

	}

}

