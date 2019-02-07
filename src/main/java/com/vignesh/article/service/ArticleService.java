package com.vignesh.article.service;

import com.vignesh.article.model.Article;

public interface ArticleService {

    public void insertArticleService(Article article);
    public void updateArticleService(Article article);
    public void deleteArticleService(Integer article_id);
    public void getArticleService(Integer article_id);
    public void getAllArticlesService();

}
