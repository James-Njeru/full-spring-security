/*
package com.example.full_spring_security.service;

import com.example.full_spring_security.entity.Users;
import com.example.full_spring_security.repository.UsersRepository;
import com.example.full_spring_security.security.SecurityUser;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Optional<Users> u = usersRepository.findByUsername(username);

        return u.map(SecurityUser::new)
                .orElseThrow(()-> new UsernameNotFoundException("Username not found"));
    }
}
*/
