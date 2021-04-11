package br.com.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Apple iPhone 12 Pro Max");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/4174qKTcwyL._AC_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Novo-Apple-iPhone-Azul-Pac%C3%ADfico/dp/B08NTNV4XN");
		pedido.setDescricao("Uma descrição qualquer");
		
		List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
		
	}
	
}
