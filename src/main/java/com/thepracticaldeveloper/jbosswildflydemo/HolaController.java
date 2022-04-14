package com.thepracticaldeveloper.jbosswildflydemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moises.macero
 */
@RestController
@RequestMapping("/hola")
public final class HolaController {
	
	@Autowired
	private FinDao fin;

    @GetMapping
    public String dimeHola(){
        var message = "Hola Amigo!";
        return message;
    }
    
    @GetMapping("/hola")
    public String dimeHolaa(){
         List<Fin> message = fin.empList();
         for (Fin fin : message) {
			System.out.println(fin.getCode()+":"+fin.getType());
		}
        return message.size()+"";
    }
}
