package com.example.validation.dto;


import com.example.validation.annotation.YearMonth;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class User {

    @NotBlank
    private String name;
    @Min(value = 0)
    private int age;

    @Valid
    private List<Car> cars;

//    private String email;

//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$" , message = "핸드폰 번호의 양식과 맞지 않습니다. 01x-xxx(x)-xxxx")
//    private String phoneNumber;
//
//    @Size(min =6, max=6)
//    @YearMonth(pattern = "yyyyMMdd")
//    private String reqYearMonth; //yyyyMM



//    public void setReqYearMonth(String reqYearMonth) {
//        this.reqYearMonth = reqYearMonth;
//    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getReqYearMonth() {
//        return reqYearMonth;
//    }


//    @AssertTrue(message = "yyyyMM의 형식에 맞지 않습니다.")
//    public boolean isReqYearMonthValidation(){
//        try{
//            System.out.println("call Assert");
//            System.out.println(getReqYearMonth());
//            System.out.println(getAge());
//            LocalDate localDate = LocalDate.parse(getReqYearMonth()+"01", DateTimeFormatter.ofPattern("yyyyMMdd"));
//        }catch (Exception e){
//            return false;
//        }
//
//        return true;
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
