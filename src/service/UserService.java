package service;

import model.User;
import repository.IUserRepository;
import repository.UserRepository;

import java.util.List;

public class UserService implements IUserService {
    private static final IUserRepository iUserRepository = new UserRepository();

    @Override
    public List<User> add() {
        return iUserRepository.add();
    }

    @Override
    public void findNo(User user) {
        iUserRepository.findNo(user);
    }

    @Override
    public User searchUser(String code) {
        return iUserRepository.searchUser(code);
    }

    @Override
    public User searchUser1(String name) {
        return iUserRepository.searchUser1(name);
    }
}
