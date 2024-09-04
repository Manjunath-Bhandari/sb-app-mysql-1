package in.devopswithmanju.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.devopswithmanju.binding.Movie;

public interface MovieRepository extends JpaRepository<Movie, Serializable> {

}
