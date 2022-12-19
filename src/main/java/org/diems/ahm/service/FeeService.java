package org.diems.ahm.service;

import org.diems.ahm.model.FeePayment;

/**
 * @author Developer
 *
 */
public interface FeeService {
	
	/**
	 * @param feePayment
	 * @return
	 */
	public int depositFee(FeePayment feePayment);

}
