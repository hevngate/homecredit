package id.co.hci.demo.controller;

import id.co.hci.demo.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ModuleController {

    @Autowired
    ModuleService moduleService;

    @GetMapping("/module/{userId}")
    public ResponseEntity<String> getUserModules(@PathVariable(value="userId") String userId) {
        return new ResponseEntity<String>(moduleService.getModules(userId), HttpStatus.OK);
    }
}
