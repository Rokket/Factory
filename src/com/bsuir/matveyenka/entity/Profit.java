package com.bsuir.matveyenka.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * User: User
 * Date: 09/12/12
 */
@Entity
@Table(name = "profit")
public class Profit extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "produced")
    private Integer produced;

    @Column(name = "ordered")
    private Integer ordered;

    @Column(name = "date_")
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProduced() {
        return produced;
    }

    public void setProduced(Integer produced) {
        this.produced = produced;
    }

    public Integer getOrdered() {
        return ordered;
    }

    public void setOrdered(Integer ordered) {
        this.ordered = ordered;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
