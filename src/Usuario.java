public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(9);
        smartTv.almentarVolume();
        smartTv.almentarVolume();
        //smartTv.delsigar();

        if(smartTv.ligada == true){
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);
        } 
        if(smartTv.ligada == false){
            System.out.println("TV desligada.");
        }
    }
}
