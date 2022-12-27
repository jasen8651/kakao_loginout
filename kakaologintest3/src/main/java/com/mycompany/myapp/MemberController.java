package com.mycompany.myapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

	//http://localhost:8090/myapp/kakaologin.do

@Controller
public class MemberController {

	@Autowired
	private MemberService ms;
	
	@RequestMapping(value="/kakaologin.do", method=RequestMethod.GET)
	public String kakaoLogin(@RequestParam(value = "code", required = false) String code) throws Exception {
		System.out.println("#########" + code);
		
		String access_Token = ms.getAccessToken(code);
		System.out.println("####access_Token#### : " + access_Token);
		
		HashMap<String, Object> userInfo = ms.getUserInfo(access_Token);
		System.out.println("###access_Token#### : " + access_Token);
		System.out.println("###nickname#### : " + userInfo.get("nickname"));
		System.out.println("###email#### : " + userInfo.get("email"));
		System.out.println("###gender###"+ userInfo.get("gender"));
		System.out.println("###age_range###"+ userInfo.get("age_range"));
		return "login";
		
	}
	
	 

}