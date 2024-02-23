package com.vayana.Java8Features;


@RestController
public class APIDemo {
	
	
	@GetMapping("/Sudent")
	public Student getStudent{
		
		return new Student();
	}
	
	@Autowired
	public Student student;
	
	@PostMapping
	public void saveStudentInfo(@RequestBody Student student) {
		
		
		student.setName("Basamma");
		student.setRollnum(12);
	}

}

/getStudent?name="basmma"
/getstudent/basamma
{
	
	"id":"12";
	"name":"test"
}