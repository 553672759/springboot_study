package xx.dao.inte;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import xx.modal.Users;

public interface UsersDao  {
	
	List<Users> findAll();

}
