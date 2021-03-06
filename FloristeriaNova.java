package com.flowers.persistence;

import java.util.List;
import com.flowers.domain.Arbre;
import com.flowers.domain.Decoracio;
import com.flowers.domain.Flor;
import com.flowers.domain.Floristeria;

public class FloristeriaNova {

	Floristeria f;

	// constructor
	public FloristeriaNova(String nom) {
		
		f = new Floristeria(nom);
	}
	
	public Floristeria getF() {
		return f;
	}

	public void setF(Floristeria f) {
		this.f = f;
	}

	public List<Arbre> getAllArbres() {
		return f.getArbreList();
	}

	public void addArbres(Arbre arbre) {

		f.getArbreList().add(arbre);
		f.setStockArbre(f.getStockArbre() +1);
	}

	public List<Flor> getAllFlors() {
		return f.getFlorList();
	}

	public void addFlors(Flor flor) {
		f.getFlorList().add(flor);
		f.setStockFlor(f.getStockFlor() +1);
	}

	public List<Decoracio> getAllDecoracio() {
		return f.getDecoracioList();
	}

	public void addDecoracio(Decoracio decoracio) {
		f.getDecoracioList().add(decoracio);
		f.setStockDecoracio(f.getStockDecoracio() +1);
	}
	
	public void retirarAbre(Arbre arbre) {
		f.getArbreList().remove(arbre);
		f.setStockArbre(f.getStockArbre() -1);
	}
	
	public void retirarFlor(Flor flor) {
		f.getFlorList().remove(flor);
		f.setStockFlor(f.getStockFlor() -1);
	}

	public void retirarDecoracio(Decoracio decoracio) {
		f.getDecoracioList().remove(decoracio);
		f.setStockDecoracio(f.getStockDecoracio() -1);
	}
	
	public int getStockArbre()
	{
		return f.getStockArbre();
	}
	
	public int getStockFlor()
	{
		return f.getStockFlor();
	}
	
	public int getStockDecoracio()
	{
		return f.getStockDecoracio();
	}
}

