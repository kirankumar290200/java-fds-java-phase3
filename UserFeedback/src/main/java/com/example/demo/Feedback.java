package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Feedback {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String comments;
	private int rating;
	private String user;
	
	public Feedback()
	{
		
	}
	public Feedback(Integer id, String comments, int rating, String user)
	{
		this.id = id;
		this.comments = comments;
		this.rating = rating;
		this.user = user;
	}
	
	@Override
	public String toString()
	{
//		return "<br><h3>" + user + " [" + id + "]" + " commented:</h3><h4>\"" + comments + "\"  and rated: " + rating + "</h4><br>";
		return(
	            "<style>\n" + 
	            "table {\n" + 
	            "  font-family: Arial, Helvetica, sans-serif;\n" + 
	            "  border-collapse: collapse;\n" + 
	            "  width: 100%;\n" + 
	            "}\n" + 
	            "\n" + 
	            "table td, table th {\n" + 
	            "  border: 1px solid #ddd;\n" + 
	            "  padding: 8px;\n" + 
	            "}\n" + 
	            "\n" + 
	            "table tr:nth-child(even){background-color: #f2f2f2;}\n" + 
	            "\n" + 
	            "table tr:hover {background-color: #ddd;}\n" + 
	            "\n" + 
	            "table th {\n" + 
	            "  padding-top: 12px;\n" + 
	            "  padding-bottom: 12px;\n" + 
	            "  text-align: left;\n" + 
	            "  background-color: #4CAF50;\n" + 
	            "  color: white;\n" + 
	            "}\n" + 
	            "</style>"
	            + "<table border='2' style='margin-left: auto;\n" + 
	            "  margin-right: auto;width:50%;'>"
	            +"<tr>"
	            +"<th> UserName </th>"
	            +"<th> Id </th>"
	            +"<th> Comments </th>"
	            +"<th> Rating </th>"
	            +"</tr>"
	            +"<td>"+user+"</td>"
	            +"<td>"+id+"</td>"
	            +"<td>"+comments+ "</td>"
	            +"<td> rating </td>"
	            +"</tr>"
	            +"</table>");
	}
}
