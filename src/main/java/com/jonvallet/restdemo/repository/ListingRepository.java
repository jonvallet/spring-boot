package com.jonvallet.restdemo.repository;

import com.jonvallet.restdemo.model.Listing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "listings", path = "listings")
public interface ListingRepository extends CrudRepository <Listing, String>{
}
