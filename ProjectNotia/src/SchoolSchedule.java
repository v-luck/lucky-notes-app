/*
Jin Le
2nd Period
Prints classes
*/

public class SchoolSchedule {
    public static void main(String args[]) {
        periodNumber(1);
        periodNumber(2);
        periodNumber(3);
        periodNumber(4);
        periodNumber(5);
        periodNumber(6);
    }

    public static void period(int period, String typeOfClass, String teacher, String room) {
        System.out.printf("%d %s %s %s \n", period, typeOfClass, teacher, room);
    }

    public static void periodNumber(int periodNumber) {
        switch (periodNumber) {
            case 1:
                period(1, "Digital Electronigs", "Mr.Millard", "401");
                break;
            case 2:
                period(2, "AP CSA", "Mr.Holcomb", "503");
                break;
            case 3:
                period(3, "AP Physics 1", "Benn", "511");
                break;
            case 4:
                period(4, "English 12", "Roberts", "P-C");
                break;
            case 5:
                period(5, "American Government","Rohas", "902");
                break;
            case 6:
                period(6, "AP Calc AB", "Bhasin", "P5");
                break;
        }
    }


}


