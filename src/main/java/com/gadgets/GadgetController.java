package com.gadgets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.gadget.Product;

import org.springframework.ui.ModelMap;

@Controller
public class GadgetController {

@RequestMapping(value = "/product", method=RequestMethod.GET)
public ModelAndView student() {

return new ModelAndView("product", "command", new Product(0, null));
}
@RequestMapping(value = "/addProduct", method=RequestMethod.POST)
public String addProduct(@ModelAttribute("SpringWeb")Product product, ModelMap model) {
model.addAttribute("id", product.getId());
model.addAttribute("name", product.getName());

return "login";
}
}