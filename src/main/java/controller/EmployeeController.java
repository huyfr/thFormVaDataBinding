package controller;

import model.Employee;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    private static Logger logger = LogManager.getLogger(EmployeeController.class);

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView loadIndex(ModelMap modelMap) {
        logger.trace("Vao loadIndex");
        ModelAndView index = new ModelAndView("index");
        modelMap.addAttribute("employee", new Employee());
        logger.info("Mang employee ra trang index.jsp");
        logger.trace("Thoat loadIndex");
        return index;
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public ModelAndView loadResult(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
        logger.trace("Vao loadResult");
        ModelAndView result = new ModelAndView("result");
        modelMap.addAttribute("name", employee.getName());
        modelMap.addAttribute("contactNumber", employee.getContactNumber());
        modelMap.addAttribute("id", employee.getId());
        logger.trace("Thoat loadResult");
        return result;
    }
}
