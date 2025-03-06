package com.mangosteen.app.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Hello Controller
 */
// 对外提供一个controller
@RestController
public class HelloController {
    // 将该方法暴露出去

    /**
     * Say Hello API.
     * @param name name
     * @return hello string
     */
    //http://localhost:8080/v1/hello/name
    @GetMapping(path = "v1/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return String.format("Hello %s!", name);
    }

    //http://localhost:8080/v1/greeting?name=zhangsan&id=100
    @GetMapping(path = "v1/greeting")
    public String greeting(@RequestParam("name") String name,
                           @RequestParam("id") Long id) {
        return String.format("Hello %s with %s", name,id);
    }
}
