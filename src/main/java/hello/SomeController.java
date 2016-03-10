package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET, params = { "name" })
    @ResponseBody
    public String nameFilter(@RequestParam final String name) {
        return "filtering on name = " + name;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, params = { "other" })
    @ResponseBody
    public String otherFilter(@RequestParam final String other) {
        return "filtering on other = " + other;
    }
}
