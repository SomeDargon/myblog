package com.myblog.domain;

//import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 评论
 * @author somedragon
 */
//@Data
@Entity
@Table(name = "t_comments")
public class Comments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue
    private Long id;

    /** post表主键,关联字段 */
    private Integer cid;

    /** 评论生成时的GMT unix时间戳 */
    private Integer created;

    /** 评论作者 */
    private String author;

    /** 评论所属用户id */
    @Column(name = "author_id")
    private Integer authorId;

    /** 评论所属内容作者id */
    @Column(name = "owner_id")
    private Integer ownerId;

    /** 评论者邮件 */
    private String mail;

    /** 评论者网址 */
    private String url;

    /** 评论者ip地址 */
    private String ip;

    /** 评论者客户端 */
    private String agent;

    /** 评论内容 */
    private String content;

    /** 评论类型 */
    private String type;

    /** 评论状态 */
    private String status;

    /** 父级评论 */
    private Integer parent;

}