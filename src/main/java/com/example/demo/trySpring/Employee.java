//DBの検索結果を保持している

package com.example.demo.trySpring;
import lombok.Data;

@Data
public class Employee {
	private int employeeId;
	private String employeeName;
	private int age;
}
