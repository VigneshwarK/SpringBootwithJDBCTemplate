package com.vignesh.article.jdbc;

import com.vignesh.article.model.Article;

import java.util.List;

public interface ArticleDao {

    public int insertArticle(Article article);
    public int updateArticle(Article article);
    public int deleteArticle(Integer article_id);
    public Article getArticle(Integer article_id);
    public List<Article> getAllArticle();
}
