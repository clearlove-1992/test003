package com.itheima.service;

import com.itheima.domian.Cust;

import java.util.List;

public interface CustService {
    List<Cust> search(String cust_name, String cust_type);

    List<Cust> findAllById();
}
