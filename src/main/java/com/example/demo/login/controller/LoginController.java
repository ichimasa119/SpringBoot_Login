// ログイン画面の処理をハンドリングする


package com.example.demo.login.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class LoginController {

	//ログイン画面のGETコントローラー
	@GetMapping("/login")
	public String getLogin(Model model) {

		//login.htmlに遷移
		return "login/login";
	}

	//ログイン画面のPOSTコントローラー
	@PostMapping("/login")
	public String postLogin(Model model) {

		//login.htmlに遷移
		return "login/login";
	}
}

