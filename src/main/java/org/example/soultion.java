package org.example;

import java.util.Arrays;

public class soultion {
    public static void main(String[] args) {

        boolean result = Math.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(3);
        System.out.println("3은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + result);

        int rs = one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        int rs1 = one_to_n_prime_numbers_count1(20);
        System.out.println("rs : " + rs1);
        // rs :  6
//        int[] rs2 = one_to_n_prime_numbers_count2(23);
//        System.out.println(Arrays.toString(rs2));
        // rs :  9

    }

    static int one_to_n_prime_numbers_count(int i) {
        //소수 찾기 처음에 2와 3의 배수만 제외시키면 된다고 생각한게 큰 실수
        //아이러니한게 난 5와 7도 제외시켜야 되는걸 처음에는 생각해두고 왜 갑자기 2와 3의 배수만 제외시키면 된다고
        //혼자 굳게 믿었던거지???? 근데 코드가 너무 지저분해
        int PrimNumber = 4;
        for (int a = 2; a <= i; a++) {
            if (a % 2 != 0) {
                if (a % 3 != 0) {
                    if (a % 5 != 0) {
                        if (a % 7 != 0) {
                            PrimNumber++;
                        }
                    }
                }
            }
        }
        return PrimNumber;
    }
    //위의 코드를 이렇게 바꾸면 좀더 보기에는 좋아짐 소수는 2의배수3의배수5의배수7의배수를 제외하면 된다.
    //저배수의 제외규칙을 지켜 좀 다르게 만들어보자.
    static int one_to_n_prime_numbers_count1(int i) {
        int aa = 4;
        for (int a = 2; a <= i; a++) {
            if (a % 2 != 0 && a % 3 != 0 && a % 5 != 0 && a % 7 != 0) {
                aa++;
            }
        }
        return aa;
    }
//    static int[] one_to_n_prime_numbers_count2(int i) {
//        // 배열로 만들어보자 규칙은 2,3,5,7의 배수를 제외 하는 방식으로 하고
//        // 최대한 내가 정하는 기초 값이 적게 만들어보자
//        int[] arr = new int[i];
//        //배열에 숫자 넣기
//        for(int a=0; a < i; a++){
//            arr[a] = a + 1;
//            }
//        //2에서7까지 2를 다 곱해서 그 값을 배열에서 지울거임
//        //반복문 한번만 쓰고 싶었는데 불가능할듯 그냥 이중 반복문 써야할듯
//        for(int a=1; a <= i; a++)//23번 반복함 23번 반복할 필요가 없을거 같은데?
//            //왜냐면 2,3,5,7의 배수번째 배열에 있는 값을 제외 할거니까 많이 반복할 필요 없을 거같은데?
//            for(int b = 2*a;){
//                arr[b+1] = 0;
//
//            }
//
//        }
//
//        return arr;
//        }

    }

class Math {
    static boolean isPrimeNumber(int i) {
        return true;
    }

}
