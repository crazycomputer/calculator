package server.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Book 控制层
 *
 * Created by bysocket on 30/09/2017.
 */
@Controller
@RequestMapping(value = "/")
public class RootController {
    private static final String REDIRECT_TO_BOOK_URL = "redirect:/baby";
    @RequestMapping(method = RequestMethod.GET)
    public String redirect() {
        return REDIRECT_TO_BOOK_URL;
    }

}
