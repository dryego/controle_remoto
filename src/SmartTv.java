public class SmartTv {
    boolean ligada = false;
    int canal = 13;
    int volume = 5;

    public void ligar(){
        ligada = true;
    }

    public void delsigar(){
        ligada = false;
    }

    public void almentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }   

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void almentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
}