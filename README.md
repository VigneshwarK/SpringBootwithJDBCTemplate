Project : SpringBoot with JDBCTemplate

## Components ## 
Classes : POJO, Mapper, DAO-Implementation(@Repository), ArticleServiceImplementation(@Service), ArticleSpringBootApplication(@SpringBootApplication)
Interface : DAO(JDBC), Service

Database : MySQL
Database : demo
Table name : articles

+---------------------+--------------+------+-----+---------+-------+
| Field               | Type         | Null | Key | Default | Extra |
+---------------------+--------------+------+-----+---------+-------+
| article_id          | int(25)      | NO   | PRI | NULL    |       |
| article_name        | varchar(100) | YES  |     | NULL    |       |
| article_type        | varchar(50)  | YES  |     | NULL    |       |
| article_description | varchar(100) | YES  |     | NULL    |       |
+---------------------+--------------+------+-----+---------+-------+

