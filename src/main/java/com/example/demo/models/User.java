package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;


/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-02-15T07:26:22.438049028Z[GMT]")


public class User {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("firstName")
    private String firstName = null;

    @JsonProperty("lastName")
    private String lastName = null;

    @JsonProperty("middleName")
    private String middleName = null;

    @JsonProperty("email")
    private String email = null;

    @JsonProperty("password")
    private String password = null;

    @JsonProperty("address1")
    private String address1 = null;

    @JsonProperty("address2")
    private String address2 = null;

    @JsonProperty("city")
    private Long city = null;

    @JsonProperty("state")
    private Long state = null;

    @JsonProperty("country")
    private Long country = null;

    @JsonProperty("mobileNo")
    private String mobileNo = null;

    @JsonProperty("landlineNo")
    private String landlineNo = null;

    public User id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get firstName
     *
     * @return firstName
     **/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public User lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     *
     * @return lastName
     **/
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Get middleName
     *
     * @return middleName
     **/
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get password
     *
     * @return password
     **/
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User address1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * Get address1
     *
     * @return address1
     **/
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public User address2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * Get address2
     *
     * @return address2
     **/
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public User city(Long city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     *
     * @return city
     **/
    public Long getCity() {
        return city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public User state(Long state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     **/
    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public User country(Long country) {
        this.country = country;
        return this;
    }

    /**
     * Get country
     *
     * @return country
     **/
    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    public User mobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }

    /**
     * Get monileNo
     *
     * @return monileNo
     **/
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public User landlineNo(String landlineNo) {
        this.landlineNo = landlineNo;
        return this;
    }

    /**
     * Get landlineNo
     *
     * @return landlineNo
     **/
    public String getLandlineNo() {
        return landlineNo;
    }

    public void setLandlineNo(String landlineNo) {
        this.landlineNo = landlineNo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.id, user.id) &&
                Objects.equals(this.firstName, user.firstName) &&
                Objects.equals(this.lastName, user.lastName) &&
                Objects.equals(this.middleName, user.middleName) &&
                Objects.equals(this.email, user.email) &&
                Objects.equals(this.password, user.password) &&
                Objects.equals(this.address1, user.address1) &&
                Objects.equals(this.address2, user.address2) &&
                Objects.equals(this.city, user.city) &&
                Objects.equals(this.state, user.state) &&
                Objects.equals(this.country, user.country) &&
                Objects.equals(this.mobileNo, user.mobileNo) &&
                Objects.equals(this.landlineNo, user.landlineNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, middleName, email, password, address1, address2, city, state, country, mobileNo, landlineNo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
        sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    monileNo: ").append(toIndentedString(mobileNo)).append("\n");
        sb.append("    landlineNo: ").append(toIndentedString(landlineNo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
