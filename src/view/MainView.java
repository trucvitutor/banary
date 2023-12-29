package view;

import controller.UserController;
import model.User;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private final Scanner scanner = new Scanner(System.in);
    private final UserController userController = new UserController();

    public void Menu() {
        int choice;
        while (true) {
            System.out.println("1.thêm"
                    + "\n" + "2.hiển thị" + "\n" + "3.tìm kiếm"+"\n" + "4.tìm kiếm tên");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    User user = addUser();
                    this.userController.findNo(user);
                    break;
                case 2:
                    List<User> userList = this.userController.add();
                    display(userList);
                    break;
                case 3:
                    User user1 = search();
                    System.out.println(user1);
                    break;
                case 4:
                    User user2 = search1();
                    System.out.println(user2);
                    break;
            }
        }
    }

    private User search1() {
        System.out.println("tên sản phẩm");
        String name = scanner.nextLine();
        return this.userController.searchUser1(name);
    }

    private User search() {
        System.out.println("Mã sản phẩm");
        String code = scanner.nextLine();
        return this.userController.searchUser(code);
    }

    private User addUser() {
        System.out.println("Mã sản phẩm");
        String code = scanner.nextLine();
        System.out.println("Tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Giá");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Hàng sản xuất");
        String manufactured = scanner.nextLine();
        System.out.println("Mô tả");
        String describe = scanner.nextLine();
        return new User(code, name, price, manufactured, describe);
    }

    private void display(List<User> userList) {
        for (User a : userList) {
            System.out.println(a);
        }
    }
}
