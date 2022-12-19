package org.diems.ahm.service;

import org.diems.ahm.model.HostelRooms;

/**
 * @author Developer
 *
 */
public interface RoomsService {
	
	/**
	 * @param hostelRooms
	 * @return
	 */
	public int appointRoom(HostelRooms hostelRooms);

	/**
	 * @param roomId
	 * @return
	 */
	public HostelRooms getRoom(int roomId);

}
