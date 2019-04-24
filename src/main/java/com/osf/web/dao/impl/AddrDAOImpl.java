package com.osf.web.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.AddrDAO;

@Repository
public class AddrDAOImpl implements AddrDAO {
	
	@Autowired
	private SqlSessionFactory ssf;
	
	@Override
	public List<Map<String, String>> selectAddrList() {
		SqlSession ss = ssf.openSession();
		Map<String,String> param = new HashMap<String,String>();
		param.put("adNum", "10");
		
		return ss.selectList("addr.selectAddrList", param);
	}

}
