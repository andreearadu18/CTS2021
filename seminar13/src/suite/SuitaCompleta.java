package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.TestPomovabiliateteGrupaCuFixture;
import teste.TestPromovabilitateGrupaDubluri;
import teste.TesteConstructorGrupa;
import teste.TesteGetPromovabilitateGrupa;

@RunWith(Suite.class)
@SuiteClasses({ TesteConstructorGrupa.class, TesteGetPromovabilitateGrupa.class,
		TestPomovabiliateteGrupaCuFixture.class, TestPromovabilitateGrupaDubluri.class })
public class SuitaCompleta {

}
