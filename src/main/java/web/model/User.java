package web.model;


import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "users")
public class User {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;

     private String name;

     private String lastName;
     private Integer age;

     private String grade;

     public User() {
     }


     public User(String name, String lastName, Integer age, String grade) {
          this.name = name;
          this.lastName = lastName;
          this.age = age;
          this.grade = grade;
     }

    public Integer getId(){
          return id;
    }

    public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public Integer getAge() {
          return age;
     }

     public void setAge(Integer age) {
          this.age = age;
     }

     public String getGrade() {
          return grade;
     }

     public void setGrade(String grade) {
          this.grade = grade;
     }


     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          User user = (User) o;
          return Objects.equals(name, user.name) && Objects.equals(lastName, user.lastName) && Objects.equals(age, user.age) && Objects.equals(grade, user.grade);
     }

     @Override
     public int hashCode() {
          return Objects.hash(name, lastName, age, grade);
     }


     @Override
     public String toString() {
          return "User{" +
                  "name='" + name + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", age=" + age +
                  ", grade='" + grade + '\'' +
                  '}';
     }
}
