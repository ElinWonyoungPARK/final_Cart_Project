package org.WonyoungPark.api.review.repository;

import java.util.List;

import org.WonyoungPark.api.review.domain.ReviewExhbnDTO;
import org.WonyoungPark.api.review.domain.Review;
import org.WonyoungPark.api.review.domain.ReviewDTO;
import org.springframework.data.jpa.repository.JpaRepository;

interface ReviewCustomRepository{
	public List<ReviewDTO> findByUserNum(long UserNum);
	public List<ReviewExhbnDTO> findReview();
	public ReviewExhbnDTO findUsername(long id);
	public List<ReviewExhbnDTO> findByExhbn(long id);
	public List<ReviewExhbnDTO> findByUser(long id);
	public ReviewExhbnDTO findByReveiwNum(long id);
}

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewCustomRepository {
	
}
