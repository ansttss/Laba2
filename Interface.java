import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import javax.swing.*;

public class Interface extends JFrame {

    static int i = 0;

    public Interface() {
        super("Тестовое окно");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Verdana", Font.PLAIN, 10);
        final JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setFont(font);

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());

        JPanel buttons = new JPanel();
        content.add(buttons, BorderLayout.SOUTH);

        tabbedPane.addTab("Девайси", new JPanel());
        tabbedPane.addTab("Аксесуари", new JPanel());

        JButton add = new JButton("Додати");
        add.setFont(font);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tabbedPane.addTab(DataInput.getString("Назва розділу: "), new JPanel());

            }
        });
        buttons.add(add);

        JButton remove = new JButton("Видалити");
        remove.setFont(font);
        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int select = tabbedPane.getSelectedIndex();
                if (select >= 0) {
                    tabbedPane.removeTabAt(select);
                }
            }
        });
        buttons.add(remove);

        content.add(tabbedPane, BorderLayout.CENTER);

        getContentPane().add(content);

        setPreferredSize(new Dimension(800, 600));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new Interface();
            }
        });
    }
}
