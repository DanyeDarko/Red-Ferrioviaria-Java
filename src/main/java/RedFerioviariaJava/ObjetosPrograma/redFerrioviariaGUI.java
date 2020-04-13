package RedFerioviariaJava.ObjetosPrograma;

import javax.swing.JFrame;

public class redFerrioviariaGUI extends JFrame {

    public redFerrioviariaGUI() {

        lienzoViasTren nuevoLienzoVias = new lienzoViasTren();
        //<editor-fold defaultstate="collapsed" desc="PROPIEDADES DE VENTANA PRINCIPAL">
        this.setTitle("RED FERRIOVARIA CONCURRENTE"); // TITULO DE VENTANA
        this.setSize(1000, 700); // TAMAÑO DE LA VENTANA ANCHO::LARGO
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // CIERE DE HILO DE LA VENTANA AL CERRAR
        
        this.add(nuevoLienzoVias);
        //</editor-fold>
        
    }

}
