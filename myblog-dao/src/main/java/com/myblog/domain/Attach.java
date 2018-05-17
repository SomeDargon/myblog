package com.myblog.domain;

//import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 *  附件类
 * @author somedragon
 */
//@Data
@Entity
@Table(name = "attach")
public class Attach implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue
    private Long id;

    @Column(name = "f_name")
    private String fName;

    @Column(name = "f_type")
    private String fType;

    @Column(name = "f_key")
    private String fKey;

    @Column(name = "authorId")
    private Integer author_id;

    @Column(name = "created")
    private Integer created;
}
