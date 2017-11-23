package fi.hh.server.hockey.web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;


@Controller
@RequestMapping(value="/")
public class hockeyController {
    @RequestMapping(method=RequestMethod.GET)
    public String load(){
        return "index";
    }

    @RequestMapping(value="/login")
    public String login() {
        return "login";
    }

}
