package com.vignesh.article.jdbc.jdbcRepository;

import com.vignesh.article.jdbc.ArticleDao;
import com.vignesh.article.model.Article;
import com.vignesh.article.model.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class ArticleDaoImpl implements ArticleDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public static final String INSERT_QUERY = "INSERT INTO article(article_id,article_name,article_type,article_description) VALUES (?,?,?,?)";
    public static final String UPDATE_QUERY = "UPDATE article SET article_name = ?, article_type = ?, article_description = ? WHERE article_id = ?";
    public static final String DELETE_QUERY = "DELETE FROM article WHERE article_id = ?";
    public static final String SELECT_QUERY = "SELECT * FROM article WHERE article_id = ?";
    public static final String SELECT_ALL_QUERY = "SELECT * FROM article";


    @Override
    public int insertArticle(Article article) {
       int insertStatus = jdbcTemplate.update(INSERT_QUERY, new Object[]{
               article.getArticle_id(),
               article.getArticle_name(),
               article.getArticle_type(),
               article.getArticle_description()
       });
       return insertStatus;
    }

    @Override
    public int updateArticle(Article article) {
        int updateStatus = jdbcTemplate.update(UPDATE_QUERY, new Object[]{
                article.getArticle_name(),
                article.getArticle_type(),
                article.getArticle_description(),
                article.getArticle_id()
        });
        return updateStatus;
    }

    @Override
    public int deleteArticle(Integer article_id) {
        int deleteStatus = jdbcTemplate.update(DELETE_QUERY, article_id);
        return deleteStatus;
    }

    @Override
    public Article getArticle(Integer article_id) {
        Article selectStatus = jdbcTemplate.queryForObject(SELECT_QUERY, new Object[]{article_id}, new ArticleMapper());
        return selectStatus;
    }

    @Override
    public List<Article> getAllArticle() {
        List<Map<String, Object>> selectRows= jdbcTemplate.queryForList(SELECT_ALL_QUERY);

        List<Article> listArray = new ArrayList<Article>();
        for (Map<String, Object> rows : selectRows){
            Article article = new Article();
            article.setArticle_id((Integer) rows.get("article_id"));
            article.setArticle_name((String) rows.get("article_name"));
            article.setArticle_type((String) rows.get("article_type"));
            article.setArticle_description((String) rows.get("article_description"));
            listArray.add(article);
        }
        return listArray;
    }
}
