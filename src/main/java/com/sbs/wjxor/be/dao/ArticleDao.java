package com.sbs.wjxor.be.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.wjxor.be.dto.Article;

@Mapper
public interface ArticleDao {
	List<Article> getArticles();
}
