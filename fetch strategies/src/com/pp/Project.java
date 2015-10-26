package com.pp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Project {


    @Id
    private Long id;

    @ManyToMany
    private Set<Employee> employees;

//    ...

}
