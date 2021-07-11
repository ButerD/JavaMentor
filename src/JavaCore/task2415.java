package JavaCore;

public class task2415 {
public int determineGroup(int age) {
    if ((age >= 7) && (age <= 13)) {
        return 1;
    }
    if ((age >= 14) && (age <= 17)) {
        return 2;
    }
    if ((age >= 18) && (age <= 65)) {
        return 3;
    }
    return -1;
}
}
