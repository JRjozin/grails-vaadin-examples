package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class AccountDetailFormTests {

	AccountDetailForm form
	void setUp() {
		form = new AccountDetailForm()
	}

	void tearDown() {
		// Tear down logic here
	}

	void testValue() {
		Object value = form.tf_Balance.getValue()
		assertEquals(0, value)
	}

	void testEmptyState() {
		boolean enabled = form.tf_Balance.isEnabled()
		assertEquals(false, enabled)
	}
}
