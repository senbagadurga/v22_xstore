package mto.pos.order.update;
import java.util.ArrayList;
/********************************************************************************
 * US 92543 Siebel Sale Order Processing
 * 09/01/2023 Nayya Gupta constant class to handle constant values
 *******************************************************************************/
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.siebel.xml.orpos_order_entry_io.data.ListOfPaymentsData;
import com.siebel.xml.orpos_order_entry_io.data.PaymentsData;

public class MtoListOfPaymentsData extends ListOfPaymentsData
{
	@XmlElement(name = "Payments")
	protected List<PaymentsData> payments;

	public List<PaymentsData> getPayments() {
		if(payments == null) {
			payments = new ArrayList<PaymentsData>();
		}
		return this.payments;
	}

	public void setPayments(List<PaymentsData> payments) {
		this.payments = payments;
	}
}
