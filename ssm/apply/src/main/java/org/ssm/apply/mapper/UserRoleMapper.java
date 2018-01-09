package org.ssm.apply.mapper;

import java.util.List;
import org.ssm.apply.domain.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    List<UserRole> selectAll();

    int updateByPrimaryKey(UserRole record);
}