package netgloo.controllers;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @RequestMapping("/")
  // @ResponseBody CodePilot
  public String index() {
    return "hello.html";
  }

}