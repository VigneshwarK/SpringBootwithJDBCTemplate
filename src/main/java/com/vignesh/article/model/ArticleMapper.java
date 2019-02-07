package com.vignesh.article.model;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleMapper implements RowMapper<Article> {
    @Override
    public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
        Article article = new Article();
        article.setArticle_id(rs.getInt("article_id"));
        article.setArticle_name(rs.getString("article_name"));
        article.setArticle_type(rs.getString("article_type"));
        article.setArticle_description(rs.getString("article_description"));
        return article;
    }
}
