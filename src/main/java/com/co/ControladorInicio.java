
package com.co;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.co.DAO.CategoriasDAO;
import com.co.DAO.ClientesDAO;
import com.co.DAO.RolesDAO;
import com.co.DAO.UnidadesDAO;

@Controller
public class ControladorInicio {
    //Para utilizar clases propias
    @Autowired  
    private CategoriasDAO categoriasDao;
    @Autowired  
    private UnidadesDAO unidadesDao;
    @Autowired  
    private ClientesDAO clientesDao;
    @Autowired  
    private RolesDAO rolesDao;
        
    
//    El page es la pagina web
    @GetMapping("/")
    public String inicio(){
       return  ("page");
    }
    
//    Login
    @GetMapping("/login")
    public String login(){
        return("login");
    }
    
    //Portal admin
    @GetMapping("/index")
    public String index(){
        return("index");
    }
    
//    Categorias
    @GetMapping("/categorias")
    public String categorias(Model model){
        
        var categorias = categoriasDao.findAll();
        model.addAttribute("categorias", categorias);
        return("categorias");
    }
    
    //    Categorias eliminadas
    @GetMapping("/cate_eliminadas")
    public String cate_eliminadas(){
        return("cate_eliminadas");
    }
    
     //    clientes eliminadas
    @GetMapping("/clien_eliminados")
    public String clien_eliminados(){
        return("clien_eliminados");
    }
    
     //    Clientes
    @GetMapping("/clientes")
    public String clientes( Model model){
        var clientes = clientesDao.findAll();
        model.addAttribute("clientes", clientes);
        return("clientes");
    }
    
     //    productos
    @GetMapping("/productos")
    public String productos(){
        return "productos";
    }
    
     //    productos eliminados
    @GetMapping("/productos_eliminados")
    public String productos_eliminados(){
        return("productos_eliminados");
    }
    
     //    rol_eliminados
    @GetMapping("/rol_eliminados")
    public String rol_eliminados(){
        return("rol_eliminados");
    }
    
     //    roles
    @GetMapping("/roles")
    public String roles( Model model){
        var roles = rolesDao.findAll();
        model.addAttribute("roles", roles);
        return("roles");
    }
    
     //    unidades eliminadas
    @GetMapping("/unid_eliminadas")
    public String unid_eliminadas(){
        return("unid_eliminadas");
    }
    
     //    unidades
    @GetMapping("/unidades")
    public String unidades(Model model){
        var unidades = unidadesDao.findAll();
        model.addAttribute("unidades", unidades);
        return("unidades");
    }
    
     //    usuarios
    @GetMapping("/usuarios")
    public String usuarios(){
        return("usuarios");
    }
     //    unidades
    @GetMapping("/usuarios_eliminados")
    public String usuarios_eliminados(){
        return("usuarios_eliminados");
    }
    
    
  
}
