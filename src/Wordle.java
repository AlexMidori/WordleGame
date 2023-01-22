import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wordle extends JFrame {
    JTextField NumberLetter2, letter1, letter2, letter3, letter4, letter5;
    JLabel LetterNumber;
    JButton OKButton, clearButton;
    JPanel panelMain;
    JLabel message1;

    public Wordle() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkNumber();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearNumber();
            }
        });
    }

        public void checkNumber() {
            int number = Integer.parseInt(NumberLetter2.getText());
            if (number == 2) {
                letter3.setVisible(false);
                letter4.setVisible(false);
                letter5.setVisible(false);
            }
            if (number == 3) {
                letter4.setVisible(false);
                letter5.setVisible(false);
            }
            if (number == 4) {
                letter5.setVisible(false);

            }else{
                message1.setVisible(true);
            }
    }
        public void clearNumber(){
            message1.setVisible(false);
            NumberLetter2.setText("");
            letter1.setVisible(true);
            letter1.setText("");
            letter2.setVisible(true);
            letter2.setText("");
            letter3.setVisible(true);
            letter3.setText("");
            letter4.setVisible(true);
            letter4.setText("");
            letter5.setVisible(true);
            letter5.setText("");
    }


    public static void main(String[] args) {
        Wordle h = new Wordle();
        h.setContentPane(h.panelMain);
        h.setTitle("Wordle Game");
        h.setSize(800, 400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
