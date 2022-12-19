package org.diems.ahm.dao;

import org.diems.ahm.model.FeePayment;

/**
 * @author Developer
 *
 */
public interface FeeDao {

	public int depositFee(FeePayment feePayment);

}
