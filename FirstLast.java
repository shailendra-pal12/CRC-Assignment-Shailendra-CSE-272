class FirstLast {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 2, 4, 2 };
        int key = 2;

        int first = -1, last = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                if (first == -1)
                    first = i;
                last = i;
            }
        }

        System.out.println("First = " + first);
        System.out.println("Last = " + last);
    }
}
