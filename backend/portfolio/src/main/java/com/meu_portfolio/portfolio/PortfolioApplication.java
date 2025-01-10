package com.meu_portfolio.portfolio;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.meu_portfolio.portfolio.domain.Experiencia;
import com.meu_portfolio.portfolio.domain.Habilidade;
import com.meu_portfolio.portfolio.domain.Idioma;
import com.meu_portfolio.portfolio.domain.Projeto;
import com.meu_portfolio.portfolio.domain.RedeSocial;
import com.meu_portfolio.portfolio.domain.Usuario;
import com.meu_portfolio.portfolio.domain.enums.Modalidade;
import com.meu_portfolio.portfolio.domain.enums.Nivel;
import com.meu_portfolio.portfolio.repositories.ExperienciaRepository;
import com.meu_portfolio.portfolio.repositories.HabilidadeRepository;
import com.meu_portfolio.portfolio.repositories.IdiomaRepository;
import com.meu_portfolio.portfolio.repositories.ProjetoRepository;
import com.meu_portfolio.portfolio.repositories.RedeSocialRepository;
import com.meu_portfolio.portfolio.repositories.UsuarioRepository;

@SpringBootApplication
public class PortfolioApplication implements CommandLineRunner {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private HabilidadeRepository habilidadeRepository;

	@Autowired
	private IdiomaRepository idiomaRepository;

	@Autowired
	private RedeSocialRepository redeSocialRepository;

	@Autowired
	private ExperienciaRepository experienciaRepository;

	@Autowired
	private ProjetoRepository projetoRepository;

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
		Habilidade habilidade4 = new Habilidade(null, "Lua", "Desenvolvedor Jogos", Nivel.MEDIO, usuario);

		habilidadeRepository.saveAll(Arrays.asList(habilidade1, habilidade2, habilidade3, habilidade4));

		Idioma idioma1 = new Idioma(null, "Inglês", Nivel.MEDIO, usuario);
		Idioma idioma2 = new Idioma(null, "Espanhol", Nivel.MEDIO, usuario);

		idiomaRepository.saveAll(Arrays.asList(idioma1, idioma2));

		RedeSocial redeSocial1 = new RedeSocial(null, "Instagran", "https://instagran/emersoncosta/", usuario);
		RedeSocial redeSocial2 = new RedeSocial(null, "Facebook", "https://facebook/emersoncosta/", usuario);
		RedeSocial redeSocial3 = new RedeSocial(null, "Linkedin", "https://linkedin/emersoncosta/", usuario);

		redeSocialRepository.saveAll(Arrays.asList(redeSocial1, redeSocial2, redeSocial3));

		Experiencia experiencia1 = new Experiencia(null, "Analista de NLP", "IT LEAN", sdf.parse("01/11/2022"),
				sdf.parse("30/09/2023"), "Analista de NLP e desenvolvedor de chatbots.", Modalidade.HOME_OFFICE,
				usuario);

		Experiencia experiencia2 = new Experiencia(null, "Programador", "COMPASS UOL", sdf.parse("01/09/2021"),
				sdf.parse("01/09/2022"), "Desenvolvimento de sistemas voltados para chatbots em Node.js.",
				Modalidade.HOME_OFFICE,
				usuario);

		experienciaRepository.saveAll(Arrays.asList(experiencia1, experiencia2));

		Projeto projeto1 = new Projeto(null, "Sistema de cadastro de produtos", "https://exemplo.com", "Bla Bla Bla",
				usuario);
		Projeto projeto2 = new Projeto(null, "API para cadastro de instituições", "https://exemplo.com", "Bla Bla Bla",
				usuario);

		projetoRepository.saveAll(Arrays.asList(projeto1, projeto2));

		usuario.getHabilidades().addAll(Arrays.asList(habilidade1, habilidade2, habilidade3, habilidade4));
		usuario.getIdiomas().addAll(Arrays.asList(idioma1, idioma2));
		usuario.getRedeSociais().addAll(Arrays.asList(redeSocial1, redeSocial2, redeSocial3));
		usuario.getExperiencias().addAll(Arrays.asList(experiencia1, experiencia2));
		usuario.getProjetos().addAll(Arrays.asList(projeto1, projeto2));

	}
}
