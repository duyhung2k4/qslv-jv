/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ms;
import ms.Gui.Login.Frame;

/**
 *
 * @author HUNG
 */
public class Ms {

    public static void main(String[] args) {
        // Đảm bảo giao diện hiển thị đúng phong cách Nimbus (tuỳ chọn)
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

        // Hiển thị Frame
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });
    }
    
}
