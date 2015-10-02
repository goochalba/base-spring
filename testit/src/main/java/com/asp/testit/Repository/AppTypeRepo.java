package com.asp.testit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asp.testit.Entity.AppType;

public interface AppTypeRepo extends JpaRepository<AppType, Integer> {
	
	@Query("SELECT appTypeName from AppType appType where appType.appTypeId=1")
	public abstract String showAppTypeName();
	
	public abstract AppType findByAppTypeId(Integer appTypeId);
	
}
