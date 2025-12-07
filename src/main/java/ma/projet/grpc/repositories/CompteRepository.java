package ma.projet.grpc.repositories;

import ma.projet.grpc.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, String> {
    // Les méthodes CRUD de base sont héritées de JpaRepository
    // findAll(), findById(), save(), delete(), etc.
}
