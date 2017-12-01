package com.jonvallet.restdemo.repository;

import com.jonvallet.restdemo.model.Listing;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "listings", path = "listings")
public interface ListingRepository extends PagingAndSortingRepository<Listing, String> {

    @RestResource(path = "sortByState")
    @Query("select l from Listing l order by l.address.state, SUBSTRING(l.address.city, 1, 1), l.timestamp")
    List<Listing> sortByState();

}
