package fi.hh.server.hockey.web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;


@Controller
public class hockeyController {
    // Handle request mapping for root and login pages
    @RequestMapping(value="/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = {"/", "/index"}, method=RequestMethod.GET)
    public String load(){
        return "index";
    }

}
