class Days {
    public static void main(String[] args) {
        int days = 500;
        int year = days / 365;
        int week = (days % 365) / 7;
        int d = (days % 365) % 7;
        System.out.println(year + " years " + week + " weeks " + d + " days");
    }
}
