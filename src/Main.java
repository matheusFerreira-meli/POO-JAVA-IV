import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crie 3 clientes e salve-os em uma coleção.
        Client client1 = new Client("Matheus", "Ferreira");
        Client client2 = new Client("João", "Gomes");
        Client client3 = new Client("Maria", "Marta");
        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        ClientsList clientList = new ClientsList(clients);

        // Percorra a coleção de clientes e exiba os dados de cada um deles na tela.
        System.out.println(clientList.getClientList());

        // Exclua um dos clientes da lista e volte para imprimir todos os clientes restantes.
        clientList.deleteClient(client2);
        System.out.println(clientList.getClientList());
    }
}