/**
 * 
 */
package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lalit
 *sdsdsd
 */
@Controller
public class HieraController {
	
	
	@RequestMapping("/deploy{productid}")
	public String deploy(String env,String module,String version)throws Exception{
		
<<<<<<< HEAD
		//cvcxvcxvcxv
=======
		//
>>>>>>> branch 'master' of https://github.com/lalithc/SampleWebProj.git
		
		return null;
	}
	
	public String promote(String srcEnv,String destEnv,String module)throws Exception{
		
		return null;
	}

}
