package com.yeobi.daily;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/")
	public List<MemberVO> abc() {
		String query = "SELECT * FROM MEMBER";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
	}
}