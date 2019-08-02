package com.itheima.service.impl;

import com.itheima.dao.CustDao;
import com.itheima.domian.Cust;
import com.itheima.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustServiceImpl implements CustService {

    @Autowired
    private CustDao custDao;

    @Override
    public List<Cust> search(String cust_name, String cust_type) {
        Map<String,Object> map=new HashMap<>();
        map.put("cust_name",cust_name );
        map.put("cust_type",cust_type );

        List<Cust> list=custDao.search(map);

        return list;
    }

    @Override
    public List<Cust> findAllById() {

        return custDao.findAllById();
    }
}
