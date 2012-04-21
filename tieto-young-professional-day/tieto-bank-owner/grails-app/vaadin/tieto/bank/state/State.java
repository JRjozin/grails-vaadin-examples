package tieto.bank.state;

import tieto.bank.AccountDetailForm;

public interface State {
	void initTxtAccountBalance(AccountDetailForm form);

	void initBtnRemove(AccountDetailForm form);

	void inintBtnSave(AccountDetailForm form);

}
