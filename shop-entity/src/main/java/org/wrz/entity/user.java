package org.wrz.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;


@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
    private  int id;
    private String name;
    private String password;
    private String eamil;
    private Date birthday;
}
