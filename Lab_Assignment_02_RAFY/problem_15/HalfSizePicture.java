package problem_15;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HalfSizePicture {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Half Size Picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon originalIcon = new ImageIcon("MyPic.jpg");
        int newWidth = originalIcon.getIconWidth() / 2;
        int newHeight = originalIcon.getIconHeight() / 2;
        
        ImageIcon resizedIcon = new ImageIcon(originalIcon.getImage().getScaledInstance(newWidth, newHeight, java.awt.Image.SCALE_SMOOTH));
        
        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setBounds(
            (frame.getWidth() - resizedIcon.getIconWidth()) / 2,
            (frame.getHeight() - resizedIcon.getIconHeight()) / 2,
            resizedIcon.getIconWidth(),
            resizedIcon.getIconHeight()
        );
        
        frame.getContentPane().add(imageLabel);
        frame.getContentPane().setLayout(null);
        frame.setSize(newWidth, newHeight);
        frame.setVisible(true);
    }
}