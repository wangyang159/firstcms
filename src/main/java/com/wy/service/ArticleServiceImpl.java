package com.wy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.wy.bean.Article;
import com.wy.dao.ArticleMapper;

@Service
public class ArticleServiceImpl implements ArticleService{
	@Autowired
	private ArticleMapper articleDao;

	@Override
	public Integer insertArticle(Article article) {
		return articleDao.insertArticle(article);
	}

	@Override
	public List<Article> selectArticle(Article article,Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Article> allArticle = articleDao.selectArticle(article);
		return allArticle;
	}

	@Override
	public Article select(Integer id) {
		return articleDao.select(id);
	}

	@Override
	public int update(Article article) {
		return articleDao.update(article);
	}
}
