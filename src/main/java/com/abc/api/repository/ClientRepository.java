package com.abc.api.repository;

import com.abc.api.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository  extends CrudRepository<Client, Long>
{
    Client findById (long id);
}

