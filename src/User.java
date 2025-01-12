import java.time.LocalDate;

public class User
{
    private int userId;
    private String userName;
    private String email;
    private int phoneNo;
    private String password;
    private String address;
    private LocalDate createdDate;
    private LocalDate lastLogin;
    public User(){}

    public User(int userId, String userName, String email, int phoneNo, String password, String address, LocalDate createdDate, LocalDate lastLogin)
    {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
        this.address = address;
        this.createdDate = createdDate;
        this.lastLogin = lastLogin;
    }
    public User(int userId, String userName, String email, int phoneNo, String password, String address, LocalDate createdDate)
    {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
        this.address = address;
        this.createdDate = createdDate;
    }
    public User(int userId, String userName, String email, int phoneNo, String password, String address)
    {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
        this.address = address;
    }
    public User(int userId, String userName, String email, int phoneNo, String password)
    {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
    }
    public User(int userId, String userName, String email, int phoneNo)
    {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.phoneNo = phoneNo;
    }
    public User(int userId, String userName, String email)
    {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }
    public User(int userId, String userName)
    {
        this.userId = userId;
        this.userName = userName;
    }
    public User(int userId)
    {
        this.userId=userId;
    }
    public int getUserId()
    {
        return userId;
    }
    public String getUserName()
    {
        return userName;
    }
    public String getEmail()
    {
        return email;
    }
    public int getPhoneNo()
    {
        return phoneNo;
    }
    public String getPassword()
    {
        return password;
    }
    public String getAddress()
    {
        return address;
    }
    public LocalDate getCreatedDate()
    {
        return createdDate;
    }
    public LocalDate getLastLogin()
    {
        return  lastLogin;
    }
    public void setUserId(int userId)
    {
        this.userId = userId;
    }
    public void setUserName(String userName)
    {
        this.userName=userName;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setCreatedDate(LocalDate createdDate)
    {
        this.createdDate = createdDate;
    }
    public void setLastLogin(LocalDate lastLogin)
    {
        this.lastLogin = lastLogin;
    }
    public void setPhoneNo(int phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo=" + phoneNo +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", createdDate=" + createdDate +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
