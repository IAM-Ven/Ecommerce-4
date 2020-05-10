package app.security;

import app.service.MemberService;
import app.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
    @Autowired
    private MemberService memberService;
    @Autowired
    private SellerService sellerService;
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        UserDetails userDetails=memberService.findByUsername(username);
        if(userDetails==null)
            userDetails=sellerService.findByUsername(username);
        return userDetails;
    }
}