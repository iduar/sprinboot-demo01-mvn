package mx.com.raudi.sprinboootdemo01mvn.controller;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping(path = "/apiDetails")
    ResponseDatailsApi apiDetails(){
        return ResponseDatailsApi.createInstance();
    }


}
