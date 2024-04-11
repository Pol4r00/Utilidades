package ouvidoriav2;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;

public class Ouvidoria {
	public static void main(String[] args) {
		LocalDateTime object = LocalDateTime.now();
		DateTimeFormatter lol = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = object.format(lol);
		JOptionPane.showMessageDialog(null,"[" + formattedDate + "]");
	}

}
