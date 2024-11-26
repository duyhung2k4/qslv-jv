package ms.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Login {
    private ms.Gui.Login.Frame loginFrame;
    private ms.Gui.Teacher.Frame teacherFrame;

    public Login(
        ms.Gui.Login.Frame loginFrame,
        ms.Gui.Teacher.Frame teacherFrame
    ) {
        this.loginFrame = loginFrame;
        this.teacherFrame = teacherFrame;

        this.loginFrame.jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {click();}
        });

        this.loginFrame.jCheckBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {showPassword(e);};
        });
    }

    private void click() {
        System.out.println("Nút Đăng nhập được nhấn!");
        this.loginFrame.setVisible(false);
        this.teacherFrame.setVisible(true);
    }

    private void showPassword(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            this.loginFrame.jTextField2.setEchoChar((char) 0); // Hiện mật khẩu
        } else {
            this.loginFrame.jTextField2.setEchoChar('*'); // Ẩn mật khẩu
        }
    }
}
