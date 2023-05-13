package lt.viko.eif.gmauza.librarymanagementrest.controllers;

import lt.viko.eif.gmauza.librarymanagementrest.models.Subscribers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SubscribersRepository extends JpaRepository<Subscribers, Long> {


}
