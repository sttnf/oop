public class Grade {
    public static void main(String[] args) {
        int[] nilai = {88, 26, 67, 92, 55, 49};

        for (int i = 0; i < nilai.length; i++) {
            char grade = ' ';
            if (nilai[i] >= 90) {
                grade = 'A';
            } else if (nilai[i] >= 80) {
                grade = 'B';
            } else if (nilai[i] >= 70) {
                grade = 'C';
            } else if (nilai[i] >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }
            System.out.println("Grade = " + grade);
        }


    }
}
