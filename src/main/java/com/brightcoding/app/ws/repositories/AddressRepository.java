package com.achraf.app.ws.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.achraf.app.ws.entities.AddressEntity;
import com.achraf.app.ws.entities.UserEntity;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
    
	List<AddressEntity> findByUser(UserEntity currentUser);
	
	AddressEntity findByAddressId(String addressId);
}
