package uca.edu.ni.kelani.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uca.edu.ni.kelani.modelos.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
