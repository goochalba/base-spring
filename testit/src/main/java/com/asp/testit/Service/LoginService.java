package com.asp.testit.Service;

import com.asp.testit.Entity.*;
import com.asp.testit.Repository.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


@Service
public class LoginService
{

UserRepo userRepo;
protected static Logger logger = Logger.getLogger("LoginService");
	
 public LoginService()
 {
 }

 public String showUser(Integer userId)
 {
     List<User> user = userRepo.findAll();
     return "WTF MW?";
 } 

}


