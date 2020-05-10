package app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.entity.Member;
import app.repository.MemberRepository;

@Service
public class MemberService
{
	@Autowired
	private MemberRepository memberRepository;
	public void save(Member member)
	{
		memberRepository.save(member);
	}
	public void update(Member member)
	{
		memberRepository.save(member);
	}
	public void deleteById(int id)
	{
		memberRepository.deleteById(id);
	}
	public Member findById(int id)
	{
		return memberRepository.findById(id).orElse(null);
	}
	public List<Member> findAll()
	{
		return memberRepository.findAll();
	}
    public Member findByUsername(String username)
    {
		return memberRepository.findByUsername(username);
    }
}