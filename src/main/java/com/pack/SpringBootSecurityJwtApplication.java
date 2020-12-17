package com.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pack.models.ERole;
import com.pack.models.Formateur;
import com.pack.models.Formation;
import com.pack.models.Role;
import com.pack.repository.EvaluationRepository;
import com.pack.repository.FormateurRepository;
import com.pack.repository.FormationRepository;
import com.pack.repository.RoleRepository;
import com.pack.repository.UserRepository;


@SpringBootApplication
public class SpringBootSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}
	
	@Autowired
	RoleRepository roleRepo;
	@Autowired
	FormateurRepository formateurrepository;
	@Autowired
	FormationRepository formationrepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	EvaluationRepository evaluationrepository;
	

	@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			
			//initiation des roles
			roleRepo.save(new Role(ERole.ROLE_ADMIN));
			roleRepo.save(new Role(ERole.ROLE_USER));
			
			
			/*initiation de l'admin
			Set<Role> adminroles=new HashSet<Role>();
			adminroles.add(new Role(ERole.ROLE_ADMIN));
			System.out.println(adminroles);
			User admin=new User("admin", "admin@g.com", "azertyui");
			//admin.setRoles(adminroles);
			System.out.println("roles");
			System.out.println(admin.getRoles());
			userRepository.save(admin);*/
			
			
			Formateur mahdi = new Formateur("Lellehom","Mahdi","2548", "87542136", "aaa","aa@g.com", "fff", "bbb");
			formateurrepository.save(mahdi);
			Formation java=new Formation("java","3 jours", mahdi);
			formationrepository.save(java);
			
			/*Evaluation eval1 = new Evaluation("16","17","10", "9", "14",java);
			evaluationrepository.save(eval1);*/

			
			
			/*formationrepository.findAll().forEach(f->{
				System.out.println(f.getFormateur().toString());
			});*/
			/* Create users with BCrypt encoded password (user/user, admin/admin)
			Role role1 = new Role("ROLE_USER");
			Role role2 = new Role("ROLE_MODERATOR");
			Role role3 = new Role("ROLE_ADMIN");
			roleRepo.save(role1);
			roleRepo.save(role2);
			roleRepo.save(role3);

			 Affichage
			roleRepo.findAll().forEach(p -> {
				System.out.println(p.toString());

			});*/

		};
	}


}
