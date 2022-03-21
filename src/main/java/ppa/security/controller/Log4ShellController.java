package ppa.security.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4ShellController {
    private static final Logger LOGGER = LogManager.getLogger(Log4ShellController.class);

    @GetMapping("/byheader")
    public String header (@RequestHeader("X-Api-Version") String version) {
        LOGGER.info("receive a request from apiversion " + version);
        return "Hello, World !!";
    }

    @GetMapping("/hello")
    public String hello () {
        return "Hello, World !!";
    }
}
