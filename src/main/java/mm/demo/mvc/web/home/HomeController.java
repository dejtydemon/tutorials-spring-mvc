package mm.demo.mvc.web.home;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mm.demo.mvc.common.Constant;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    String appName;
    
    @RequestMapping(Constant.HomeRoute.DEFAULT)
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        model.addAttribute("test", "hello babe");
        return "home";
    }
}