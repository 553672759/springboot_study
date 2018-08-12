package xx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xx.dao.inte.UsersDao;
import xx.modal.Users;
import xx.service.UsersService;

@ComponentScan
@RestController
public class MainController {
	

	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/findall")
	public List<Users> find() {
		return usersService.getAllUsers();
		
	}
	
	@RequestMapping("/add")
	public Object add() {
		Users user=new Users();
		user.setId("1");
		user.setUserName("5536");
		user.setRealName("wdc");
		user.setPassWord("0000");
		user.setEmail("553672759");
		usersService.addUser(user);
		return "OK";
	}
	
}
