package ATM;

import javax.swing.JOptionPane;

public class Depositos extends Plantilla {

	@Override
	public void Transacciones() {
		// TODO Auto-generated method stub
		
		Depositos();
		transacciones = getSaldo();
		setSaldo(deposito + transacciones);
		JOptionPane.showMessageDialog(null,"Abonaste a tu cuenta "+ deposito+"\n"+"Tu saldo actual es: " +getSaldo());
	}

}
