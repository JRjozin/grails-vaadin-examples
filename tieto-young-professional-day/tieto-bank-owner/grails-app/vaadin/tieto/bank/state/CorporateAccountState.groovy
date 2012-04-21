package tieto.bank.state

import tieto.bank.AccountDetailForm;

class CorporateAccountState extends LoadedState{
	public void initTxtAccountBalance(AccountDetailForm form) {
		form.tf_Balance.setEnabled(true)
	}


	public void initBtnRemove(AccountDetailForm form) {
		form.btn_Remove.setEnabled(true)
	}

	public void inintBtnSave(AccountDetailForm form) {
		form.btn_Save.setEnabled(true)
	}
}
