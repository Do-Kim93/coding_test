package org.example;


class Main {
    public static void main(String[] args) {
        //아래 코드들을 서술형으로 아주 상세하게 코드하나하나 변수 하나하나 자세하게 설명하기
        //1번 코드
//        int row = 8;
//
//        for(int i =1; i<=row; i++) {
//            for (int k = 1; k <= i; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //2번 코드
        int n = 10; // 1. 정수형 변수 n에 10이라는 정수를 저장
        for(int i=1; i <= n; i++) {//2. 정수형 변수 i에 정수 1을 저장, i가 n보다 작거나 같으면 계속 반복, i를 1식 증가
            for(int j = i; j < n; j++) {//3. 정수형 변수 j에 변수 i가 가지고 있는 정수를 할당, j가 n미만일때 계속 반복, j를 1씩 증가
                System.out.print(" ");//4.공백찍기
            }
            for (int k = 1; k <= (2*i -1); k++){//5.정수형 변수 k에 1을 할당, k가 (2*정수형 변수 i가 가지고 있는값 -1), k를 1씩 증가
                System.out.print("*");//6.별 찍기
            }
            System.out.println();//7.줄바꿈
        }
        for(int i= n-1; i >= 1; i--) {//8. 정수형 변수 i에 정수형 변수 n이 가지고있는 값-1을 할당, i가 1보다 크거나 같으면 반복, i를 1씩 감소
            for(int k = n; k > i; k--) {//9. 정수형 변수 k에 정수형 변수 n이 가지고있는 값을 할당, k가 i보다 크면 반복, k를 1씩 감소
                System.out.print(" ");//10. 공백찍기
            }
            for (int k = 1; k <= (2*i -1); k++){//11.정수형 변수 k에 1을 할당, k가 (2*정수형 변수 i가 가지고 있는값 -1), k를 1씩 증가
                System.out.print("*");//12. 별찍기
            }
            System.out.println();//13. 줄바꿈
            //만약 여길 고치면 어떻게 되는거지????
        }
    }
}