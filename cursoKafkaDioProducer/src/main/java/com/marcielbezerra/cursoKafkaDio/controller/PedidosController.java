package com.marcielbezerra.cursoKafkaDio.controller;

import com.marcielbezerra.cursoKafkaDio.data.PedidoData;
import com.marcielbezerra.cursoKafkaDio.services.RegistraEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PedidosController {

    private final RegistraEventoService eventoService;

    @PostMapping(path = "/api/salvar-pedido")
    public ResponseEntity<String> salvarPedido(@RequestBody PedidoData pedido){
        eventoService.adicionarEvento("SalvarPedido", pedido);
        return ResponseEntity.ok("Sucesso");
    }
}
