public class BonusService {
    public int calculate (int amount, boolean registred) {

        int percent = registred ? 3 : 1;
        int bonus = amount * percent / 100;
        int lim = 500;

        if (bonus > lim) {
            bonus = lim;
        }
        return bonus;
    }
}
