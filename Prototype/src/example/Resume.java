package example;

/**
 * 简历
 */
public class Resume implements Cloneable {
    private String name;
    private String gender;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String gender, String age) {
        this.gender = gender;
        this.age = age;
    } // setPersonalInfo

    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    } // setWorkExperience

    public void display() {
        System.out.printf("%s %s %s\n", name, gender, age);
        System.out.println("工作经历: " + timeArea + ", " + company);
    } // display

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅克隆, 只复制值或地址引用
        return super.clone();
    }
} // Resume
