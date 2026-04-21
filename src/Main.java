import taxes.USNIncome;
import taxes.USNIncomeMinusExpenses;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Рога и Копыта", new USNIncome());
        company.shiftMoney(1000);   // доход +1000
        company.shiftMoney(300);    // доход +300
        company.shiftMoney(-200);   // расход +200
        company.payTaxes();
        company.setTaxSystem(new USNIncomeMinusExpenses());
        company.shiftMoney(2000);   // доход +2000
        company.shiftMoney(-500);   // расход +500
        company.payTaxes();

    }
}