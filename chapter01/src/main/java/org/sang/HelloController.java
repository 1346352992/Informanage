package org.sang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2019/9/18
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "黄沅木 学号201841882116";
    }
}
