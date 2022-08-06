package ATM;

import javax.swing.JOptionPane;

public abstract class Plantilla {

	protected int transacciones, deposito, retiro;
	private static int saldo = 0;

	public void Operaciones() {
		int opcion = 0;
		int bandera = 0;
		do {
			do {
				opcion = Integer.parseInt(JOptionPane
						.showInputDialog("Porfavor seleccione una opcion:" + "\n" + "[1].-Consulta saldo" + "\n"
								+ "[2].-Retirar efectivo" + "\n" + "[3].-Depositar efectivo" + "\n" + "[4].-Salir"

						));
				if (opcion >= 1 && opcion <= 4) {
					bandera = 1;
				} else {
					JOptionPane.showMessageDialog(null, "Opcion no encontrada");
				}
			} while (bandera == 0);
			
			switch (opcion) {
			case 1:

				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				JOptionPane.showMessageDialog(null, "Vuelva pronto");
				bandera=2;
				break;

			}

		} while (bandera != 2);
	}

	public void Retiros() {
		retiro = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto desea retirar?: "));
	}
	
	public void Depositos() {
		deposito = Integer.parseInt(JOptionPane.showInputDialog("Cuanto desea depositar"));
	}
	
	public abstract void Transacciones();

	public static int getSaldo() {
		return saldo;
	}

	public static void setSaldo(int saldo) {
		Plantilla.saldo = saldo;
	} 
		
	
}
