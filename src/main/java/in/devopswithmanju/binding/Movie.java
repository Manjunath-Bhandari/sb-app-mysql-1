package in.devopswithmanju.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movieId;

	private String movieName;
	private String directorName;
	private Double movieRating;  // Ensure this is a Double type

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	// Correct getter for movieRating
	public Double getMovieRating() {
		return movieRating;
	}

	// Correct setter for movieRating
	public void setMovieRating(Double movieRating) {
		this.movieRating = movieRating;
	}
}
