package tarea8;

public class Envio {
    public static void main(String args[]) {
        EjeEnvio ejeenvio = new EjeEnvio();

        ejeenvio.numeroGuia = 1234;
        ejeenvio.setFecha("4/2/2023");
        ejeenvio.setTipoEmbalaje("Box");
        ejeenvio.cedulaCliente = 123456;
        ejeenvio.setPeso(4);
        ejeenvio.setCiudadOrigen("Calarcá");
        ejeenvio.setCiudadDestino("Bogotá");
        ejeenvio.setCosto(23000);
        ejeenvio.setEstadoEnvio("Sent");

        System.out.println("The cost per kilo of your shipment is: " + ejeenvio.calcularCostoXKilo() + " since your package has a weight of: " + ejeenvio.getPeso() + "kg");

        System.out.println(ejeenvio.verificarEntrega());


    }
}
