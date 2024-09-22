package parkchanho.flower.dao;

import java.util.List;

import parkchanho.flower.domain.Review;

public interface ReviewDao {
	List<Review> selectReviews();
	List<Review> detailReviews(int reviewNum);
	List<Review> selectAdminReviews();
	List<Review> detailAdminReviews(int reviewNum);
	void insertReview(Review review);
	void updateReview(Review review);
	void deleteReview(int reviewNum);
	void deleteAdminReview(int reviewNum);
} 
