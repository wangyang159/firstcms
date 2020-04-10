package com.wy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wy.bean.Article;

public interface ArticleMapper {
	/**
	 * 添加文章 方法
	 * @param article
	 * @return
	 */
	Integer insertArticle(Article article);
	
	/**
	 * 查询方法
	 * @param article 先使用文章对象，后期如有需要在更改
	 * @return
	 */
	List<Article> selectArticle(@Param("article")Article article);

	/**
	 * 单个查询
	 * @param id
	 * @return
	 */
	Article select(@Param("id")Integer id);

	/**
	 * 修改
	 * @param article
	 * @return
	 */
	int update(Article article);
}
