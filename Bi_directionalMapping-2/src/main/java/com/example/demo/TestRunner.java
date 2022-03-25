package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Irepo.IAnswarRepo;
import com.example.demo.Irepo.IquestionRepo;
import com.example.demo.entity.Answar;
import com.example.demo.entity.Question;
@Component
public class TestRunner implements CommandLineRunner{
@Autowired
IquestionRepo que;
@Autowired
IAnswarRepo aws;
	@Override
	public void run(String... args) throws Exception {
		Question s =new Question();
		s.setQid(123);
		s.setQuen("whats about today");
		que.save(s);
		Answar an=new Answar();
		an.setAid(1);
        an.setAns("good");	
        s.setAw(an);//here set answer in question
        
       an.setQ(s);//here set question in answar
       
       aws.save(an);
       que.save(s);
       
	}

}
