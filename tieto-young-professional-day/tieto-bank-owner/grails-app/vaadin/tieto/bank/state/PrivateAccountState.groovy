package tieto.bank.state

import tieto.bank.AccountDetailForm;

class PrivateAccountState extends LoadedState{
	@Override
	public void inintBtnSave(AccountDetailForm form) {
		// TODO Auto-generated method stub
		super.inintBtnSave(form);
		form.btn_Save.setEnabled(true);
	}

	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		// TODO Auto-generated method stub
		super.initTxtAccountBalance(form);
		form.tf_Balance.setEnabled(true)
	}
}
