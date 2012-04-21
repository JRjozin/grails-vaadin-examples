package tieto.bank

import tieto.bank.admin.Account

import com.vaadin.data.Property
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener

class ShowAccountDetailListener implements ValueChangeListener{


	OwnerApp app

	@Override
	public void valueChange(ValueChangeEvent event) {
		Property p = event.getProperty()
		Account account = p.getValue()
		if (account != null){
			app.accountDetail.setAccount(account)
			app.accountDetail.refreshShow()
		}
	}
}
