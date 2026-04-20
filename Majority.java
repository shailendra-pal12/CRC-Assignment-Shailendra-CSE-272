class Majority {
    public static void main(String[] args) {

        int a[] = { 2, 2, 1, 2, 3, 2, 2 };

        int candidate = 0, count = 0;

        for (int x : a) {
            if (count == 0) {
                candidate = x;
                count = 1;
            } else if (x == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println("Majority = " + candidate);
    }
}
