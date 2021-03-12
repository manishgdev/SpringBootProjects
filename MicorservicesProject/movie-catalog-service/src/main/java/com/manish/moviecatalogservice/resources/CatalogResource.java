package com.manish.moviecatalogservice.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.manish.moviecatalogservice.models.CatalogItem;
import com.manish.moviecatalogservice.models.Movie;
import com.manish.moviecatalogservice.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

//	private List<CatalogItem> catalogList = new ArrayList<>(Arrays.asList(new CatalogItem("Transformers", "Test", 4)));

	@Autowired
	private RestTemplate restTemplate;

//	@Autowired
//	WebClient.Builder builder;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalogs(@PathVariable String userId) {
		// get all rated movie ids
//		RestTemplate restTemplate = new RestTemplate();

//		List<Rating> ratingList = Arrays.asList(new Rating("1234", 4), new Rating("4563", 5));
		UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/foo", UserRating.class);

		// for each movie id call movie info and get detail
//		List<CatalogItem> catalogList = ratingList.stream().map(rating -> {
		List<CatalogItem> catalogList = userRating.getUserRatingList().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);

			/*
			 * Movie movie = builder.build() .get() .uri("http://localhost:8087/movies/" +
			 * rating.getMovieId()) .retrieve() .bodyToMono(Movie.class) .block();
			 */

			return new CatalogItem(movie.getMovieName(), "Test", rating.getRating());
		}).collect(Collectors.toList());

		// put them all together
		return catalogList;
	}
}
