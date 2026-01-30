package com.skibidop.temp.repositories;

//จำลองว่าเป็น database แปปปปป

import java.util.ArrayList;
import java.util.List;

import com.skibidop.temp.models.UserData;

public class UserRepo {
    //list users array (Example database)
    private List<UserData> users = new ArrayList<>();
    
    public List<UserData> getUsers(){
        return users;
    }

    public void addUser(UserData user){
        users.add(user);
    }

    public void removeUser(UserData user){
        users.remove(user);
    }

}
