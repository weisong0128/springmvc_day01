package com.java.controller;

import com.java.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 * author: ws
 * time: 2020/2/29 15:59
 */
@Controller
@RequestMapping("/index/")
public class IndexController {

    /**
     * @RequestMapping: 配置方法级别的虚拟路径
     * value属性：方法的虚拟路径
     * method属性：配置请求方式，默认get/post都可以
     */
//    @RequestMapping(value={"/login.do","/denglu.do"}, method = {RequestMethod.GET,RequestMethod.POST})
    @RequestMapping("/login.do")
    public @ResponseBody Map<String, Object> login(){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("id", 1L);
        resultMap.put("uName", "张三");
        return resultMap;
    }

    @RequestMapping("/test.do")
    public @ResponseBody List<Map<String, Object>> test(){
        Map<String, Object> resultMap1 = new HashMap<>();
        resultMap1.put("id", 1L);
        resultMap1.put("uName", "张三");

        Map<String, Object> resultMap2 = new HashMap<>();
        resultMap2.put("id", 2L);
        resultMap2.put("uName", "李四");

        Map<String, Object> resultMap3 = new HashMap<>();
        resultMap3.put("id", 3L);
        resultMap3.put("uName", "王五");

        List<Map<String, Object>> userList = Arrays.asList(resultMap1, resultMap2, resultMap3);
        return userList;
    }


    @RequestMapping("/test2.do")
    public @ResponseBody boolean test2(){
        return true;
    }


    //---------------springmvc如何获取参数信息
    @RequestMapping("/registerUser")
//    public void registerUser(String uName,Integer age,Float height){
//    public void registerUser(User user){
    public void registerUser(@RequestParam Map<String,Object> userMap){
//        System.out.println("uName=" + uName+",age=" +age+",height="+height);
//        System.out.println(user);   //就是打印user的toString方法
        System.out.println(userMap);
    }

    /**
     * controller方法跳转到jsp页面，然后带数据过去
     * 注意：方法类型前不能带@ResponseBody
     * @param user
     * @return
     */
    @RequestMapping("/regist")
    public String regist(User user, HttpServletRequest request,
                         Model model,
                         Map<String, Object> req,
                         HttpSession session,
                         HttpServletResponse response) {
//        request.setAttribute("yongHu", user); //把user中的值带到show.jsp中yongHu对象中
        model.addAttribute("yongHu", user);
//        req.put("yonghu", user);
        return "/show.jsp"; //转发
//        return "redirect:/show.jsp";    //表示 重定向
    }


    //------------------------异常处理-------------------------
    @RequestMapping("/extTest1")
    public void extTest1() {
//        int i=10/0; // 界面会报出异常
        String str = null;
        System.out.println(str.length());
    }



}
