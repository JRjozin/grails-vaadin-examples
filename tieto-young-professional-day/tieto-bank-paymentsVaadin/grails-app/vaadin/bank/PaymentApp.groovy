package bank


import tieto.bank.admin.Account
import tieto.bank.admin.Payment

import com.vaadin.*
import com.vaadin.ui.Label
import com.vaadin.ui.Table
import com.vaadin.ui.Window


class PaymentApp extends Application {
	/**
	 * Entry point for application
	 */
	void init() {

		// Attach top-level window
		Window w = new Window("Payment Application")
		Label l = new Label("Payment history:")
		Table t = new Table()
		t.addContainerProperty("id", Long.class, null)
		t.addContainerProperty("date", Date.class, null)
		t.addContainerProperty("Transfered Amount:", Integer.class, null)
		t.addContainerProperty("from", String, null)
		t.addContainerProperty("to", String.class, null)
		w.addComponent(l)
		List payments = Payment.list()
		for(Payment p : payments) {
			Object [] cells = new Object[5]
			cells[0] = p.id
			cells[1] = p.date
			cells[2] = p.amount
			cells[3] = "xxx"
			cells[4] = "XXX"

			t.addItem(cells, p)
		}
		w.addComponent(t)
		//		this.mainWindow.content.addComponent(c)
		setMainWindow(w)
	}
}
