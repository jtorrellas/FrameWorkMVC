package model;

public interface ModelInterface {
	

	/*Métodos que el Controller utilizará para controlar el ModelInterface basado en las acciones del usuario*/
	//void initialize();
	//void on();
	//void off();
	//void setBPM(int bpm);
	void setPosicionNaveAliada(NaveAliada nAliada);
	void setPosicionMisilAliado(MisilAliado mAliado);
	
	
	
	/*Métodos que utilizan la Vista y el Controller para conocer el estado del ModelInterface, a través de un patrón Observer*/
	//int getBPM();
	//void registerObserver(BeatObserver o);//Registrar un tipo de observador que sólo le interesa conocer cuándo sucede cada beat
	//void removeObserver(BeatObserver o);//Eliminar un tipo de observador que sólo le interesa conocer cuándo sucede cada beat
	//void registerObserver(BPMObserver o);//Registrar un tipo de observador que sólo le interesa conocer los BPMs actuales
	//void removeObserver(BMPObserver o);//Elminar un tipo de observador que sólo le interesa conocer cuándo sucede cada beat
	
	void posicion getPosicionNaveAliada();//Devuelve la posicion (X,Y) de la nave Aliada
	void posicion getPosicionMisilAliado();//Devuelve la posicion (X,Y) del misil Aliado
	/*
	 * Devuelve estado y posicion de la patrulla de naves Alienígenas.
	 * En el nivel fácil una patrulla tendrá 2 naves alienígenas, en el nivel normal 3, en el nivel complicado 4 y en
	 * el nivel imposible 5.  Hasta que no se destruyan todas las naves de una patrulla, no sale la siguiente patrulla
	 */
	ArrayList<NaveAlienigena> patrullaAlienigena();
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	int getPuntos();
	int getVidas();
	boolean getEscudo();
	
}
