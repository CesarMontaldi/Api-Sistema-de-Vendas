package cesar.montaldi.service;

import cesar.montaldi.domain.entity.Pedido;
import cesar.montaldi.domain.enums.StatusPedido;
import cesar.montaldi.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
