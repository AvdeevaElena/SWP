package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Model {
    private static Model instance = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(User user) {
        model.add(user);
    }

    public void delete(User deleteUser) {
      for (int i = 0; i< model.size(); i++) {
          if (deleteUser.getName().equals(  model.get(i).getName()) && (deleteUser.getPassword().equals( model.get(i).getPassword()))){
             User bDelete = model.remove(i);
          }

      }

        //  model.add(user);
    }

    public List<String> list() {
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }



}
