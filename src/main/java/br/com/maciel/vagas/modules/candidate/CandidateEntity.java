package br.com.maciel.vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {

  private UUID id;
  private String name;

  @NotBlank
  @Pattern(regexp = "\\S+", message = "Don't have space")
  private String username;

  @Email
  private String email;

  @Length(min = 6, max = 100)
  private String password;

  private String description;
  private String curriculum;

}
