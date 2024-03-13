package com.pluralsight.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrganiserRepository {

    private final List<Organiser> organisers = List.of(
            new Organiser(1, "Pluralsight", "Pluralsight is the technology workforce development company that helps teams know more and work better together with stronger skills, improved processes and informed leaders."),
            new Organiser(2, "O'Reilly", "O'Reilly Media is a learning company that helps individuals, teams, and enterprises build skills to succeed in a world defined by technology-driven transformation."),
            new Organiser(3, "Packt", "Packt is the online library and learning platform for professional developers. Learn Python, JavaScript, Angular, Java, PHP, C#, Ruby, R, HTML, CSS, DevOps, and more."),
            new Organiser(4, "Manning", "Manning is an independent publisher of computer books, videos, and courses."),
            new Organiser(5, "Apress", "Apress, a Springer Nature company, is a publisher dedicated to meeting the information needs of developers, IT professionals, and tech communities worldwide.")
    );

    public List<Organiser> findAll() {
        return organisers;
    }
}
