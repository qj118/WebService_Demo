package org.demon.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * 基于 restful 风格的 webservice, 客户端与服务器之间通讯可以传递 xml 数据、json 数据
 * @XmlRootElement 指定对象序列化为 xml 或 json 数据的根节点名称
 */
@XmlRootElement(name = "User")
public class User {

    private Integer id;
    private String username;
    private String hobby;
    private List<Book> books;

    public User() {
    }

    public User(String username, String hobby) {
        this.username = username;
        this.hobby = hobby;
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", hobby='" + hobby + '\'' +
                ", books=" + books +
                '}';
    }
}
