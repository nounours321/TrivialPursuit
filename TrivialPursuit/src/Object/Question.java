package Object;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question {
	//
	 Statement stmt;
	 ResultSet rs = null;
	 
	 private String question;
	 private String answer1;
	 private String answer2;
	 private String answer3;
	 private String category;
	 private String correctanswer;     
 
	public Question(String question, String answer1, String answer2, String answer3, String category, String correctanswer) {
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.category = category;
		this.correctanswer = correctanswer;
	}

	public Question() {
		
	}
	
	
	

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCorrectanswer() {
		return correctanswer;
	}

	public void setCorrectanswer(String correctanswer) {
		this.correctanswer = correctanswer;
	}
	
}
