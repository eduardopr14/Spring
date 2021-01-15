package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    Page<Topico> findByCursoNome(String nomeCurso, Pageable pagincacao);
    // Se tiver ambiguidade de nome, use Curso_Nome

    // Caso não siga o padrão de nome do JPA, utiliza-se:
    // @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
    // List<Topico> carregarPorNomeCurso(@Param("nomeCurso") String nomeCurso);

}
