package com.example.demo.mapper;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.User;

@RequestMapping
public interface FoodMapper {

	public List<User> selectAll();
}
