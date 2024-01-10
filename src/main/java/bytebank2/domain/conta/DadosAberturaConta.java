package bytebank2.domain.conta;

import bytebank2.domain.cliente.DadosCadastroCliente;

public record DadosAberturaConta(Integer numero, DadosCadastroCliente dadosCliente) {
}
