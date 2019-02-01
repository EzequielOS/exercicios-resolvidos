
/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 31/01/2019
Objetivo sucinto do programa: Configurar e exibir threads
Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/1g6IIaB-HUmiA4QaFkECVG4JA0PRx2BDExf2RtSj4XnQ/edit 
Informações adicionais: 
*/

public class JavaThreads {
	public static void main(String[] args) {
		Printer p1 = new Printer("Eduardo", 100, 20);
		Printer p2 = new Printer("Monica", 100, 20);

		p1.start();
		p2.start();
		try {
			p1.join();
			 p2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
}

class Printer extends Thread {
	String text;
	int delay, times;

	public Printer(String text, int delay, int times) {
		this.delay = delay;
		this.text = text;
		this.times = times;
	}

	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.println(text);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}