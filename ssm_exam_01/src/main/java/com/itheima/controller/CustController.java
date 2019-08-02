package com.itheima.controller;

import com.itheima.domian.Cust;
import com.itheima.domian.User;
import com.itheima.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/cust")
public class CustController {

    @Autowired
    private CustService custService;

    @RequestMapping("search.do")
    public List<Cust> search(String cust_name,String cust_type) {

        List<Cust> list=custService.search(cust_name,cust_type);

        return list;
    }

    @RequestMapping("findAllById.do")
    public List<Cust> findAllById(HttpServletRequest request) {
        //从session中拿出user
        //User user = (User) request.getSession().getAttribute("user");
        //Integer uid = user.getUid();

        List<Cust> list=custService.findAllById();

        return list;
    }
}
