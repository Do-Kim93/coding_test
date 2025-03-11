package org.example;

import java.util.Scanner;

class codeup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  문제 - 자동차 객체를 담을 변수를 만들어주세요.
        Car car1 = new Car();
//  문제 - 자동차 객체를 만들고 변수에 담아주세요.
        car1.car_color = "black";
        car1.car_model = "k9";
        car1.car_price = "1억";
        car1.car_year = "25년식";
        car1.max_speed = 250;
        car1.run(10);

        Car car2 = new Car();
//  문제2 - 입력값 받아 객체에 값을 전달 및 출력하기
        car2.car_color = sc.next();
        car2.car_model = sc.next();
        car2.car_price = sc.next();
        car2.car_year = sc.next();
        car2.max_speed = sc.nextInt();
        car1.run(sc.nextInt());

        Car car3 = new Car();
//  문제3 - 입력값에 무엇을 입력해야하는 조건 알게하기
        System.out.println("차량의 색상을 입력하세요");
        car3.car_color = sc.next();
        System.out.println("차량의 모델을 입력하세요");
        car3.car_model = sc.next();
        System.out.println("차량의 가격을 입력하세요");
        car3.car_price = sc.next();
        System.out.println("차량의 년식을 입력하세요");
        car3.car_year = sc.next();
        System.out.println("속도는 숫자만 입력 가능합니다.");
        car3.max_speed = sc.nextInt();
        System.out.println("몇초간 달릴지 입력하세요");
        System.out.println("시간은 숫자만 입력 가능합니다.");
        car3.run(sc.nextInt());
    }
}

//문제 - 자동차 설계도를 만들어주세요.
class Car {
    String car_model;
    String car_price;
    String car_color;
    String car_year;
    int max_speed;

    // 문제 : 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
    void run(int time) {
        System.out.println(this.car_color + " " + this.car_model + "이 " + this.max_speed + "/s의 속도로" + time + " 초간 달려 " + this.max_speed * time + "미터 달렸습니다.");
    }

}