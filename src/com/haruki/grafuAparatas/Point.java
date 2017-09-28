package com.haruki.grafuAparatas;

import java.util.ArrayList;
import java.util.List;

public class Point {
	
	public String vardas;
	public String zyme;
	
	public int rysiuKiekis;
	List<Connection> rysys = new ArrayList<Connection>();
	
	public Point(String vardas, String zyme, int rysiuKiekis, List<Connection> rysys){
		this.vardas = vardas;
		this.zyme = zyme;
		this.rysiuKiekis = rysiuKiekis;
		this.rysys = rysys;
	}
}
