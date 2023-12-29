package repository;

import model.User;
import service.impl.BanaryFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepository implements IUserRepository {
    private final String FILE = "src/data/vi.csv";

    @Override
    public List<User> add() {
        return BanaryFile.readFile(FILE);
    }

    @Override
    public void findNo(User user) {
        List<User> userList = BanaryFile.readFile(FILE);
        userList.add(user);
        BanaryFile.writeFile(FILE, userList);
    }

    @Override
    public User searchUser(String code) {
        List<User> userList = BanaryFile.readFile(FILE);
        for (int i = 0; i < userList.size(); i++) {
            if (Objects.equals(userList.get(i).getCode(), code) ){
                return userList.get(i);
            }
        }
       // BanaryFile.writeFile(FILE, userList);
        return null;
    }

    @Override
    public User searchUser1(String name) {
        List<User> userList = BanaryFile.readFile(FILE);
        List<User> userList1=new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(name) ){
               userList1.add(userList.get(i));
            }
        }

       // BanaryFile.writeFile(FILE, userList);
        System.out.println(userList1);
        return  null;
    }
}
