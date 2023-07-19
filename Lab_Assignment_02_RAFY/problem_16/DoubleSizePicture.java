package problem_16;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DoubleSizePicture {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Double Size Picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon originalIcon = new ImageIcon("MyPic.jpg");
        
        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();
        
        int newWidth = originalWidth * 2;
        int newHeight = originalHeight * 2;
        
        ImageIcon resizedIcon = new ImageIcon(originalIcon.getImage().getScaledInstance(newWidth, newHeight, java.awt.Image.SCALE_SMOOTH));
        
        JLabel imageLabel = new JLabel(resizedIcon);
        
        int x = (newWidth - originalWidth) / 2;
        int y = (newHeight - originalHeight) / 2;
        
        imageLabel.setBounds(x, y, originalWidth, originalHeight);
        
        frame.getContentPane().add(imageLabel);
        frame.getContentPane().setLayout(null);
        frame.setSize(newWidth, newHeight);
        frame.setVisible(true);
    }
}
