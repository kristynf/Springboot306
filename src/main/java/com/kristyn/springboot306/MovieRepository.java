package com.kristyn.springboot306;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Long> {
}
