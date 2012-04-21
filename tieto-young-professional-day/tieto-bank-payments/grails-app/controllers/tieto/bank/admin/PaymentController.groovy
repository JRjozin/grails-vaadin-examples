package tieto.bank.admin

class PaymentController {

	def index() {
		List payments = Payment.list()
		return [payments: payments]
	}
	def remove(){
		Payment p = Payment.get(params.id);
		p?.delete();
		redirect(view: "index")
	}
}
