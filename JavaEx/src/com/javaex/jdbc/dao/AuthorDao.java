package com.javaex.jdbc.dao;

import java.util.List;

// 설계 규약
// Interface implements 한 모든 객체는 내부의 추상메서드를 모두 오버라이드 해야함
public interface AuthorDao {
	public List<AuthorVo> getList();
	public List<AuthorVo> search(String keyword);
	public AuthorVo get(Long id);
	public boolean insert(AuthorVo vo);
	public boolean update(AuthorVo vo);
	public boolean delete(Long id);
}
