package ATM;

import javax.swing.JOptionPane;

public class Retirar extends Plantilla{

	@Override
	public void Transacciones() {
		// TODO Auto-generated method stub
		
		Retiros();
		if(retiro<= getSaldo()) {
			transacciones=getSaldo();
			setSaldo(transacciones-retiro);
			JOptionPane.showMessageDialog(null, "Cargo a tu cuenta: "+ retiro+"\n"+"Saldo actual es: "+getSaldo());
		}else {
			JOptionPane.showMessageDialog(null,"Saldo insuficiente. ");
		}
	}

	
		
	}


