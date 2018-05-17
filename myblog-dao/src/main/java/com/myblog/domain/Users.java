package com.myblog.domain;

//import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户
 *
 * @author somedragon
 */
//@Data
@Entity
@Table(name = "t_users")
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue
    private Long id;

    /** 用户名称 */
    private String username;

    /** 用户密码 */
    private String password;

    /** 用户的邮箱 */
    private String email;

    /** 用户的主页 */
    @Column(name = "homeUrl")
    private String home_url;

    /** 用户显示的名称 */
    @Column(name = "screen_name")
    private String screenNname;

    /** 用户注册时的GMT unix时间戳 */
    private Integer created;

    /** 最后活动时间 */
    private Integer activated;

    /** 上次登录最后活跃时间 */
    private Integer logged;

    /** 用户组 */
    @Column(name = "group_name")
    private String groupName;

}