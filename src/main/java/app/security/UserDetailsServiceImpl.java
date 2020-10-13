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
    private SellerService sellerService;
    @Autowired
    private MemberService memberService;
    private String type;
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        UserDetails userDetails=null;
        if(type.equals("seller"))
            userDetails=sellerService.findByUsername(username);
        else if(type.equals("member"))
            userDetails=memberService.findByUsername(username);
        if(userDetails==null)
            throw new UsernameNotFoundException(username);
        return userDetails;
    }
    public void setType(String type)
    {
        this.type=type;
    }
}