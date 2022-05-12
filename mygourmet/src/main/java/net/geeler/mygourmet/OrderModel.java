package net.geeler.mygourmet;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class OrderModel {
  @NotNull(message = "Darf nicht leer sein.")
  private String name;

  @NotNull(message = "Darf nicht leer sein.")
  public String lastName;

  @NotNull(message = "Darf nicht leer sein.")
  @Min(18)
  private Integer age;

  @NotNull(message = "Darf nicht leer sein.")
  @Pattern(regexp = "^([A-Z0-9]{4}[-]{1}){3}[A-Z0-9]{4}$", message = "Please enter with the format: XXXX-XXXX-XXXX-XXXX")
  private String cardNumber;

  @NotNull(message = "Darf nicht leer sein.")
  @Pattern(regexp = "^[0-3]{1}[0-9]{1}[-]{1}[0-1]{1}[0-9]{1}$", message = "Please enter a date with the format: MM-YY")
  private String valid;

  @NotNull(message = "Darf nicht leer sein.")
  @Pattern(regexp = "^[0-9]{3}$")
  private String cvv;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getCardNumber() {
    return this.cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getValid() {
    return this.valid;
  }

  public void setValid(String valid) {
    this.valid = valid;
  }

  public String getCvv() {
    return this.cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }
}
