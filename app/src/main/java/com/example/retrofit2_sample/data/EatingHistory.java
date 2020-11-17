package com.example.retrofit2_sample.data;

import java.time.LocalDateTime;


public class EatingHistory {
    private int id;//auto_increment

    private Member member;//DB는 Object를 저장할 수 있다. FK, 자바는 오브젝트를 저장할 수 있다.

    private TimeCode timeCode;

    private Food food;

    private LocalDateTime eatingDate;

    private LocalDateTime registerDate;
}
