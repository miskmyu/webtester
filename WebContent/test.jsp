<%@page import="com.maninsoft.model.SwoConfig"%>
<%@page import="java.util.List"%>
<%@page import="com.maninsoft.ibatis.manager.IbatisTester"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

	SwoConfig con = new SwoConfig();
	con.setId("tester");
	con.setLogo("loglooooeeee");
	
	//IbatisTester.updateConfig(con);
	//IbatisTester.deleteConfig("tester");
	SwoConfig c = IbatisTester.selectConfigById("Semiteq");
	out.print(c.getLogo() + "    ###############");
	
	
	List<SwoConfig> result = IbatisTester.selectAllConfig();
	

	for (SwoConfig configs : result) {
		out.print(configs.getId() + ", " + configs.getLogo() + "<br>" );
	}
%>
</body>
</html>