package service.impl;

import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
;

public class BanaryFile {
    public static void writeFile(String file, List<User> userList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(userList);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<User> readFile(String file) {
        List<User> userList = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            userList = (List<User>) objectInputStream.readObject();
        } catch (Exception e) {
           e.printStackTrace();
        }
        return userList;
    }
}
