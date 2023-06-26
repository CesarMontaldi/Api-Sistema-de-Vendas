package cesar.montaldi.domain.repository;

import cesar.montaldi.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;


public interface Clientes extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String nome);

    @Query(value = "select * from cliente c where c.nome like '%:nome%' ", nativeQuery = true)
    List<Cliente> buscaPorNome(@Param("nome") String nome);

    @Query("delete from Cliente c where c.nome =:nome")
    @Modifying
    void deleteByNome(String nome);

    boolean existsByNome(String nome);

    @Query(" select cli from Cliente cli left join fetch cli.pedidos where cli.id = :id ")
    Cliente findClienteFetchPedidos(@Param("id") Integer id);


}
