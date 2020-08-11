package hw8;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    static final int WINDOW_POS_X = 500;
    static final int WINDOW_POS_Y = 300;
    static final int WINDOW_HEIGHT = 555;
    static final int WINDOW_WIDTH = 505;

    private SettingWindow settingWindow;
    private BattleField battleField;

    public GameWindow() {
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        settingWindow = new SettingWindow(this);
        battleField = new BattleField(this);

        add(battleField, BorderLayout.CENTER);

        JPanel panel = new JPanel(new GridLayout(1, 2));
        JButton buttonOk = new JButton("Start new game");
        panel.add(buttonOk);
        JButton buttonExit = new JButton("Exit");
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);

        buttonExit.addActionListener(e -> {
            System.exit(0);
        });

        buttonOk.addActionListener(e -> {
            settingWindow.setVisible(true);
        });

        setVisible(true);
    }

    public void startNewGame(int mode, int fieldSize, int winningLength) {
        battleField.startNewGame(mode, fieldSize, winningLength);
    }

    public void restartGame() {
        JDialog d = new JDialog();
        d.setTitle(Logic.result);

        JLabel lblRestart = new JLabel("Restart Game?");
        JButton btnYes = new JButton("Yes");
        JButton btnNo = new JButton("No");

        d.add(lblRestart, BorderLayout.CENTER);

        JPanel p = new JPanel(new GridLayout(1, 2));
        p.add(btnYes);
        p.add(btnNo);
        d.add(p, BorderLayout.SOUTH);

        btnNo.addActionListener(e -> {
            System.exit(0);
            d.setVisible(false);
        });

        btnYes.addActionListener(e -> {
            settingWindow.setVisible(true);
            d.setVisible(false);
        });

        d.setBounds(WINDOW_POS_X + 50, WINDOW_POS_Y + 50, WINDOW_HEIGHT - 350, WINDOW_WIDTH - 350);
        d.setVisible(true);

    }
}
