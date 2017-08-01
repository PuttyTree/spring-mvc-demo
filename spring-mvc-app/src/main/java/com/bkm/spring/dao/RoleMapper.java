package com.bkm.spring.dao;

import com.bkm.spring.model.Role;
import org.springframework.stereotype.Repository;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    //extension
    //public Role createRole(Role role);
    //public void deleteRole(Long roleId);

    //public void correlationPermissions(Long roleId, Long... permissionIds);
    //public void uncorrelationPermissions(Long roleId, Long... permissionIds);

}