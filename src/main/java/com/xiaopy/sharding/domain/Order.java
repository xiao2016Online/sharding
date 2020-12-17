package com.xiaopy.sharding.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author xiaopeiyu
 * @since 2020/12/17
 */

@Entity
@Table(name = "t_order")
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 5416359379398149978L;
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int userId;

    private String name;

    private String type;
}
