package app.controller;

import app.entity.Member;
import app.entity.Seller;
import app.security.TokenService;
import app.security.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class Login
{
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @PostMapping("/seller")
    public String seller(@RequestBody Seller user)
    {
        userDetailsService.setType("seller");
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
        UserDetails userDetails=userDetailsService.loadUserByUsername(user.getUsername());
        return tokenService.create(userDetails);
    }
    @PostMapping("/member")
    public String member(@RequestBody Member user)
    {
        userDetailsService.setType("member");
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
        UserDetails userDetails=userDetailsService.loadUserByUsername(user.getUsername());
        return tokenService.create(userDetails);
    }
}