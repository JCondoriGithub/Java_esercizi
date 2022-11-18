package calcolatrice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)	// si esegue la classe-suite con il runner "Suite.class"
@Suite.SuiteClasses({		// si indicano le classi di test da eseguire nel seguente ordine
	CalcolatriceParametriTest.class,
	CalcolatriceTest.class
})
public class MySuiteSuite {

}

// quindi è possibile avere vari gruppi di classi-test 