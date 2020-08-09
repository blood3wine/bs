package server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import beans.User;
import mapper.UserMapper;
@Component
public class UserManager {
	@Autowired
	private UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public boolean find(User user){
		if(userMapper.getUser(user)!=null){
		   return true;
		}else{
			return false;
		}
	}
	public void insert(User user){
		userMapper.insertUser(user);
	}

}
