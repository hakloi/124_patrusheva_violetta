public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        int n = 1;
        int result = 1;
        int k = 1;
        while (result <= num) {
            k = result;
            result = n * n;
            n++;
        }
        return k;
    }

    @Override
    public int subtask_2_while(int num) {
        int p = 1;
        int p2 = 1;
        int k = 0;
        while (k != num) {
            p = p2;
            p2 = 2 * p + 6;
            k++;
        }
        return p2;
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        int a = 0;
        int counter = base;
        while (base < num) {
            a = base;
            base *= counter;
        }
        if (base == num) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int subtask_4_while(int start, int end) {
        int counter = 0;
        int k = start;
        while (k != end) {
            if (k % 2 > 0) {
                k--;
                counter++;

            } else {
                if (k / end >= 2) {
                    k = k / 2;
                    counter++;
                } else {
                    k--;
                    counter++;
                }
            }
        }
        return counter;
    }
}
