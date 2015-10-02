package com.asp.testit.Service;

import com.asp.testit.Entity.*;
import com.asp.testit.Repository.*;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class AppTypeService
{

 public AppTypeService()
 {
 }

 public String showAppName(Integer appTypeId)
 {
     AppType appType = appTypeRepo.findByAppTypeId(1);
     return appType.getAppTypeName();
 
 }
     
 AppTypeRepo appTypeRepo;
 protected static Logger logger = Logger.getLogger("AppTypeService");

}


