package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller,Integer>
{
    Seller findByUsername(String username);
}