package com.example.spring_repository2.repositories;


import com.example.spring_repository2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "repo-prog-languages", collectionResourceRel = "progLanguages", itemResourceRel = "progLanguage", exported = true)
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}

