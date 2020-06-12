package com.timeticket.TimeTicket.Repository;

import com.timeticket.TimeTicket.Model.DayPolicy.Policy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public interface PolicyRepository extends MongoRepository<Policy , String> {
    @Query("{ 'place_id' : ?0  , 'day' : ?1, 'day_type' : ?2 }")
    Optional<List<Policy>> findAllPolicies(UUID placeId , Date day, String dayType);
}
