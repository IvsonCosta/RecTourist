package br.com.RecTourist.view;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.RecTourist.controler.UsuarioControler;
import br.com.RecTourist.entidade.Usuario;
import br.com.RecTourist.util.AliasPaginas;
import br.com.RecTourist.util.Mensagems;
import br.com.RecTourist.util.TipoMensagem;

@Controller
public class UsuarioView {

	
	@Autowired
	private UsuarioControler Controller;
	
	
	@RequestMapping(value = "/formUsuario", method = RequestMethod.GET)
	public ModelAndView formUsuario() {
		ModelAndView model = new ModelAndView("admin/usuario/cadastroUsuario");
		model.addObject("usuario", new Usuario());
		return model;
	}
	
	
	@RequestMapping("/addUsuario")
	public ModelAndView addUsuario(@ModelAttribute("usuario") Usuario usuario, BindingResult result) {
		ModelAndView model = new ModelAndView("admin/usuario/listaUsuario");
		try {
			/**
			 * Dependendo da Role Atribuida insere a entidade
			 */
			Controller.salvar(usuario);
			model.addObject(TipoMensagem.VARIAVEL_VIEW_TIPO.getValor(), TipoMensagem.SUCESSO.getValor());
			model.addObject(Mensagems.VARIAVEL_VIEW_MENSAGEM, Mensagems.UsuarioCadastrado);
			model.addObject("usuarios", Controller.list());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping("/listaUsuario")
	public ModelAndView listaUsuario(HttpServletRequest request) {
		ModelAndView model = new ModelAndView(AliasPaginas.LISTA_USUARIO);
		try {
			model.addObject("usuarios", this.Controller.list() );
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	
	@RequestMapping("/excluirUsuario")
	public ModelAndView excluirUsuario(@RequestParam("id") Long id) {
		ModelAndView model = new ModelAndView(AliasPaginas.LISTA_USUARIO);
		try {
			Controller.excluir(id);
			model.addObject("usuarios", this.Controller.list());
			model.addObject(TipoMensagem.VARIAVEL_VIEW_TIPO.getValor(), TipoMensagem.SUCESSO.getValor());
			model.addObject(Mensagems.VARIAVEL_VIEW_MENSAGEM, Mensagems.UsuarioExcluido);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

	
}
