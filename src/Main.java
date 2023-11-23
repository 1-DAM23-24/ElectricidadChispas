public class Main {

    public static void main(String[] args) {

        Autonomo autonomo= new Autonomo();
        autonomo.setNombre("Daniel");
        autonomo.setApellidos("De La Cueva");
        autonomo.setDni("87563495F");
        autonomo.setCodigoCliente("24563187965478321456");
        autonomo.setEmail("danidelacu@gmail.com");
        autonomo.setTelefono("856248359");
        autonomo.setProvincia("Avila");
        autonomo.setPoblacion("El Barraco");
        autonomo.setDireccionPostal("05110");

        Sociedad sociedad= new Sociedad();
        sociedad.setCif("G12549637");
        sociedad.setCodigoCliente("24563187965478321456");
        sociedad.setEmal("sociedad1@gmail.com");
        sociedad.setRazonSocial("Electricidad Chispas SL");
        sociedad.setTelefono("666666666");
        sociedad.setProvincia("Madrid");
        sociedad.setPoblacion("Alcala de Henares");
        sociedad.setDireccionPostal("28801");

        Producto producto1= new Producto();
        producto1.setCodigoProducto("001");
        producto1.setNombre("Bombilla");
        producto1.setModelo("led e27");
        producto1.setMarca("Philips");
        producto1.setPrecio("2,44");
        producto1.setTipoIva("Tipo 4");

        Producto producto2= new Producto();
        producto2.setCodigoProducto("002");
        producto2.setNombre("Fusible");
        producto2.setModelo("US 0.5A");
        producto2.setMarca("Seki");
        producto2.setPrecio("1,67");
        producto2.setTipoIva("Tipo 0");


        Servicio servicio1= new Servicio();
        servicio1.setCodigoServicio("15789632S");
        servicio1.setNombre("Chispas");
        servicio1.setPrecio("84,23");

        Servicio servicio2= new Servicio();
        servicio2.setCodigoServicio("14963574A");
        servicio2.setNombre("Electra");
        servicio2.setPrecio("76,45");
    }


}
