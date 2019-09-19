package com.productcateg.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productcateg.Service.AccountService;
import com.productcateg.entity.Client;
import com.productcateg.entity.Role;
import com.productcateg.repository.ClientRepository;
import com.productcateg.repository.RoleRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public Client saveClient(String nameClient, String password) {
		Client client= clientRepository.findByNameClient(nameClient);
		if(client!=null) throw new RuntimeException("Client Existe Déja!!");
		
		Client newClient= new Client();
		newClient.setNameClient(nameClient);
		newClient.setPassword(bCryptPasswordEncoder.encode(password));
		clientRepository.save(newClient);
		addRoleToClient(nameClient, "USER");
		return newClient;
	}

	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public Client getClientByNameClient(String nameClient) {
		return clientRepository.findByNameClient(nameClient);
	}

	@Override
	public void addRoleToClient(String nameClient, String roleName) {
		Client client= clientRepository.findByNameClient(nameClient);
		Role role= roleRepository.findByRoleName(roleName);
		client.getRoles().add(role);
		
	}

}
