package vn.hoidanit.laptopshop.domain;

<<<<<<< HEAD
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
// @Table(name = "nguoi_dung")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email, passWord, phone, fullName, addRess;

    public long getId() {
        return id;
    }

    public void setId(long id) {
=======
public class User {
    private String id;
    private String email;
    private String password;
    private String fullName;
    private String address;
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
>>>>>>> fc1709978b910fdac5f88599ac4d86c46d95b291
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

<<<<<<< HEAD
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
=======
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
>>>>>>> fc1709978b910fdac5f88599ac4d86c46d95b291
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

<<<<<<< HEAD
    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
=======
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
>>>>>>> fc1709978b910fdac5f88599ac4d86c46d95b291
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "User [id=" + id + ", email=" + email + ", passWord=" + passWord + ", phone=" + phone + ", fullName="
                + fullName + ", addRess=" + addRess + "]";
    }

}
=======
        return "User [id=" + id + ", email=" + email + ", password=" + password + ", fullName=" + fullName
                + ", address=" + address + ", phone=" + phone + "]";
    }

}
>>>>>>> fc1709978b910fdac5f88599ac4d86c46d95b291
