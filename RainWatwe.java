class RainWater {
    public static void main(String[] args) {

        int a[] = { 3, 0, 2, 0, 4 };
        int n = a.length;

        int water = 0;

        for (int i = 1; i < n - 1; i++) {
            int leftMax = 0, rightMax = 0;

            for (int j = 0; j <= i; j++)
                if (a[j] > leftMax)
                    leftMax = a[j];

            for (int j = i; j < n; j++)
                if (a[j] > rightMax)
                    rightMax = a[j];

            water = water + (Math.min(leftMax, rightMax) - a[i]);
        }

        System.out.println("Water = " + water);
    }
}
