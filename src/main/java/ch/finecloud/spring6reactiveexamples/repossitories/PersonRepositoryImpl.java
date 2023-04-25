package ch.finecloud.spring6reactiveexamples.repossitories;

import ch.finecloud.spring6reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {

    Person person1 = Person.builder()
            .id(1)
            .firstName("John")
            .lastName("Doe")
            .build();
    Person person2 = Person.builder()
            .id(2)
            .firstName("Jane")
            .lastName("Doe")
            .build();
    Person person3 = Person.builder()
            .id(3)
            .firstName("John")
            .lastName("Smith")
            .build();
    Person person4 = Person.builder()
            .id(4)
            .firstName("Jane")
            .lastName("Smith")
            .build();

    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(person1);
    }

    @Override
    public Flux<Person> findAll() {
        return Flux.just(person1, person2, person3, person4);
    }
}
