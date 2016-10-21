package com.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Igor Dmitriev on 10/21/16
 */

@Entity
@Table
@Immutable
@Getter
@Setter
public class City {
    @Id
    private Long id;
    private String name;
}
