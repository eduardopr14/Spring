package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findByCursoNome(String nomeCurso);
    // Se tiver ambiguidade de nome, use Curso_Nome

    // Caso não siga o padrão de nome do JPA, utiliza-se:
    // @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
    // List<Topico> carregarPorNomeCurso(@Param("nomeCurso") String nomeCurso);
    
}
