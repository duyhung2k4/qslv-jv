package ms;

public class Ms {
    private ms.Gui.Login.Frame loginFrame;
    private ms.Gui.Teacher.Frame teacherFrame;

    public Ms() {
        loginFrame = new ms.Gui.Login.Frame();
        teacherFrame = new ms.Gui.Teacher.Frame();

        loginFrame.setLocationRelativeTo(null);
        teacherFrame.setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            System.err.println("Không thể thiết lập giao diện Nimbus");
        }

        Ms app = new Ms();

        new ms.Controller.Login(app.loginFrame, app.teacherFrame);

        // Hiển thị Frame
        java.awt.EventQueue.invokeLater(() -> {
            app.loginFrame.setVisible(true);
        });
    }
    
}
