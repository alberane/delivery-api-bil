package com.deliverytech.delivery.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private boolean ativo = true;
	
	public void inativar() {
        this.ativo = false;
    }

    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private List<Pedido> pedidos;
}