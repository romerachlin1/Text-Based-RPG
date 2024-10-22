import javax.swing.*;
import java.awt.*;
import java.awt.Font;

public class GUI {

    static Font normalFont = new Font("Times New Roman", Font.PLAIN,30);

    public static void Game(){
        Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);

        JFrame window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
        Container container = window.getContentPane();

        JPanel titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,150);
        titleNamePanel.setBackground(Color.BLACK);
        JLabel titleNameLabel = new JLabel("CHOSEN");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        JPanel startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.BLACK);

        JButton startButton = new JButton("START");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        container.add(titleNamePanel);
        container.add(startButtonPanel);
    }
}
