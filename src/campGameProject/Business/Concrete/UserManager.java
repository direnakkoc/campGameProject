package campGameProject.Business.Concrete;

import campGameProject.Business.Abstract.UserCheckService;
import campGameProject.Business.Abstract.UserService;
import campGameProject.Entity.User;

public class UserManager implements UserService {
	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if (this.userCheckService.CheckIfRealPerson(user)) {
			System.out.println("User was added : " + user.getName());
		} else {
			System.out.println("Invalid user.");
		}

	}

	@Override
	public void delete(User user) {
		System.out.println("User was deleted.");

	}

	@Override
	public void update(User user) {
		System.out.println("User was updated.");

	}

}
