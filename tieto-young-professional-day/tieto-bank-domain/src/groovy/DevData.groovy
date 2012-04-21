import org.junit.internal.runners.statements.FailOnTimeout;

import tieto.bank.admin.Account
import tieto.bank.admin.AccountType
import tieto.bank.admin.Payment
import tieto.bank.admin.User

/**
 * 
 */

/**
 * @author ondrejkvasnovsky
 *
 */
class DevData {

	void insert() {
		def saveParams = [failonError : true, flush : true]
		User user1 = new User(name:"Kristyna Wasylkiwova");
		user1.save(saveParams)
		User user2 = new User(name:"Petra Karasova");
		user2.save(saveParams)
		User user3 = new User(name:"Josef Raska");
		user3.save(saveParams)

		Account a1 = new Account(balance:200, owner:user1, type:AccountType.Private)
		a1.save(saveParams)
		Account a2 = new Account(balance:2000, owner:user1, type:AccountType.Corporate)
		a2.save(saveParams)



		Payment p1 = new Payment()
		p1.amount = 1000
		p1.from = a2
		p1.to = a1
		p1.save(saveParams)



		Account a3 = new Account(balance:-500, owner:user2, type:AccountType.Private)
		a3.save(saveParams)
		Account a4 = new Account(balance:-10000, owner:user2, type:AccountType.Corporate)
		a4.save(saveParams)
		Account a5 = new Account(balance:900, owner:user3, type:AccountType.Private)
		a5.save(saveParams)

		Payment p2 = new Payment()
		p2.amount = 1000
		p2.from = a3
		p2.to = a5
		p2.save(saveParams)

		Payment p3 = new Payment()
		p3.amount = 1000
		p3.from = a2
		p3.to = a1
		p3.save(saveParams)
	}
}
