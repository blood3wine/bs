package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Goods;
import beans.User;
import server.UserManager;
import server.GoodsManager;

@Controller
public class LogioC {
	@Autowired
	private UserManager UserManager;
	public void setUserManager(UserManager userManager) {
		UserManager = userManager;
	}
	@Autowired
	private GoodsManager GoodsManager;
	public void setGoodsManager(GoodsManager GoodsManager) {
		GoodsManager = GoodsManager;
	}
	@RequestMapping("tologin")
	public String tologin(){ 
		return "login";
	}
	@RequestMapping("toregist")
	public String toregist(){
		return "regist";
	}
	
	@RequestMapping("login")
	public String login(User user,Model model,HttpSession session,HttpServletRequest request){
		//System.out.println(user);
		
		if(UserManager.find(user)){
			List<Goods> list=GoodsManager.getGoods("");
		request.setAttribute("list", list);
			session.setAttribute("USER_SESSION", user);
		  return "main";
		}else{
		  model.addAttribute("msg", "用户名或密码错误");
		  return "login";
		}
	}
	@RequestMapping("regist")
	public String register(User user,Model model,HttpSession session){
			UserManager.insert(user);
			model.addAttribute("msg", "注册成功，请登录");
		  return "login";
	}
	@RequestMapping("logout")
	public String logout(HttpSession session){
		session.setAttribute("USER_SESSION", null);
		return "login";
	}
	
	@SuppressWarnings("finally")
	@RequestMapping("main")
	public String toselect(String name,HttpServletRequest request) {
		try{List<Goods> list=GoodsManager.getGoods(name);
		
		request.setAttribute("list", list);
		 }
		catch(Exception e) {
			List<Goods> list=GoodsManager.getGoods("");
			request.setAttribute("list",list);
		}
		finally { return "main";}
	}
	
	@RequestMapping("toinsertW")
	public String toinsert(){
		return "insertW";
	}
	@RequestMapping("todeleteW")
	public String todelete(HttpServletRequest request){
		List<Goods> list=GoodsManager.getGoods("");
		
		request.setAttribute("list", list);
		return "deleteW";
	}
	@RequestMapping("deleteW")
	public String deleteW(String id,Model model,HttpServletRequest request){
		GoodsManager.deleteGoods(id);
		List<Goods> list=GoodsManager.getGoods("");
		request.setAttribute("list", list);
		model.addAttribute("msg", "删除成功，继续删除或返回");
	  return "deleteW";
		
	}
	
	@RequestMapping("insertW")
	public String insertW(Goods Goods,Model model){
		GoodsManager.insertGoods(Goods);
		model.addAttribute("msg", "添加成功，继续添加或返回");
	  return "insertW";
		
	}

}
