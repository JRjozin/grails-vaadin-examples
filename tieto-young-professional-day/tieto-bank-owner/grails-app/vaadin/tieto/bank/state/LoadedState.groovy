package tieto.bank.state

import org.aspectj.weaver.ResolvedType.SuperClassWalker;

import tieto.bank.AccountDetailForm;

class LoadedState extends AbstractState{

	public void initTxtAccountBalance(AccountDetailForm form) {
		super.initTxtAccountBalance(form);
		form.tf_Balance.setValue(form.account.getBalance())
	}
}
