package com.maninsoft.ibatis.manager;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.common.resources.Resources;
import com.maninsoft.model.SwoConfig;

import java.io.Reader;
import java.io.IOException;
import java.util.List;
import java.sql.SQLException;

public class IbatisTester {
	private static SqlMapClient sqlMapper;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/maninsoft/ibatis/demo/SqlMapConfig.xml");
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close(); 
		} catch (IOException e) {
			// Fail fast.
			throw new RuntimeException("Something bad happened while building the SqlMapClient instance." + e, e);
		}
	}

	public static List selectAllConfig () throws SQLException {
		return sqlMapper.queryForList("selectAllConfig");
	}

	public static SwoConfig selectConfigById  (String id) throws SQLException {
		return (SwoConfig) sqlMapper.queryForObject("selectConfigById", id);
	}

	public static void insertConfig (SwoConfig config) throws SQLException {
		sqlMapper.insert("insertConfig", config);
	}

	public static void updateConfig (SwoConfig config) throws SQLException {
		sqlMapper.update("updateConfig", config);
	}

	public static void deleteConfig (String id) throws SQLException {
		sqlMapper.delete("deleteConfigById", id);
	}
	
}