package me.ggikko.collect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

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

    @RequestMapping(value = "test", method = GET)
    public void inputTest(){

    }

}
