package org.gkginfo.lecture;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;

public class User {

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  private String name;
  private String city;
  private LocalDate dateOfBirth;

  public User(String name, String city, LocalDate dateOfBirth) {
    this.name = name;
    this.city = city;
    this.dateOfBirth = dateOfBirth;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public int getAge() {
    return dateOfBirth.until(IsoChronology.INSTANCE.dateNow())
        .getYears();
  }

  @Override
  public String toString() {

    StringBuilder builder = new StringBuilder();
    builder
        .append("User{name=")
        .append(name)
        .append(", city")
        .append(city)
        .append(", dateOfBirth=")
        .append(dateOfBirth)
        .append("}");

    return builder.toString();
  }
}