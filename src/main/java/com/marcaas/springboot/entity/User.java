package com.marcaas.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author marcaas
 * @since 2023-04-07
 */
@Getter
@Setter
  @TableName("sys_user")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("ID")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("用户名")
      private String username;

      @ApiModelProperty("密码")
      private String password;

      @ApiModelProperty("昵称")
      private String nickname;

      @ApiModelProperty("邮箱")
      private String email;

      @ApiModelProperty("电话")
      private String phone;

      @ApiModelProperty("地址")
      private String address;

      @ApiModelProperty("创建时间")
      private LocalDateTime creatTime;


}
