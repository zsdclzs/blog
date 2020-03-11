package plus.kuailefeizhaijidi.blog.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author dl
 * @since 2020-03-10
 */
@TableName("article")
public class Article extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 文章ID
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableId(value = "article_id", type = IdType.ASSIGN_ID)
    private Long articleId;

    /**
     * 分类ID
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(value = "category_id")
    private Long categoryId;

    /**
     * 用户ID
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 标签（逗号分隔）
     */
    private String tags;

    /**
     * 文章标题
     */
    @TableField(value = "article_title")
    private String articleTitle;

    /**
     * 原作者
     */
    @TableField(value = "article_author")
    private String articleAuthor;

    /**
     * 文章描述
     */
    @TableField(value = "article_desc")
    private String articleDesc;

    /**
     * 文章内容
     */
    @TableField(value = "article_content")
    private String articleContent;

    /**
     * 公开状态
     */
    @TableField(value = "public_status", fill = FieldFill.INSERT)
    private Integer publicStatus;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public String getArticleDesc() {
        return articleDesc;
    }

    public void setArticleDesc(String articleDesc) {
        this.articleDesc = articleDesc;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getPublicStatus() {
        return publicStatus;
    }

    public void setPublicStatus(Integer publicStatus) {
        this.publicStatus = publicStatus;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", categoryId=" + categoryId +
                ", userId=" + userId +
                ", tags=" + tags +
                ", articleTitle=" + articleTitle +
                ", articleAuthor=" + articleAuthor +
                ", articleDesc=" + articleDesc +
                ", articleContent=" + articleContent +
                ", publicStatus=" + publicStatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                "}";
    }
}
