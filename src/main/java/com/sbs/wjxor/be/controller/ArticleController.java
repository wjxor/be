package com.sbs.wjxor.be.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.wjxor.be.dto.Article;
import com.sbs.wjxor.be.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@RequestMapping("/usr/article/getList")
	@ResponseBody
	public List<Article> getList() {
		List<Article> articles = articleService.getArticles();
		return articles;
	}
}
