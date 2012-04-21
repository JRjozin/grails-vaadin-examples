package tieto.bank.state

import tieto.bank.AccountDetailForm;

class EmptyState extends AbstractState{
	public void initTxtAccountBalance(AccountDetailForm form) {
		super.initTxtAccountBalance(form)
		form.tf_Balance.setValue(0);
	};
}
