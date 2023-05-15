package com.genn.test_demo.controller;

import com.genn.test_demo.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.genn.test_demo.pojo.TableA;
import com.genn.test_demo.pojo.TableB;
import com.genn.test_demo.service.TableAService;
import com.genn.test_demo.service.TableBService;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TableBService tableBService;
    @Autowired
    private TableAService tableAService;

    @GetMapping("/handler/login")
    public Response<String> login(@RequestParam("username")String username,@RequestParam("password")String password){
        return Response.success(String.format("%s-%s",username,password));
    }

    @GetMapping("/handlerA/{id}")
    public Response<TableA> handlerA(@PathVariable Long id){
        return Response.success(tableAService.getById(id));
    }

    @GetMapping("/handlerB/{id}")
    public Response<TableB> handlerB(@PathVariable Long id){
        return Response.success(tableBService.getById(id));
    }

}
