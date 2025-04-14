package com.crud.crud.controller;




import com.crud.crud.model.Produto;
import com.crud.crud.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoService.listarTodos());
        return "lista-produtos";
    }

    @GetMapping("/novo")
    public String mostrarFormularioNovo(Model model) {
        model.addAttribute("produto", new Produto());
        return "form-produto";
    }

    @PostMapping("/salvar")
    public String salvarProduto(@ModelAttribute @Valid Produto produto, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            model.addAttribute("produto", produto);
            return "form-produto"; // Volta para o formulário em caso de erro
        }
        produtoService.salvar(produto);
        redirectAttributes.addFlashAttribute("mensagemSucesso", "Produto salvo com sucesso!");
        return "redirect:/produtos";
    }


    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        Optional<Produto> produto = produtoService.buscarPorId(id);
        if (produto.isPresent()) {
            model.addAttribute("produto", produto.get());
            return "form-produto";
        }
        return "redirect:/produtos";
    }

    @GetMapping("/excluir/{id}")
    public String excluirProduto(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        produtoService.excluir(id);
        redirectAttributes.addFlashAttribute("mensagemSucesso", "Produto excluído com sucesso!");
        return "redirect:/produtos";
    }
}

