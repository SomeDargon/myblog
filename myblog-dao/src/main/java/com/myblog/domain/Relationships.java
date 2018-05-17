package com.myblog.domain;

//import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 数据关系
 *
 * @author somedragon
 */
//@Data
@Entity
@Table(name = "t_relationships")
public class Relationships implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue
    private Long id;
    /** 内容主键 */
    @Column(name = "c_id")
    private Integer cId;

    /** 项目主键 */
    @Column(name = "m_id")
    private Integer md;

}