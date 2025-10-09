package pertemuan1.praktikum1;

import javax.swing.*;

public class BoxMasukan {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Nama anda ?");
        JOptionPane.showMessageDialog(null, "Halo " + name);
    }
}
