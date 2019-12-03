package com.transfert.isi.transfert.services.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.transfert.isi.transfert.models.Authority;
import com.transfert.isi.transfert.models.Utilisateur;
import com.transfert.isi.transfert.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
//ou @Component
public class CustumUserDetailsService implements UserDetailsService{
	@Autowired
	private UtilisateurRepository utilisateurRepository ;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Utilisateur user = utilisateurRepository.findUtilisateurByLogin(username);
		if(user != null)
		{
			 User u = new User(user.getLogin(),user.getPassword(),
					 true,true,true,true,getAuthorities(user.getRoles()));

			 return u ;
		}

		return null;
	}

	private Collection getAuthorities(List roles) {
		List authorities = new ArrayList();
		for(Object role : roles)
		{
			Authority l = (Authority)role;
			authorities.add(new SimpleGrantedAuthority(l.getLibelle()));
		}
		return authorities ;
	}

}
