package ejercicio_13;
// @author DUVERNEY NAVEROS COD.2020118773

public class main {
    public static void main(String[] args){
        CD cd_musica = new CD();
        System.out.println("numero de canciones: "+cd_musica.numeroCanciones());
        cd_musica.agrega("Save your tears-the weeknd");
        cd_musica.agrega("Serial killer-lana del rey");
        cd_musica.agrega("Dance macabre-ghost BC");
        System.out.println("numero de canciones: "+cd_musica.numeroCanciones());
        cd_musica.dameCancion(3);
        cd_musica.dameCancion(1);
        cd_musica.dameCancion(5);
        //hacemos un reemplazo de la cancion de la posicion 2
        cd_musica.grabaCancion(2, "Heathens-twenty one pilots");
        cd_musica.dameCancion(2);
        //agregamos la siguiente cancion
        cd_musica.agrega("me in 20 years-Moses sumney");
        System.out.println("numero de canciones: "+cd_musica.numeroCanciones());
        cd_musica.elimina(3);
        System.out.println("numero de canciones: "+cd_musica.numeroCanciones());
    }
}
