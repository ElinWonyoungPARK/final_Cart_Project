package org.WonyoungPark.api.hall.repository;

import org.WonyoungPark.api.hall.domain.Hall;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface HallCustomRepository {

}

public interface HallRepository extends JpaRepository<Hall, Long>, HallCustomRepository {
	@Query(value="update hall h set h.hall_name = :hallName, h.hall_location = :hallLocation, "
			+ "h.hall_time = :hallTime, h.hall_closed = :hallClosed, h.hall_pnumber = :hallPnumber, "
			+ "h.hall_info = :hallInfo, h.hall_image = :hallImage"
			+ " where h.hall_num = :hallNum", nativeQuery = true)
	public long update(@Param("hallName") String hallName,
					   @Param("hallLocation") String hallLocation,
					   @Param("hallTime") String hallTime,
					   @Param("hallClosed") String hallClosed,
					   @Param("hallPnumber") String hallPnumber,
					   @Param("hallInfo") String hallInfo,
					   @Param("hallImage") String hallImage,
					   @Param("hallNum") long hallNum);
}
