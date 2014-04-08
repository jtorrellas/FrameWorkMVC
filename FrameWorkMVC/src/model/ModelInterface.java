package model;

public interface ModelInterface {
	

	/*M�todos que el Controller utilizar� para controlar el ModelInterface basado en las acciones del usuario*/
	//void initialize();
	//void on();
	//void off();
	//void setBPM(int bpm);
	void setPosicionNaveAliada(NaveAliada nAliada);
	void setPosicionMisilAliado(MisilAliado mAliado);
	
	
	
	/*M�todos que utilizan la Vista y el Controller para conocer el estado del ModelInterface, a trav�s de un patr�n Observer*/
	//int getBPM();
	//void registerObserver(BeatObserver o);//Registrar un tipo de observador que s�lo le interesa conocer cu�ndo sucede cada beat
	//void removeObserver(BeatObserver o);//Eliminar un tipo de observador que s�lo le interesa conocer cu�ndo sucede cada beat
	//void registerObserver(BPMObserver o);//Registrar un tipo de observador que s�lo le interesa conocer los BPMs actuales
	//void removeObserver(BMPObserver o);//Elminar un tipo de observador que s�lo le interesa conocer cu�ndo sucede cada beat
	
	void posicion getPosicionNaveAliada();//Devuelve la posicion (X,Y) de la nave Aliada
	void posicion getPosicionMisilAliado();//Devuelve la posicion (X,Y) del misil Aliado
	/*
	 * Devuelve estado y posicion de la patrulla de naves Alien�genas.
	 * En el nivel f�cil una patrulla tendr� 2 naves alien�genas, en el nivel normal 3, en el nivel complicado 4 y en
	 * el nivel imposible 5.  Hasta que no se destruyan todas las naves de una patrulla, no sale la siguiente patrulla
	 */
	ArrayList<NaveAlienigena> patrullaAlienigena();
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	int getPuntos();
	int getVidas();
	boolean getEscudo();
	
}
