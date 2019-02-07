package com.vignesh.article.model;

public class Article {
    Integer article_id;
    String article_name;
    String article_type;
    String article_description;

    public Article(Integer article_id, String article_name, String article_type, String article_description) {
        this.article_id = article_id;
        this.article_name = article_name;
        this.article_type = article_type;
        this.article_description = article_description;
    }

    public Article() {

    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public String getArticle_name() {
        return article_name;
    }

    public void setArticle_name(String article_name) {
        this.article_name = article_name;
    }

    public String getArticle_type() {
        return article_type;
    }

    public void setArticle_type(String article_type) {
        this.article_type = article_type;
    }

    public String getArticle_description() {
        return article_description;
    }

    public void setArticle_description(String article_description) {
        this.article_description = article_description;
    }

    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + article_id +
                ", article_name='" + article_name + '\'' +
                ", article_type='" + article_type + '\'' +
                ", article_description='" + article_description + '\'' +
                '}';
    }
}
