public class ElectricFee {
    public static int electricFee(int kWh) {
        if (kWh < 0 || kWh > 9999) {
            return -1;
        } else if (kWh <= 100) {
            return kWh * 2000;
        } else if (kWh <= 200) {
            return 100 * 2000 + (kWh - 100) * 1500;
        }  else {
            return 100 * 2000 + 100 * 1500 + (kWh - 200) * 1200;
        }
    }
}
