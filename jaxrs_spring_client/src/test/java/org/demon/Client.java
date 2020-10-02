package org.demon;

import org.apache.cxf.jaxrs.client.WebClient;
import org.demon.entity.User;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.util.Collection;

public class Client {

    @Test
    public  void testSave(){
        User user = new User(3, "Selina", "Taipei", null);
        WebClient.create("http://localhost:8080/ws/userService/user")
                 .type(MediaType.APPLICATION_XML)
                 .post(user);
    }

    @Test
    public void testFindOne(){
        User user = WebClient.create("http://localhost:8080/ws/userService/user/1")
                             .accept(MediaType.APPLICATION_JSON)
                             .get(User.class);
        System.out.println(user);
    }

    @Test
    public void testFindAll(){
        Collection<? extends User> users = WebClient.create("http://localhost:8080/ws/userService/user")
                 .accept(MediaType.APPLICATION_XML)
                 .getCollection(User.class);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testUpdate(){
        User user = new User(3, "Selina", "Taipei", null);
        WebClient.create("http://localhost:8080/ws/userService/user")
                .type(MediaType.APPLICATION_XML)
                .put(user);
    }

    @Test
    public void testDelete(){
        WebClient.create("http://localhost:8080/ws/userService/user/1")
                .type(MediaType.APPLICATION_JSON)
                .delete();
    }
}
