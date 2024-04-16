package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedicos(
        @NotBlank(message = "Nome é obrigatório")
        String nome,
        @NotBlank(message = "Email é obrigatório")
        @Email
        String email,
        @NotBlank(message = "Formato do email é inválido")
        String telefone,
        @NotBlank(message = "CRM é obrigatório")
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull(message = "Especialidade é obrigatória")
        Especialidade especialidade,
        @NotNull(message = "Dados do endereço são obrigatórios")
        @Valid
        DadosEndereco endereco) {}
