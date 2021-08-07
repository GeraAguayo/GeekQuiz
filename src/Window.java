import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame{
    private JLabel etqTitulo;
    private JPanel panel;
    private JButton btnStart;
    private JLabel etqSubtitle;
    private JLabel etqMessage;

    //Constructor method
    public Window(){
        this.setTitle("Geek Quiz");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/geekQuiz.ico")));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        this.setSize(800,600);
        this.setLocationRelativeTo(null);

        //When the user click the start button
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Game game = new Game();
                game.startGame();
            }
        });
    }
}
