package aula08.ex1;

public class ex1 {
    public static void main(String[] args) {
        
        Empresa empresa = new Empresa("BinhosETremoços", "3880-405", "gunao@ua.pt");

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Motociclo motociclo1 = new Motociclo("Honda","CBR","20-50-FP", 125 ,"Estrada");
        motociclo1.trajeto(100);
        
        Motociclo motociclo2 = new Motociclo("Yamaha","ATV","99-IA-45", 450 ,"Pista");
        motociclo2.trajeto(150);

        Motociclo motociclo3 = new Motociclo("Kawasaki","Ninja","45-PO-99", 600 ,"Estrada");
        motociclo3.trajeto(200);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        AutomovelLigeiro automovelLigeiro1 = new AutomovelLigeiro("BMW", "M6", "00-OO-00", 650, 4885949, 5);
        automovelLigeiro1.trajeto(100);

        AutomovelLigeiro automovelLigeiro2 = new AutomovelLigeiro("Audi", "A8", "11-11-11", 500, 4885949, 5);
        automovelLigeiro2.trajeto(150);

        AutomovelLigeiro automovelLigeiro3 = new AutomovelLigeiro("Mercedes", "S", "22-22-22", 600, 4885949, 5);
        automovelLigeiro3.trajeto(200);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Taxi taxi1 = new Taxi("Ford", "Focus", "33-33-33", 100, 4885949, 5, 1);
        taxi1.trajeto(100);

        Taxi taxi2 = new Taxi("Ford", "Focus", "44-44-44", 100, 4885949, 5, 2);
        taxi2.trajeto(150);

        Taxi taxi3 = new Taxi("Ford", "Focus", "55-55-55", 100, 4885949, 5, 3);
        taxi3.trajeto(200);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        PesadoMercadorias pesadoMercadorias1 = new PesadoMercadorias("Mercedes", "Actros", "66-66-66", 100, 4885949, 5, 1);
        pesadoMercadorias1.trajeto(100);

        PesadoMercadorias pesadoMercadorias2 = new PesadoMercadorias("Mercedes", "Actros", "77-77-77", 100, 4885949, 5, 2);
        pesadoMercadorias2.trajeto(150);

        PesadoMercadorias pesadoMercadorias3 = new PesadoMercadorias("Mercedes", "Actros", "88-88-88", 100, 4885949, 5, 3);
        pesadoMercadorias3.trajeto(200);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        PesadoPassageiros pesadoPassageiros1 = new PesadoPassageiros("Mercedes ", "Actros ", "99-99-99", 100, 4885949, 5, 1);
        pesadoPassageiros1.trajeto(100);

        PesadoPassageiros pesadoPassageiros2 = new PesadoPassageiros("Mercedes ", "Actros ", "00-00-00", 100, 4885949, 5, 2);
        pesadoPassageiros2.trajeto(150);

        PesadoPassageiros pesadoPassageiros3 = new PesadoPassageiros("Mercedes ", "Actros ", "11-11-11", 100, 4885949, 5, 3);
        pesadoPassageiros3.trajeto(200);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        empresa.addVeiculos(motociclo1, motociclo2, motociclo3);
        empresa.addVeiculos(automovelLigeiro1, automovelLigeiro2, automovelLigeiro3);
        empresa.addVeiculos(taxi1, taxi2, taxi3);
        empresa.addVeiculos(pesadoMercadorias1, pesadoMercadorias2, pesadoMercadorias3);
        empresa.addVeiculos(pesadoPassageiros1, pesadoPassageiros2, pesadoPassageiros3);

        System.out.println(empresa.toString());

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        for (Veiculo veiculo : empresa.getVeiculos()) {
            System.out.println(veiculo.toString());
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Veiculo veiculoComMaiorDistancia = null;
        for (Veiculo veiculo : empresa.getVeiculos()) {
            if (veiculoComMaiorDistancia == null) {
                veiculoComMaiorDistancia = veiculo;
            } else if (veiculo.distanciaTotal() > veiculoComMaiorDistancia.distanciaTotal()) {
                veiculoComMaiorDistancia = veiculo;
            }
        }

        System.out.println(veiculoComMaiorDistancia.toString());


    }
}
