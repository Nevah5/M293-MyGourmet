package net.geeler.mygourmet;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {
  @GetMapping("/order")
  public String orderPage(Model model) {
    model.addAttribute("form", new OrderModel());
    return "order";
  }

  @PostMapping("/order")
  public String postOrder(Model model, @Valid OrderModel orderModel, BindingResult bindingResult) {
    model.addAttribute("form", orderModel);
    if (bindingResult.hasErrors())
        return "order";
    return "success";
  }

  @GetMapping("/success")
  public String returnPage() {
    return "success";
  }
}
