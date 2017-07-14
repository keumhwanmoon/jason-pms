package jason.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jason, Moon.
 * @since 2017-07-14
 */
@Controller
public class ProjectController {
    @GetMapping("/projects")
    public ModelAndView getPage() {
        return new ModelAndView("/projects/list");
    }
}
