package com.example.dao;

import java.util.List;

import com.example.vo.CityVo;

public interface CityDao {
<<<<<<< HEAD
	CityVo read(String name);
	List<CityVo> readAll(String countyCode);
=======
	
	CityVo read(String name);
	public List<CityVo> readAll(String countyCode);
>>>>>>> refs/remotes/origin/master
}
