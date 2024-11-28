package ms.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.*;

public class SubjectTab {
    private ms.Gui.Teacher.Frame teacherFrame;

    public SubjectTab(
            ms.Gui.Teacher.Frame teacherFrame) {
        this.teacherFrame = teacherFrame;

        setInput();
        addEvents();
    }

    private void addEvents() {
        this.teacherFrame.jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {addData();}
        });

    }
    
    private void setInput() {
        ((AbstractDocument) this.teacherFrame.jTextField5.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string.matches("\\d*")) { // Chỉ cho phép ký tự số
                    super.insertString(fb, offset, string, attr);
                }
            }
            @Override
            public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attr) throws BadLocationException {
                if (string.matches("\\d*")) { // Chỉ cho phép ký tự số
                    super.replace(fb, offset, length, string, attr);
                }
            }
        });
    }

    private void addData() {
        System.out.println(this.teacherFrame.jTextField5.getText());
    }
}
