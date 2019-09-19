package com.productcateg.Security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.productcateg.ServiceImpl.AccountServiceImpl;
import com.productcateg.entity.Client;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
	@Autowired
	private AccountServiceImpl accountService;
	@Override
	public UserDetails loadUserByUsername(String nameClient) throws UsernameNotFoundException {
		Client client= accountService.getClientByNameClient(nameClient);
		if (client==null) throw new UsernameNotFoundException("User Not Found");
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		client.getRoles().forEach(r->{
			authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
		});
		return new User(client.getNameClient(), client.getPassword(), authorities);
		//return new User();
	}
}
