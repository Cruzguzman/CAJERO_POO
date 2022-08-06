package ATM;

import javax.swing.JOptionPane;

public class Retirar extends Plantilla{

	@Override
	public void Transacciones() {
		JOptionPane.showMessageDialog(null,"Su saldo actual es: " + getSaldo());
		
	}

}
