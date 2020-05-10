package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entity.Member;

public interface MemberRepository extends JpaRepository<Member,Integer>
{
    Member findByUsername(String username);
}