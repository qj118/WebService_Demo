package org.demon.service;

import org.demon.entity.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * @Path 作用在类上表示访问当前服务对应的根路径
 *       作用在方法上表示访问当前服务的子路径
 * @Produces 指定服务器支持的返回的数据类型
 * @Consumes 指定服务器支持的请求的数据类型
 * @PathParam 指定路径请求的占位符
 */
@Path("/userService")
@Produces("*/*")
public interface UserService {

    @POST
    @Path("/user")
    @Consumes({"application/xml", "application/json"})
    void saveUser(User user);

    @PUT
    @Path("/user")
    @Consumes({"application/xml", "application/json"})
    void updateUser(User user);

    @GET
    @Path("/user")
    @Produces({"application/xml", "application/json"})
    List<User> findAllUsers();

    @GET
    @Path("/user/{id}")
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/xml", "application/json"})
    User findUserById(@PathParam("id") Integer id);

    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/xml", "application/json"})
    void deleteUser(@PathParam("id") Integer id);
}
