package com.ljl.community.mapper;

import com.ljl.community.model.Article;
import com.ljl.community.model.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ArticleMapper {

    int incView(Article record);
    int incCommentCount(Article record);
    List<Article> selectRelated(Article article);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    long countByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    int deleteByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    int insert(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    int insertSelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    List<Article> selectByExampleWithBLOBsWithRowbounds(ArticleExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    List<Article> selectByExampleWithRowbounds(ArticleExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */

    List<Article> selectByExampleWithUser(ArticleExample example);
    Article selectByPrimaryKeyWithUser(Integer id);

    List<Article> selectByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    Article selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ARTICLE
     *
     * @mbg.generated Sat Aug 10 13:10:39 CST 2019
     */
    int updateByPrimaryKey(Article record);
}