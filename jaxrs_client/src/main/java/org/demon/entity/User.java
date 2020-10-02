package org.demon.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 基于 restful 风格的 webservice, 客户端与服务器之间通讯可以传递 xml 数据、json 数据
 * @XmlRootElement 指定对象序列化为 xml 或 json 数据的根节点名称
 */
@XmlRootElement(name = "User")
public class User {

    private Integer id;
    private String username;
    private String city;

    private List<Car> cars = new ArrayList<>();

    public User() {
    }

    public User(Integer id, String username, String city, List<Car> cars) {
        this.id = id;
        this.username = username;
        this.city = city;
        this.cars = cars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", city='" + city + '\'' +
                ", cars=" + cars +
                '}';
    }
}
