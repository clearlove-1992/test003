package com.itheima.dao;

import com.itheima.domian.Cust;

import java.util.List;
import java.util.Map;

public interface CustDao {
    List<Cust> search(Map<String, Object> map);

    List<Cust> findAllById();
}
