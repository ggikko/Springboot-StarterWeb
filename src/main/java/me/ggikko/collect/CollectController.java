package me.ggikko.collect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Park Ji Hong, ggikko.
 */

@RestController
public class CollectController {

    @Autowired
    CollectRepository collectRepository;

    @RequestMapping(value = "hello")
    public String hello(){
        return "hello ggikko";
    }

}
