package com.pp;

import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {


    @Id
    private Long id;

    @NaturalId
    private String userid;

    @Column( name="pswd" )
    @ColumnTransformer( read="decrypt(pswd)", write="encrypt(?)" )
    private String password;

    private int accessLevel;

    @ManyToOne( fetch=FetchType.LAZY )
    @JoinColumn
    private Department department;

    @ManyToMany(mappedBy="employees")
    @JoinColumn
    private Set<Project> projects;

    //...

}
