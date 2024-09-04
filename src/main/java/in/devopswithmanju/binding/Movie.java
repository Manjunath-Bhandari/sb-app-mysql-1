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

	private Double movieRating;
	
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

	public String getAuthorName() {
		return directorName;
	}

	public void setAuthorName(String directorName) {
		this.directorName = directorName;
	}

	public Double getMoviePrice() {
		return movieRating;
	}

	public void setMoviePrice(Double movieRating) {
		this.movieRating = movieRating;
	}
}
