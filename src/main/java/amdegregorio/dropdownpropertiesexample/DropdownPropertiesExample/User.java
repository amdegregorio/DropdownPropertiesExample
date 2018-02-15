package amdegregorio.dropdownpropertiesexample.DropdownPropertiesExample;

public class User {
   private Long id;
   private String userName;
   private String fullName;
   private String userRole;
   private String status;
   public Long getId() {
      return id;
   }
   public void setId(Long id) {
      this.id = id;
   }
   public String getUserName() {
      return userName;
   }
   public void setUserName(String userName) {
      this.userName = userName;
   }
   public String getFullName() {
      return fullName;
   }
   public void setFullName(String fullName) {
      this.fullName = fullName;
   }
   public String getUserRole() {
      return userRole;
   }
   public void setUserRole(String userRole) {
      this.userRole = userRole;
   }
   public String getStatus() {
      return status;
   }
   public void setStatus(String status) {
      this.status = status;
   }
   
   @Override
   public String toString() {
      return "User [id=" + id + ", userName=" + userName + ", fullName=" + fullName + ", userRole=" + userRole
               + ", status=" + status + "]";
   }
}
