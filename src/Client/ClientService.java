package Client;

import java.util.ArrayList;
import java.util.Comparator;

public class ClientService {

    public static ArrayList<Client> clients = new ArrayList<>();

    public static void displayClients ()

    {


        clients.sort(Comparator.comparing(Client::getLastName));

        System.out.println("List of clients: \n");
        for ( Client client : clients)
        {
            System.out.println(client.toString());
        }
    }

    public static Client getClientById (int id)
    {
        for ( Client client : clients)
        {
            if ( client.getID() == id) {
                return client;
            }
        }
        return null;
    }

    public static Client getClientByCnp (String CNP)
    {
        for ( Client client : clients)
        {
            if ( client.getPersonalCodeNumber().equals(CNP)) {
                return client;
            }
        }
        return null;
    }

    public static ArrayList <Client> addClient (Client client) {

        clients.add(client);

        return clients;

    }



    public static void deleteClient (Client client){

        clients.remove(client);

    }
}
