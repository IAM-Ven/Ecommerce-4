package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import app.entity.Seller;
import app.repository.SellerRepository;

@Service
public class SellerService
{
	@Autowired
	private SellerRepository sellerRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	public void save(Seller seller)
	{
		seller.setPassword(passwordEncoder.encode(seller.getPassword()));
		sellerRepository.save(seller);
	}
	public void update(Seller seller)
	{
		sellerRepository.save(seller);
	}
	public void deleteById(int id)
	{
		sellerRepository.deleteById(id);
	}
	public Seller findById(int id)
	{
		return sellerRepository.findById(id).orElse(null);
	}
	public List<Seller> findAll()
	{
		return sellerRepository.findAll();
	}
    public Seller findByUsername(String username)
    {
    	return sellerRepository.findByUsername(username);
    }
}