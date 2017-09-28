package com.haruki.grafuAparatas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
	public static Scanner x;
	
	public static void main(String[] args) {
		
		try{
			x = new Scanner(new File("data.txt"));
		}catch(Exception e){
			System.out.println("Failas nerastas!");
		}
		
		List<Point> taskai = new ArrayList<Point>();
		Point temp = new Point("name", "none", 0, new ArrayList<Connection>()) ;
		Connection con = new Connection("name", "destination");
		
		while(x.hasNext()){
			temp.vardas = x.next();
			temp.rysiuKiekis = x.nextInt();
			temp.zyme = x.next();
			for(int i = 0; i < temp.rysiuKiekis; i++){
				con.vardas = x.next();
				con.tikslas = x.next();
				temp.rysys.add(new Connection(con.vardas, con.tikslas));
			}
			taskai.add(new Point(temp.vardas, temp.zyme, temp.rysiuKiekis, temp.rysys));
		}
		
		for(int i = 0; i < taskai.size(); i++){
			System.out.print(taskai.get(i).vardas + "\t" + taskai.get(i).zyme + "\t" + taskai.get(i).rysiuKiekis + "  ");
			for(int j = 0; j<taskai.get(i).rysiuKiekis; j++){
				System.out.print(taskai.get(i).rysys.get(j).vardas + "=" + taskai.get(i).rysys.get(j).tikslas + "  ");
			}
			System.out.println();
		}
		
	}

}