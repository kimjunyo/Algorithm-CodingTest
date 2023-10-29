### 병합 정렬

1. 정의
    1. 병합 정렬은 재귀함수 이용
    2. 주어진 배열을 원소가 하나 밖에 남지 않을 때까지 계속 둘로 쪼갠 후에 다시 크기 순으로 재배열 하면서 원래 크기의 배열로 합칩니다.
2. 시간 복잡도
    1. 8 -> 4 -> 2 -> 1 식으로 전반적인 반복의 수는 점점 절반으로 줄어들 기 때문에 O(logN) 시간이 필요하며, 각 패스에서 병합할 때 모든 값들을 비교해야 하므로 O(N) 시간이 소모됩니다.
    2. 따라서 총 시간 복잡도는 O(NlogN) 입니다.
3. 예시<br>
[42, 32, 24, 60, 15, 5, 90 ,45]<br>
[그림으로 보기](https://visualgo.net/en/sorting)
4. 자바 코드 구현

```java
import java.util.Arrays;

public class MergeSort {
   public static int[] mergeSort(int[] arr) {
      if (arr.length < 2) return arr;

      int mid = arr.length / 2;
      int[] low_arr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
      int[] high_arr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

      int[] mergedArr = new int[arr.length];
      int m = 0, l = 0, h = 0;
      while (l < low_arr.length && h < high_arr.length) {
         if (low_arr[l] < high_arr[h])
            mergedArr[m++] = low_arr[l++];
         else
            mergedArr[m++] = high_arr[h++];
      }
      while (l < low_arr.length) {
         mergedArr[m++] = low_arr[l++];
      }
      while (h < high_arr.length) {
         mergedArr[m++] = high_arr[h++];
      }
      return mergedArr;
   }
}
```