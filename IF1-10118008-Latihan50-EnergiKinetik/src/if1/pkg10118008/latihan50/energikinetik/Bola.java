/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan50.energikinetik;

/**
 *
 * @author ASUS
 */
public class Bola {
	private float m, v, ek, u;	
	
	public Bola(float m, float v){
		this.m = m;
		this.v = v;
		this.ek = hitungEK(m, v);
		this.u = hitungUsaha(m, v);
	}
	
	public float hitungEK(float m, float v){
		return (float)0.5 * m * v * v;
	}

	public float hitungUsaha(float m, float v){
		return (float)(hitungEK(this.m, this.v) - hitungEK(this.m, 0));
	}

	public void tampil(){
		System.out.println("Massa\t\t : "+ this.m);
		System.out.println("Kecepatan\t : "+ this.v);
		System.out.println("Energi Kinetik\t : "+ this.ek);
		System.out.println("Usaha\t\t : "+ this.u);
	}
}
