package database;

/**
 *
 * @author FRANCIS
 */
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class icon {
    public void setimagenLabel(JLabel label, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance
                    (label.getWidth(), 
                     label.getHeight(), Image.SCALE_SMOOTH));
        label.setIcon(icon);
    }
}
