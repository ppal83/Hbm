package com.pp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Department {


    @Id
    private Long id;

    @OneToMany(mappedBy="department")
    private List<Employee> employees;

//    ...

}
