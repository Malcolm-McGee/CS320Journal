
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class ContactTest {
//This is to test ContactID
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("99999999874321","Malcolm McGee","McGee",
"9793930000","3919 Lester Drive");
		});
	}
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact(null,"Malcolm McGee","McGee", "9793930000","3919 Lester Drive");
		});
	}	
//We are testing the firstName
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("4093300000","Malcolm McGee","McGee",
"9793930000","3919 Lester Drive");
		});
	}
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("4093300000",null,"McGee", "9793930000","3919 Lester Drive");
		});
	}
	//Now testing the lastName
		@Test
		void testLastNameTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
				new Contact("4093300000","Malcolm","McGee",
"9793930000","3919 Lester Drive");
			});
		}
		@Test
		void testLastNameNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{
				new Contact("4093300000","Malcolm",null, "9793930000","3919 Lester Drive");
			});
		}
		//Testing phoneNumber
			@Test
			void testPhoneNumberTooLong() {
	Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("4093300000","Malcolm","McGee",
"9793930000888","3919 Lester Drive");
			});
		}
		@Test
		void testPhoneNumberNull() {
	Assertions.assertThrows(IllegalArgumentException.class,() ->{
new Contact("4093300000","Malcolm","McGee",
null,"3919 Lester Drive");
							});
			}
		//test address
			@Test
			void testAddressTooLong() {
	Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("4093300000","Malcolm","McGee",
"9793930000","3919 Lester Drive Houston Tx 7737312345");
				});
			}
			@Test
			void testAddressNull() {
	Assertions.assertThrows(IllegalArgumentException.class,() ->{
				new Contact("4093300000","Malcolm","McGee",
"9793930000",null);
				});
			}
}