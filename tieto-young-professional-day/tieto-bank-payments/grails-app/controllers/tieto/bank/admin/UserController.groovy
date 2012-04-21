package tieto.bank.admin

class UserController {

	def login() {
		String name = params.login
		User user = User.findByName(name)
		session.user = user;
		redirect (controller: 'payment', view: 'index')
	}

	def logout(){
		session.user = user;
		redirect(controller: "payment", view: "index")
	}
}
