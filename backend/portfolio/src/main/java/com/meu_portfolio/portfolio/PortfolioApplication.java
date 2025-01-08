package com.meu_portfolio.portfolio;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.meu_portfolio.portfolio.domain.Habilidade;
import com.meu_portfolio.portfolio.domain.Usuario;
import com.meu_portfolio.portfolio.domain.enums.Nivel;
import com.meu_portfolio.portfolio.repositories.HabilidadeRepository;
import com.meu_portfolio.portfolio.repositories.UsuarioRepository;

@SpringBootApplication
public class PortfolioApplication implements CommandLineRunner {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private HabilidadeRepository habilidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Usuario usuario = new Usuario(null, "Emerson J S Costa", sdf.parse("27/09/1985"), "emersonjscosta@gmail.com",
				"33991002220", "Desenvolvdor bl bala alalalal lala alaa  aaa");

		usuarioRepository.save(usuario);

		Habilidade habilidade1 = new Habilidade(null, "Java", "Full Stack", Nivel.MEDIO, usuario);
		Habilidade habilidade2 = new Habilidade(null, "Python", "BI and Machine Learning", Nivel.BAIXO, usuario);
		Habilidade habilidade3 = new Habilidade(null, "C#", "Desenvolvedor Pleno", Nivel.ALTO, usuario);

		habilidadeRepository.saveAll(Arrays.asList(habilidade1, habilidade2, habilidade3));

		usuario.getHabilidades().addAll(Arrays.asList(habilidade1, habilidade2, habilidade3));

		usuarioRepository.saveAll(Arrays.asList(usuario));
	}
}
