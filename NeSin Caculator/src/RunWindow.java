import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class RunWindow {
    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("내신계산기 for 대한민국 9등급 내신산출제");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setSize(500, 600);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);


        JPanel panel = new JPanel(); //make JPanel

        JTextField howManyPeopleInput = new JTextField(10); // 10 is the initial width in columns

        panel.add(howManyPeopleInput); //attach JTF onto JPanel
        mainFrame.add(panel); //attach JPanel onto JFrame


        final String[] JTFinputText = {""};

        //Real-time update
        howManyPeopleInput.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateText();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                updateText();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                updateText();
            }
            private void updateText() {
                JTFinputText[0] = howManyPeopleInput.getText(); //어으 IntelliJ 덕분에 살았다 ㅋㅋ, alt+enter아니었으면 이거 해결하는데 한시간 걸릴듯
                System.out.println("Text from JTextField: " + JTFinputText[0]); //for debugging, after debugging this should be changed to 'store-in-var'
            }
        });



        howManyPeopleInput.requestFocusInWindow(); //FOCUS ONTO THE JTFinput(a.k.a. howManyPeopleInput)
        mainFrame.setVisible(true);

    }
}
