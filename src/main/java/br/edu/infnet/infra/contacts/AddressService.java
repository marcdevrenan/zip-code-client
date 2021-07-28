package br.edu.infnet.infra.contacts;

import br.edu.infnet.domain.contacts.Address;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;

public class AddressService {

    private final String REST_URI = "https://viacep.com.br/ws/";
    private final Client client = ClientBuilder.newClient();

    public Address getByZipCode(String cep) {

        return client.target(REST_URI).path(cep).path("json").request(MediaType.APPLICATION_JSON).get(Address.class);
    }
}
