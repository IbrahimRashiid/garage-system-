package SW_assignment;

public class Income {
    static float totalIncome;

    //Default constructor
    Income() {
        totalIncome = 0f;
    }

    static void setTotalIncome(float i) {
        totalIncome = i;
    }
    
    static float getTotalIncome() {
        return totalIncome;
    }
}
