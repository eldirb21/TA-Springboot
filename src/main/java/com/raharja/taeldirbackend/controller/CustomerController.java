package com.raharja.taeldirbackend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//access by admin
@RestController
@RequestMapping("/admin/customer")
@PreAuthorize("ADMIN")
public class CustomerController {


}
