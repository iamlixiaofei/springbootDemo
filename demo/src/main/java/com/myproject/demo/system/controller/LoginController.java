package com.myproject.demo.system.controller;

import com.myproject.demo.common.Result;
import com.myproject.demo.system.entity.Loglogin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lixiaofei
 */
@RestController
//@Controller +   @ResponseBody
public class LoginController {

    @RequestMapping("/hello")
//    @ResponseBody
    public Object hello(){
        Loglogin log = new Loglogin();
        log.setLoginIp("127.0.0.1");
        log.setLoginName("lee");
        log.setOperatorName("zhong");
        log.setOperate("登录");
//        return "hello springboot!";
        return log;
    }

    /**
     * 返回一个json对象
     * @return
     */
    @RequestMapping("/getJson")
    public Result getJson(){
        Loglogin log = new Loglogin();
        log.setLoginIp("127.0.0.1");
        log.setLoginName("lee");
        log.setOperatorName("zhong");
        log.setOperate("登录");
        return Result.ok(log);
    }


}
