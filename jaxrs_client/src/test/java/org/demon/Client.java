package org.demon;

import org.apache.cxf.jaxrs.client.WebClient;
import org.demon.entity.User;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.util.Collection;

public class Client {

    @Test
    public void testSave(){
        WebClient.create("http://localhost:8087/ws/userService/user")
                 .type(MediaType.APPLICATION_XML) // 默认为 text/xml，使用 type 方法修改即可，对应的是服务器端的 consumes
                 .post(new User(3, "Selina", "Taipei", null));
    }

    @Test
    public void testGetOne(){
        User user = WebClient.create("http://localhost:8087/ws/userService/user/1")
                             .accept(MediaType.APPLICATION_JSON) // 对应的是服务器端的 produces
                             .get(User.class);
        System.out.println(user);
    }

    @Test
    public void testGetAll(){
        Collection<? extends User> users = WebClient.create("http://localhost:8087/ws/userService/user")
                                                    .accept(MediaType.APPLICATION_JSON)
                                                    .getCollection(User.class);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testUpdate(){
        WebClient.create("http://localhost:8087/ws/userService/user")
                 .type(MediaType.APPLICATION_JSON)
                 .put(new User(3, "Selina", "Taipei", null));
    }

    @Test
    public void testDelete(){
        WebClient.create("http://localhost:8087/ws/userService/user/1")
                .type(MediaType.APPLICATION_JSON)
                .delete();
    }

}
