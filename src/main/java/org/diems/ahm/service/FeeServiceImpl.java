package org.diems.ahm.service;

import org.diems.ahm.dao.FeeDao;
import org.diems.ahm.model.FeePayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Developer
 *
 */
@Service
public class FeeServiceImpl implements FeeService {
	
	/**
	 * 
	 */
	@Autowired
	FeeDao feeDao;

	/* (non-Javadoc)
	 * @see org.diems.ahm.service.FeeService#depositFee(org.diems.ahm.model.FeePayment)
	 */
	@Override
	@Transactional
	public int depositFee(FeePayment feePayment) {
		return feeDao.depositFee(feePayment);
	}

}
