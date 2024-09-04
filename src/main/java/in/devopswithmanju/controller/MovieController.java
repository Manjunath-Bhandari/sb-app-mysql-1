package in.devopswithmanju.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.devopswithmanju.binding.Movie;
import in.devopswithmanju.repository.MovieRepository;

@Controller
public class MovieController {

	private static Logger logger = LoggerFactory.getLogger(MovieController.class);

	@Autowired
	private MovieRepository movieRepo;

	@GetMapping("/")
	public String displayForm(Model model) {
		logger.info("*** displayForm () method execution start ***");
		Movie movieObj = new Movie();
		model.addAttribute("movie", movieObj);

		List<Movie> moviesList = movieRepo.findAll();
		model.addAttribute("movies", moviesList);

		logger.info("*** displayForm () method execution end ***");
		return "index";
	}

	@PostMapping("/")
	public String saveMovie(Movie movie, Model model) {
		logger.info("*** saveMovie () method execution start ***");
		movieRepo.save(movie);
		List<Movie> moviesList = movieRepo.findAll();
		model.addAttribute("movies", moviesList);
		
		Movie movieObj = new Movie();
		model.addAttribute("movie", movieObj);
		
		
		model.addAttribute("msg", "Movie Saved Successfully");
		logger.info("*** saveMovie () method execution end ***");
		return "index";
	}
}
