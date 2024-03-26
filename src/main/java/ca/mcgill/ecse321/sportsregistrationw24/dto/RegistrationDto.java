package ca.mcgill.ecse321.sportsregistrationw24.dto;

import ca.mcgill.ecse321.sportsregistrationw24.model.keys.RegistrationId;

import java.sql.Date;

public class RegistrationDto {
  String courseTypeName;
  RegistrationId registrationId;
  String paymentInfoCardNumber;
  Integer registrationPrice;
  Date registrationDate;

  public RegistrationDto(String courseTypeName, RegistrationId registrationId, String paymentInfoCardNumber, Integer registrationPrice, Date registrationDate) {
    this.courseTypeName = courseTypeName;
    this.registrationId = registrationId;

    // Hide card information (only expose last 4 digits of card)
    StringBuilder processedCardNumber = new StringBuilder("**** **** **** ");
    for (int i = 4; i > 0; i--) { // TODO - Change back to i = 11 i < 7
      processedCardNumber.append(paymentInfoCardNumber.charAt(i));
    }

    this.paymentInfoCardNumber = processedCardNumber.toString();
    this.registrationPrice = registrationPrice;
    this.registrationDate = registrationDate;
  }

  public String getCourseTypeName() { return this.courseTypeName; }
  public RegistrationId getRegistrationId() { return this.registrationId; }
  public String getPaymentInfoCardNumber() { return this.paymentInfoCardNumber; }
  public Integer getRegistrationPrice() { return this.registrationPrice; }
  public Date getRegistrationDate() { return this.registrationDate; }
}