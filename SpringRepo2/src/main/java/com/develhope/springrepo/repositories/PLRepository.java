package com.develhope.springrepo.repositories;


import com.develhope.springrepo.entites.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;




@RepositoryRestResource(path = "repo-prog -languages",
        collectionResourceDescription = @Description("A collection to describe programming languages"))
public interface PLRepository extends JpaRepository<ProgrammingLanguage, Long> {

}