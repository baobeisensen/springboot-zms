package com.java.zms.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    String userName;
    String pwd;
    String phone;
    String nickName;
    int sex;
    int old;
}
