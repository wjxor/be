package com.sbs.wjxor.be.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.wjxor.be.dto.Article;
import com.sbs.wjxor.be.dto.ResultData;
import com.sbs.wjxor.be.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	@RequestMapping("/usr/article/getArticles")
	@ResponseBody
	public ResultData getArticles(@RequestParam Map<String, Object> param) {
		if (param.get("limit") != null) {
			int limit = Integer.parseInt((String) param.get("limit"));
			param.put("limit", limit);
			param.put("limitFrom", 0);
		}

		if (param.get("page") != null) {
			int page = Integer.parseInt((String) param.get("page"));
			int limit = 10;
			int limitFrom = (page - 1) * limit;
			param.put("limit", limit);
			param.put("limitFrom", limitFrom);
		}

		List<Article> articles = articleService.getArticles(param);

		return new ResultData("S-1", String.format("총 %d개의 게시물들 입니다.", articles.size()), "articles", articles);
	}

	@RequestMapping("/usr/article/getArticle")
	@ResponseBody
	public ResultData getArticle(int id) {
		Article article = articleService.getArticle(id);
		return new ResultData("S-1", String.format("%d번 게시물 입니다.", id), "article", article);
	}

	@RequestMapping("/usr/article/doAddArticle")
	@ResponseBody
	public ResultData doAddArticle(@RequestParam Map<String, Object> param) {
		param.put("memberId", 1);
		int id = articleService.addArticle(param);

		return new ResultData("S-1", id + "번 게시물이 생성되었습니다.", "id", id);
	}

	@RequestMapping("/usr/article/doModifyArticle")
	@ResponseBody
	public ResultData doModifyArticle(@RequestParam Map<String, Object> param, int id) {

		if (param.get("boardId") != null) {
			param.remove("boardId");
		}

		articleService.modifyArticle(param);

		return new ResultData("S-1", id + "번 게시물이 수정되었습니다.");
	}
}