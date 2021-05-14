package maju.company.redeSocial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import maju.company.redeSocial.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Optional<Usuario> findByEmail(String Email);
}
