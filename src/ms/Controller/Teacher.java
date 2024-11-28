package ms.Controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private ms.Gui.Login.Frame loginFrame;
    private ms.Gui.Teacher.Frame teacherFrame;
    private List<javax.swing.JPanel> menus;
    private List<javax.swing.JPanel> panels;

    public Teacher(
        ms.Gui.Login.Frame loginFrame,
        ms.Gui.Teacher.Frame teacherFrame
    ) {
        this.loginFrame = loginFrame;
        this.teacherFrame = teacherFrame;

        // add controller
        new ms.Controller.SubjectTab(teacherFrame);

        this.addMenu();
        this.addPanel();
        this.render(0);
    }

    private void render(int index) {
        for(int i = 0; i < this.panels.size(); i++) {
            if(i == index) {
                this.panels.get(i).setVisible(true);
                this.menus.get(i).setBackground(new Color(184,12,0));
            } else {
                this.panels.get(i).setVisible(false);
                this.menus.get(i).setBackground(new Color(0,21,41));
            }
        }
    }

    private void addMenu() {
        this.menus = new ArrayList<javax.swing.JPanel>();
        this.menus.add(this.teacherFrame.jPanel3);
        this.menus.add(this.teacherFrame.jPanel5);
        this.menus.add(this.teacherFrame.jPanel21);
        this.menus.add(this.teacherFrame.jPanel25);
        this.menus.add(this.teacherFrame.jPanel20);

        for(int i = 0; i < this.menus.size(); i++) {
            int index = i;
            javax.swing.JPanel panel = menus.get(i);
            panel.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    render(index);
                }
            });
        }
    }

    private void addPanel() {
        this.panels = new ArrayList<javax.swing.JPanel>();
        panels.add(this.teacherFrame.jPanel6);
        panels.add(this.teacherFrame.jPanel8);
        panels.add(this.teacherFrame.jPanel22);
        panels.add(this.teacherFrame.jPanel23);
        panels.add(this.teacherFrame.jPanel24);
    }
}
