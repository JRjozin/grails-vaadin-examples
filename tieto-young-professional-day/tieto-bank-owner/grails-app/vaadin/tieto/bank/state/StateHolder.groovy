package tieto.bank.state

import tieto.bank.AccountDetailForm;

class StateHolder {
	private State state
	private AccountDetailForm form

	public StateHolder(AccountDetailForm form, State state) {
		super()
		this.form = form
		this.state = state
		applyState()
	}

	public void setState(State state) {
		this.state = state
		applyState()
	}

	public void applyState() {
		state.inintBtnSave(form)
		state.initTxtAccountBalance(form)
		state.initBtnRemove(form)
	}
}
