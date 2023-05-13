package lt.viko.eif.gmauza.librarymanagementrest.controllers;

import lt.viko.eif.gmauza.librarymanagementrest.models.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    interface SubscriberRepository extends JpaRepository<Subscriber, Long> {


    }

