package com.kesheng.QRMaker.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.kesheng.QRMaker.domain.Company;
import com.kesheng.QRMaker.domain.Plan;
import com.kesheng.QRMaker.domain.ProductType;
import com.kesheng.QRMaker.service.impl.UserImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;

public class ShowPlanAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private UserImpl user;

	public UserImpl getUser() {
		return user;
	}

	public void setUser(UserImpl user) {
		this.user = user;
	}

	public String execute() throws Exception{
		/*Map<String,Object> sessions = ActionContext.getContext().getSession();
		for(Map.Entry<String, Object>entry : sessions.entrySet()){
			String key = entry.getKey();
			String com_code = (String)entry.getValue();
			List<Company> companys = user.getCompanyDao().findByCode(com_code);
			for(Company company:companys){
				for(ProductType product:company.getProducts()){
					for(Plan plan:product.getPlans()){
						Map<String,String> map = new HashMap<String,String>();
						map.put("plan_id", String.valueOf(plan.getId()));
						map.put("com_code", company.getCode());
						map.put("pro_code", product.getCode());
						map.put("pro_name", product.getName());
						map.put("plan_pack", plan.getPack());
						map.put("plan_yield", String.valueOf(plan.getYield()));

						JSONObject obj = JSONObject.fromObject(map);
						String msg = obj.toString();
						
						HttpServletResponse response = ServletActionContext.getResponse();
						response.setCharacterEncoding("UTF-8");
						response.getWriter().print(msg);
					}
				}
			}
		}*/
		return SUCCESS;
	}
}
