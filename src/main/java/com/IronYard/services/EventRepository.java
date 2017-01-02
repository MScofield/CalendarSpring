package com.IronYard.services;

import com.IronYard.entities.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by scofieldservices on 1/2/17.
 */
public interface EventRepository extends CrudRepository<Event, Integer> {
    List<Event> findAllByOrderByDateTimeDesc();
}
