abstract class BebidaCaliente {
    final void prepararReceta(){
        hervirAgua();
        preparar();
        servirEnTaza();
        agregarEspecias();
    }

    abstract void preparar();
    abstract void agregarEspecias();

    void hervirAgua() {
        System.out.println("Hirviendo agua...");
    }

    void servirEnTaza() {
        System.out.println("Sirviendo en taza...");
    }
}


