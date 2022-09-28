import java.util.List;

public class ClientsList {
    private final List<Client> clientList;

    public ClientsList(List<Client> clientsList) {
        this.clientList = clientsList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void deleteClient(Client client) {
        try {
            clientList.remove(client);
        } catch (UnsupportedOperationException exception) {
            System.out.println("Não foi possível remover esse cliente");
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Finalizando operação");
        }
    }

    public void deleteClient(int index) {
        try {
            clientList.remove(index);
        } catch (UnsupportedOperationException exception) {
            System.out.println("Não foi possível remover esse cliente");
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Finalizando operação");
        }
    }

    public void findClient() {
        System.out.println("implementar");
    }

}
