package BS4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Value("${var1}")
    private String var1;

    @Value("${var2}")
    private int var2;
    @Value("${var3:var3 no tiene valores}")
    private String var3;

    @GetMapping("valores")
    public String showValores(){
        return "El valor de var1 es "+var1+" el valor de var2 es "+var2;
    }

    @GetMapping("var3")
    public String showVar3(){
        return "El valor de var3 es "+var3;
    }


}