package com.example.demo.trySpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



// DIで利用するためアノテージョン付与
@Controller
public class HelloController {


	@Autowired
	private HelloService helloService;


	// HTTPリクエストのGETメソッドが使用できる
	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}

	//POSTメソッドで送られてきたデータを処理できる
	@PostMapping("/hello")
	public String postRequest(@RequestParam("text1")String str, Model model) { //入力受け取り

		model.addAttribute("sample", str);  //値を「"${sample}"」に渡している

		return "helloResponse";     //html返す
	}


	@PostMapping("hello/db")
	public String postDbRequest(@RequestParam("text2")String str, Model model) {

		//フロントから受け取った値をStringからint型に変換
		int id = Integer.parseInt(str);

		//1件検索
		Employee employee = helloService.findOne(id);


		//検索結果をModelに登録
		model.addAttribute("id", employee.getEmployeeId());
		model.addAttribute("name", employee.getEmployeeName());
		model.addAttribute("age", employee.getAge());


		//helloResponseDB.htmlに遷移
		return "helloResponseDB";
	}
}





