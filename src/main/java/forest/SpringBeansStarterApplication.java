
package forest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import forest.beans.Animal;
import forest.beans.Diet;
import forest.controller.BeanConfiguration;
import forest.repository.AnimalRepository;

@SpringBootApplication
public class SpringBeansStarterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBeansStarterApplication.class, args);
		
	}
	
	@Autowired
	AnimalRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Animal a = appContext.getBean("animal", Animal.class);
		a.setSex('M');
		repo.save(a);
		
		
		Animal b = new Animal("Baylee", "Dog", 'F', 74.8);
		Diet d = new Diet("Squirrel", true);
		b.setDiet(d);
		repo.save(b);
		
		List<Animal> allMyAnimals = repo.findAll();
		for(Animal animal: allMyAnimals) {
			System.out.println(animal.toString());
		}
		
		((AnnotationConfigApplicationContext) appContext).close();
	}
}