package com.java.zms.Domain;

import lombok.Data;
import java.io.Serializable;


//@Entity
@Data
public class User implements Serializable {
 //   @Id
  //  @GeneratedValue
    private Integer id;
//    用户名
    String userName;
//    密码
    String pwd;
//    电话
    String phone;
//    emaile
    String email;
}
