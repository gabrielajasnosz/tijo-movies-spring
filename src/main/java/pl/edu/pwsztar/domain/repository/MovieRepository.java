package pl.edu.pwsztar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.edu.pwsztar.domain.entity.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>, CrudRepository<Movie, Long> {

    @Modifying
    @Query("DELETE FROM Movie m WHERE m.movieId = :movieId")
    void deleteById(@Param("movieId") Long movieId);

    @Query("SELECT m from Movie m order by m.year DESC")
    List<Movie> getSortedMovies();

    @Query("SELECT m FROM Movie m WHERE m.movieId=:movieId")
    Movie findMovieById(@Param("movieId") Long movieId);


    Movie findOneByMovieId(Long movieId);
}
