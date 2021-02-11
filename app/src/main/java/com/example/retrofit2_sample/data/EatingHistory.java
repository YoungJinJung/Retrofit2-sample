package com.example.retrofit2_sample.data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class EatingHistory {
    private int id;//auto_increment

    private Member member;//DB는 Object를 저장할 수 있다. FK, 자바는 오브젝트를 저장할 수 있다.

    private TimeCode timeCode;

    private List<Food> foodList = new ArrayList<>();

    private LocalDateTime eatingDate;

    private LocalDateTime registerDate;

    public EatingHistory(int id, Member member, TimeCode timeCode, List<Food> foodList, LocalDateTime eatingDate, LocalDateTime registerDate) {
        this.id = id;
        this.member = member;
        this.timeCode = timeCode;
        this.foodList = foodList;
        this.eatingDate = eatingDate;
        this.registerDate = registerDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public TimeCode getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(TimeCode timeCode) {
        this.timeCode = timeCode;
    }


    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public LocalDateTime getEatingDate() {
        return eatingDate;
    }

    public void setEatingDate(LocalDateTime eatingDate) {
        this.eatingDate = eatingDate;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }
}
