package a01StaticDemo1;

public class Student {
    //属性：姓名，年龄，性别
    private String name;
    private int age;
    private String gender;
    public static String teachername;//静态变量：被该类所有对象共享
                                     //         不属于对象，属于类
                                            //推荐用类名调用
                                     /*
                                     静态方法中，只能访问静态。
                                     非静态方法可以访问所以
                                       静态方法没有this关键字
                                      */
                                    //void：没有返回值


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Student() {
    }

    //行为
    public void study(){
        System.out.println(name+"正在学习");
    }

    public void show(){
        System.out.println(name + "," + age +","+gender+","+teachername);
    }
}
