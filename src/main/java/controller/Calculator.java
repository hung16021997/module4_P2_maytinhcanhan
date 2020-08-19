package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @GetMapping("/calculator")
    public String getLandingPage(){
        return "calculatorForm";
    }

    @GetMapping("/calculate")
    public String getResult(@RequestParam Long firstNum ,
                            @RequestParam Long secondNum,
                            @RequestParam char operator,
                            Model model ){
        long result = 0;
        switch (operator){
            case '+':
                result = firstNum+secondNum;
                break;
            case '-':
                result = firstNum-secondNum;
                break;
            case '*':
                result = firstNum*secondNum;
                break;
            case '/':
                result = firstNum/secondNum;
                break;
        }
        model.addAttribute("result", result);
        return "result";

    }
}
