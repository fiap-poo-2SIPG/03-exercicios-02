package exercicio02;

public class Ponto {
    // atributos ou variáveis de instância
    int x;
    int y;

    // método para calcular e retornar a distância entre dois pontos
    public double calcularDistancia(Ponto p) {
        double distancia;
        distancia = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return distancia;
    }

    // método para calcular e retornar a distância de um ponto até a origem
    public double calcularDistanciaAteOrigem() {
        double distancia;
        Ponto origem = new Ponto();
        distancia = calcularDistancia(origem);
        return distancia;
    }

    // método para retornar os dados do ponto
    public String formatarPonto() {
        return "(" + x + "," + y + ")";
    }

    // método para retornar o ponto mais próximo da origem
    public Ponto maisProximoDaOrigem(Ponto p1, Ponto p2) {
        double dp1 = p1.calcularDistanciaAteOrigem();
        double dp2 = p2.calcularDistanciaAteOrigem();
        if(dp1 < dp2) {
            return p1;
        }
        return p2;
    }

}
