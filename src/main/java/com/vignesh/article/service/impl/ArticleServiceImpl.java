package com.vignesh.article.service.impl;

import com.vignesh.article.jdbc.ArticleDao;
import com.vignesh.article.model.Article;
import com.vignesh.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;

    @Override
    public void insertArticleService(Article article) {
        try{
            int insertStatus = articleDao.insertArticle(article);
            if(insertStatus == 1)
                System.out.println("Article with ID : "+ article.getArticle_id()+" inserted into Database Successfully.");
            else
                System.out.println("Failed to insert Article");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateArticleService(Article article) {
        try{
            int updateStatus = articleDao.updateArticle(article);
            if(updateStatus == 1)
                System.out.println("Article with ID : "+ article +" updated Successfully.");
            else
                System.out.println("Failed to update Article");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteArticleService(Integer article_id) {
        try{
            int updateStatus = articleDao.deleteArticle(article_id);
            if(updateStatus == 1)
                System.out.println("Article with ID : "+ article_id +" has been Deleted");
            else
                System.out.println("Failed to Delete Article");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getArticleService(Integer article_id) {
        try{
            Article viewArticle = articleDao.getArticle(article_id);
            if(viewArticle != null)
                System.out.println(viewArticle);
            else
                System.out.println("Failed to fetch Article");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getAllArticlesService() {
        try {
            List<Article> allArticle = articleDao.getAllArticle();
            for (Article article : allArticle){
                System.out.println(article);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
