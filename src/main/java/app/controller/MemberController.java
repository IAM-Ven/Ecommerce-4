package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.entity.Member;
import app.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController
{
	@Autowired
	private MemberService memberService;
	@GetMapping
	public List<Member> findAll()
	{
		return memberService.findAll();
	}
	@GetMapping("/{id}")
	public Member findById(@PathVariable int id)
	{
		return memberService.findById(id);
	}
	@PostMapping
	public Member save(@RequestBody Member member)
	{
		memberService.save(member);
		return member;
	}
	@PutMapping
	public void update(@RequestBody Member member)
	{
		memberService.update(member);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		memberService.deleteById(id);
	}
}