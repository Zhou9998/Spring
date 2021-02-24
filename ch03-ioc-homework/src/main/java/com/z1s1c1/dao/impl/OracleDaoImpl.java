package com.z1s1c1.dao.impl;

import com.z1s1c1.dao.UserDao;
import com.z1s1c1.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleDaoImpl implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("oracle 的insertUser");
    }
}
