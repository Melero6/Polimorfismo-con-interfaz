package Polieinter;



public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Interfazz[] lista=new Interfazz[3];

		lista[0]=new ClaseA();
		lista[1]=new ClaseB();
		lista[2]=new ClaseB();

		for (int i=0;i<lista.length;i++)
			System.out.println(lista[i].devuelve());


		

	}

}
