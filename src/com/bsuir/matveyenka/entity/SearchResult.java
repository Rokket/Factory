package com.bsuir.matveyenka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User: User
 * Date: 09/12/12
 */
@Entity
@Table(name = "search_result")
public class SearchResult extends BaseEntity {

    @Column(name = "person")
    private String person;

    @Column(name = "position")
    private String position;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
