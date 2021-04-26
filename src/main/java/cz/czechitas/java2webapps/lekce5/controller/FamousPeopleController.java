package cz.czechitas.java2webapps.lekce5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Filip Jirsák
 */
@Controller
public class FamousPeopleController {

  @GetMapping("/")
  public String list() {
    return "index";
  }
}
