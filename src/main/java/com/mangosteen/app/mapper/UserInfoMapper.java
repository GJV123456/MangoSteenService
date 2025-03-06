package com.mangosteen.app.mapper;

import com.mangosteen.app.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ORM:对象（data model UserInfo.java）映射到数据库表（ms_userinfo）
 */

//添加 Mapper注解 让mybatis识别出UserInfoMapper是做映射的
    // 创建Mapper接口
@Mapper
public interface UserInfoMapper {
    //SELECT * from mangosteen_test.ms_userinfo WHERE id={id};

    @Select("SELECT id, username,password,create_time,update_time FROM ms_userinfo WHERE id = #{id}")
    UserInfo getUserInfoByUserId(Long id);


}
