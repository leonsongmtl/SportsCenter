package ca.mcgill.ecse321.sportsregistrationw24.dto;
@Deprecated
public class OwnerAccountSafeDto {
  private String email;
  private String name;

  public OwnerAccountSafeDto() {
  }

  public OwnerAccountSafeDto(String email, String name) {
    this.email = email;
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }
  public String getName() { return this.name; }
}
