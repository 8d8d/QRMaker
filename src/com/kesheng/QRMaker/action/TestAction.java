package com.kesheng.QRMaker.action;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.*;

import net.sf.json.JSONObject;


public class TestAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception{
		Map<String,Object> sessions = ActionContext.getContext().getSession();
		for(Map.Entry<String, Object>entry : sessions.entrySet()){
			String key = entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key);
			System.out.println(value);
		}
		Map<String,String> map = new HashMap<String,String>();
		map.put("key1", "1");
		map.put("key2", "2");
		map.put("key3", "3");
		map.put("key4", "4");
		JSONObject obj = JSONObject.fromObject(map);
		String msg = obj.toString();
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(msg);
		return null;
	}
}
