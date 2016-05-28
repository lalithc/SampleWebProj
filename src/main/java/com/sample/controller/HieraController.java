/**
 * 
 */
package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lalit
 *
 */
@Controller
public class HieraController {
	
	
	@RequestMapping("/deploy{productid}")
	public String deploy(String env,String module,String version)throws Exception{
		
		
		
		return null;
	}
	
	public String promote(String srcEnv,String destEnv,String module)throws Exception{
		
		return null;
	}

}
