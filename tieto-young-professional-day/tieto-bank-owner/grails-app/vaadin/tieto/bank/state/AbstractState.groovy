package tieto.bank.state

import tieto.bank.AccountDetailForm

abstract class AbstractState implements State{
	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		form.tf_Balance.setEnabled(false)
	}

	@Override
	public void initBtnRemove(AccountDetailForm form) {
		form.btn_Remove.setEnabled(false)
	}

	@Override
	public void inintBtnSave(AccountDetailForm form) {
		form.btn_Save.setEnabled(false)
	}
}
