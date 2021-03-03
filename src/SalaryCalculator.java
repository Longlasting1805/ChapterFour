public class SalaryCalculator {

    private double hourlyPay;
    private int workHour;


    public SalaryCalculator(double hourlyPay, int workHour) {
        this.hourlyPay = hourlyPay;
        this.workHour = workHour;
    }


    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getWorkHour() {
        return workHour;
    }


    public double getGrossPay() {
        double totalPay;

        if (workHour > 40) {
            int extraTime = (workHour - 40);
            totalPay = extraTime * 1500 + (40 * 1000);
        } else {
            totalPay = hourlyPay * workHour;
        }

        return totalPay;
    }
}