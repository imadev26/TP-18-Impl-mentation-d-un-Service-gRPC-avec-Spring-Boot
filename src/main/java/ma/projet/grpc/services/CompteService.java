package ma.projet.grpc.services;

import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.repositories.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompteService {
    private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    /**
     * Récupère tous les comptes
     */
    public List<Compte> findAllComptes() {
        return compteRepository.findAll();
    }

    /**
     * Recherche un compte par ID
     */
    public Compte findCompteById(String id) {
        return compteRepository.findById(id).orElse(null);
    }

    /**
     * Sauvegarde un compte (création ou mise à jour)
     */
    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    /**
     * Supprime un compte par ID
     */
    public void deleteCompte(String id) {
        compteRepository.deleteById(id);
    }

    /**
     * Calcule le nombre total de comptes
     */
    public long countComptes() {
        return compteRepository.count();
    }
}
