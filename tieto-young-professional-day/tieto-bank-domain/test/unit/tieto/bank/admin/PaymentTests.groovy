package tieto.bank.admin



import javax.xml.bind.ValidationException;

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Payment)
class PaymentTests {
	//@Mockfor(Payment)
	void testPayment() {
		Payment p = new Payment()
		p.amount=5000
		p.save(failonError:true)
	}

	void testPayment2() {
		//should fail on constraints
		shouldFail(ValidationException) {
			Payment p = new Payment()
			p.amount=0
			p.save(failonError:true)}
	}
}
