
package com.deliverytech.delivery.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private String categoria;
    private boolean disponivel = true;
	
	// FIXME
	public Boolean getDisponivel() {
        return disponivel != false ? disponivel : true;
    }


    @ManyToOne
    @JoinColumn(name = "restaurante_id")
    private Restaurante restaurante;
}
