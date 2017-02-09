package test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import test.Service.UserService;

/**
 * Created by Leith on 2017/2/8.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/welcome.do")
    public String login(String username , String password){
        System.out.println(username);
        if(userService.login(username, password)){
            return "/success";
        }else{
            return "/fail";
        }
    }
}
