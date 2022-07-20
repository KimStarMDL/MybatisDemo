package com.example.dao;

import java.util.List;

import com.example.vo.CityVo;

public interface CityDao {
	
	CityVo read(String name);
	public List<CityVo> readAll(String countyCode);
}
