package com.myblog.domain;

//import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 内容
 *
 * @author somedragon
 */
//@Data
@Entity
@Table(name = "t_contents")
public class Contents implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue
    private Long id;

    /** 内容标题 */
    private String  title;

    /** 内容缩略名 */
    private String  slug;

    /** 内容生成时的GMT unix时间戳 */
    private Integer created;

    /** 内容更改时的GMT unix时间戳 */
    private Integer modified;

    /** 内容文字 */
    private String  content;

    /** 内容所属用户id */
    @Column(name = "author_id")
    private Integer authorId;

    /** 点击次数 */
    private Integer hits;

    /** 内容类别 */
    private String  type;

    /** 内容类型，markdown或者html */
    @Column(name = "fmt_type")
    private String  fmtType;

    /** 文章缩略图 */
    @Column(name = "thumb_img")
    private String  thumbImg;

    /** 标签列表 */
    private String  tags;

    /** 分类列表 */
    private String  categories;

    /** 内容状态 */
    private String  status;

    /** 内容所属评论数 */
    @Column(name = "comments_num")
    private Integer commentsNum;

    /** 是否允许评论 */
    @Column(name = "allow_comment")
    private Boolean allowComment;

    /** 是否允许ping */
    @Column(name = "allow_ping")
    private Boolean allowPing;

    /** 允许出现在聚合中 */
    @Column(name = "allow_feed")
    private Boolean allowFeed;
}