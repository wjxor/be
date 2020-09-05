package com.sbs.wjxor.be.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sbs.wjxor.be.dto.Article;

@Mapper
public interface ArticleDao {
	List<Article> getArticles(Map<String, Object> param);

	Article getArticle(@Param("id") int id);

	void addArticle(Map<String, Object> param);
}
