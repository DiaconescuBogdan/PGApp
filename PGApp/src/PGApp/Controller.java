package PGApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	private SelectOperation selectOperation;
	private InsertOperation insertOperation;
	private UpdateOperation updateOperation;
	private View view;

	public Controller(SelectOperation selectOperation, View view, InsertOperation insertOperation,
			UpdateOperation updateOperation) {
		super();
		this.selectOperation = selectOperation;
		this.insertOperation = insertOperation;
		this.view = view;
		this.updateOperation = updateOperation;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Load DB")) {
			selectOperation.execute();
		} else if (e.getActionCommand().equals("Adauga Produs")) {
			//insertOperation.execute();
			insertOperation.execute(Integer.parseInt(view.getTextId2().getText()),
					Integer.parseInt(view.getTxtPret_1().getText()), view.getTxtNumeprodus().getText(),
					Integer.parseInt(view.getTxtCantitate().getText()),
					new CategorieProdus(view.getTxtCategorie().getText()));
		} else if (e.getActionCommand().equals("Actualizare pret")) {
			updateOperation.execute(Integer.parseInt(view.getTxtPret().getText()),
					Integer.parseInt(view.getTxtId().getText()));
		}
	}
}
