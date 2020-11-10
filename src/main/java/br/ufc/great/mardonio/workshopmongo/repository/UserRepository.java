package br.ufc.great.mardonio.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.ufc.great.mardonio.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
