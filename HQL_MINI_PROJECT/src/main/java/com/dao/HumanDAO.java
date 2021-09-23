package com.dao;

import com.entity.Human;

public interface HumanDAO {
	public void insert(Human human);
	public Human get(String id);
}
