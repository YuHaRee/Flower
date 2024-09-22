package parkchanho.flower.service;

import java.util.List;

import parkchanho.flower.domain.Review;

public interface ReviewService {
	List<Review> getReviews();
	List<Review> getDetailReviews(int reviewNum);
	List<Review> getAdminReviews();
	List<Review> getDetailAdminReviews(int reviewNum);
	void addReview(Review review);
	void fixReview(Review review);
	void delReview(int reviewNum);
	void delAdminReview(int reviewNum);
}
