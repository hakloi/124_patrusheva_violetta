import java.util.Arrays;

public class Task_4 implements Task_4_base {
    @Override
    public int[] subtask_1_arrays(int size, int a0, int d) {
        int[] arr = new int[size];
        arr[0] = a0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + d;
        }
        return arr;
    }

    @Override
    public int[] subtask_2_arrays(int size) {
        // сгенерировать и вернуть массив размера size, первые два элемента
        // которого равны единице, а каждый следующий - сумме всех предыдущих
        int[] arr = new int[size];
        int sum = 2;
        arr[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i <= 1) {
                arr[i] = 1;
            } else {
                arr[i] = sum;
                sum += sum;
            }
        }
        return arr;
    }

    @Override
    public int[] subtask_3_arrays(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == 0)
                arr[i] = 0;
            else if (i == 1)
                arr[i] = 1;
            else
                arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr;
        // https://ru.wikipedia.org/wiki/Числа_Фибоначчи
    }

    @Override
    public int subtask_4_arrays(int[] data) {
        int max_num = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max_num)
                max_num = data[i];
        }
        return max_num;
    }

    @Override
    public int subtask_5_arrays(int[] data, int k) {
        int max_num = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max_num && data[i] % k==0)
                max_num = data[i];
        }
        return max_num;
    }

    @Override
    public int[] subtask_6_arrays(int[] arr1, int[] arr2) {
        int arr3[] = new int[arr1.length + arr2.length];
        int size1 = arr1.length;
        int size2 = arr2.length;
        int i = 0; // индекс arr1 
        int j = 0; // индекс arr2
        int k = 0; // индекс arr3
        while (i < size1 && j < size2){
            if (arr1[i] <= arr2[j]){
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k]= arr2[j];
                j++;
            }
            k++;
            }
        while (i < size1){
            arr3[k]= arr1[i];
            i++;
            k++;
        }
        while (j < size2){
            arr3[k]= arr2[j];
            j++;
            k++;
        } 
        Arrays.sort(arr3); // импортировала import java.util.Arrays; для сортировки по возрастанию
        return arr3;
        }

    @Override
    public int[] subtask_7_arrays(int[] arr1, int[] arr2) {
        // Даны два отсортированных по возрастанию массива arr1, arr2.
        // Произвести слияние данных массивов в один также отсортированный
        // по возрастанию массив.
        // Используйте алгоритм, время работы которого будет пропорционально сумме
        // размеров arr1 и arr2, а не их произведению
        return null;
    }
}
