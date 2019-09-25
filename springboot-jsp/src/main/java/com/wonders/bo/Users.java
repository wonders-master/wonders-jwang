package com.wonders.bo;

/**
 * @Auther:jwang
 * @Date:2019/9/25
 * @Description:com.wonders.bo
 * @Version 1.0
 **/
public class Users {

    private Integer id;
    private String name;
    private Integer age;

    public Users(Integer id, String name, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Users() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }


}
