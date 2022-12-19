package org.diems.ahm.dao;

import org.diems.ahm.model.HostelRooms;

/**
 * @author Developer
 *
 */
public interface RoomsDao {

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
