package com.maninsoft.ibatis.manager;

import java.util.List;

import com.maninsoft.model.SwoConfig;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<SwoConfig> l = IbatisTester.selectAllConfig();
	
		for (SwoConfig conf : l) {
			System.out.println(conf.getId() + "," + conf.getLogo());
		}
	}

}
