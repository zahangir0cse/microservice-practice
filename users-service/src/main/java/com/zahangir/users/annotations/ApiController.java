package com.zahangir.users.annotations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RestController
@CrossOrigin(origins = "*", methods = {GET, POST, PUT,PATCH, DELETE, OPTIONS})
public @interface ApiController {
}

