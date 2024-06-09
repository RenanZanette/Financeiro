package rh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rh.model.Cargo;
@Repository
public interface CargoRepository extends JpaRepository <Cargo, Long>{

}
