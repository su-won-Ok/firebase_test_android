package com.example.myapplication_test_firebase;

public class animal {
    String name;
    String kind;

    public animal(){} // 생성자 메서드

    // getter, setter 설정

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getKind(){
        return kind;
    }

    public void setKind(String kind){
        this.kind = kind;
    }


    // 값을 추가할 때 쓰는 함수, MainActivity에서 addanimal함수에서 사용할 거임
    public animal(String name, String kind){
        this.name = name;
        this.kind = kind;
    }
}
