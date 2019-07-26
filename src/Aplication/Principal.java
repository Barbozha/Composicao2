package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import Entidades.Comentario;

//import org.graalvm.compiler.graph.Position;

import Entidades.Post;

public class Principal {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
		//Comentário do Post 1
		Comentario c1 = new Comentario("Tenha uma boa viagem.");
		Comentario c2 = new Comentario("Uau isso é incrível");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", 
					"I'm going to visit this wonderful country!", 12);
		p1.addcomentario(c1);
		p1.addcomentario(c2);
		System.out.println(p1);
		
		//Comentário do Post 2
		Comentario c3 = new Comentario("Good night.");
		Comentario c4 = new Comentario("May the Force be with you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", 
					"See you tomorrow", 5);
		p2.addcomentario(c3);
		p2.addcomentario(c4);
		
		
		System.out.println(p2);
		
		
		ler.close();
	}
}

