package br.org.habilidades.blogpessoal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.org.habilidades.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository  extends JpaRepository<Postagem,Long>{
	
	public boolean findAllByTituloContainingIgnoreCase (boolean b);
	

}
