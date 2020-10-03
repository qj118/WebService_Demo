package org.demon;

import org.apache.cxf.jaxrs.client.WebClient;
import org.demon.entity.User;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.util.Collection;

public class Client {

    @Test
    public  void testSave(){
        User user = new User("Selina", "Eat");
        WebClient.create("http://localhost:8080/rs/userService/user")
                 .type(MediaType.APPLICATION_XML)
                 .post(user);
    }

    @Test
    public void testFindOne(){
        User user = WebClient.create("http://localhost:8080/rs/userService/user/1")
                 .accept(MediaType.APPLICATION_JSON)
                 .get(User.class);
        System.out.println(user);
    }

    @Test
    public void testFindAll(){
        Collection<? extends User> users = WebClient.create("http://localhost:8080/rs/userService/user")
                .accept(MediaType.APPLICATION_JSON)
                .getCollection(User.class);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testUpdate(){
        User user = new User("Selina", "Hebe");
        user.setId(4);
        WebClient.create("http://localhost:8080/rs/userService/user")
                 .type(MediaType.APPLICATION_XML)
                 .put(user);
    }

    @Test
    public void testDelete(){
        WebClient.create("http://localhost:8080/rs/userService/user/4")
                 .type(MediaType.APPLICATION_XML)
                 .delete();
    }
}
