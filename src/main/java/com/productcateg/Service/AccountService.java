package com.productcateg.Service;

import com.productcateg.entity.Client;
import com.productcateg.entity.Role;

public interface AccountService {
	
	public Client saveClient(String nameClient, String password);
	public Role saveRole(Role role);
	public Client getClientByNameClient(String nameClient);
	public void addRoleToClient(String nameClient, String roleName);

}
