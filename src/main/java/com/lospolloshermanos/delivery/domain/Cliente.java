package com.lospolloshermanos.delivery.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Por favor insira seu nome completo.")
    private String NomeCompleto;

    @Email(message = "Por favor insira um e-mail válido.")
    @NotBlank(message = "Por favor informe seu e-mail.")
    private String email;

    @CPF(message = "Por favor digite um CPF válido.")
    @NotBlank(message = "Por favor informe seu CPF.")
    private String cpf;

    @NotBlank(message = "Por favor informe o nome da rua.")
    private String rua;

    @NotBlank(message = "Por favor informe o bairro.")
    private String bairro;

    @NotBlank(message = "Por favor informe o número de onde reside.")
    private String numeroResidencia;

    private String complemento;

    @NotBlank(message = "Por favor informe o CEP.")
    @Pattern(regexp = "\\d{5}-\\d{3}", message = "CEP deve estar no formato 99999-999")
    private String cep;

}
