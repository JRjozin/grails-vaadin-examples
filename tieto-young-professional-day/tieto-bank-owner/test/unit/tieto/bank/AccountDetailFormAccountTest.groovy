package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*
import org.junit.internal.runners.statements.FailOnTimeout;

import tieto.bank.admin.Account
import tieto.bank.admin.AccountType
import tieto.bank.admin.User

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class AccountDetailFormAccountTest {

	AccountDetailForm form
	void setUp() {
		form = new AccountDetailForm()
		Account account = new Account()
		account.balance = 9999
		account.type = AccountType.Private
		form.setAccount(account)
		User user = new User()
		user.name = "Name"
		//user.save(failOnError: true)
		account.owner = user
		//account.save(failOnError: true)
		form.setAccount(account)
	}


	void testValue() {
		Object value = form.tf_Balance.getValue()
		assertEquals(9999, value)
	}

	void testEmptyState() {
		boolean enabled = form.tf_Balance.isEnabled()
		assertEquals(true, enabled)
	}
}
