package coding.java_standard._02_Arrays;

import java.util.Arrays;

public class E11_6 {

    // Arrays : 배열을 다루기 편리한 메서드(static) 제공
    // 유사하게 Math, Objects, Collections들도 static 메서드들을 제공한다.
    // 1. 배열의 출력 - toString()
    // 2. 배열의 복사 - copyOf(), copytOfRange() : 새로운 배열을 생성해서 반환을 해준다.
    // 3. 배열 채우기 - fill(), setAll()
    // 4. 배열의 정렬과 검색 - sort(), binarySearch()
    // 5. 다차원 배열의 출력 - deepToString()
    // 6. 다차원 배열의 비교 - deepEquals()
    // 7. 배열을 List로 변환 - asList(Object... a) // ...은 가변 매개변수
    // 읽기 전용이기에 데이터 수정이 안된다.
    // 데이터를 추가하려면 새로운 리스틀르 만들어서 넣어줘야 한다.
    // 8. 람다와 스트림 - parallelXXX(), spliterator(), stream()
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13}, {21,22,23}};

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2D = " + Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
        System.out.println("arr5 = " + Arrays.toString(arr5));
        System.out.println("arr6 = " + Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println("Arrays.toString(arr7) = " + Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
        System.out.println("Arrays.toString(arr7 = " + Arrays.toString(arr7));

        // char - > String : toCharArray(String)
        for (int i : arr7){ // 향상된 for문
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i); // String -> char : new String(char[])
        }

        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2  = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2)); // false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

        char[] chArr = {'A', 'D', 'C', 'B', 'E'};

        System.out.println("chrArr.toString(chArr) = " + Arrays.toString(chArr));
        System.out.println("index of B : " + Arrays.binarySearch(chArr, 'B')); // 정렬하지 않으면 이상한 값
        Arrays.sort(chArr);
        System.out.println("chrArr.toString(chArr) = " + Arrays.toString(chArr));
        System.out.println("index of B : " + Arrays.binarySearch(chArr, 'B'));


    }
}
