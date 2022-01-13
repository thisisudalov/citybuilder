import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoneyGivingListener implements ActionListener {

    private static final int TICK_VALUE = 100;

    private PlayerMoney playerMoney;

    public MoneyGivingListener() {
        this.playerMoney = PlayerMoney.getInstance();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        playerMoney.increaseValue(TICK_VALUE);
    }
}
