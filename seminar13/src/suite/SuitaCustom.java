package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import suite.categorii.ITestePromovabilitateCategorii;
import suite.categorii.ITesteUrgente;
import teste.TestPomovabiliateteGrupaCuFixture;
import teste.TestPromovabilitateGrupaDubluri;
import teste.TesteConstructorGrupa;
import teste.TesteGetPromovabilitateGrupa;

@RunWith(Categories.class)
@SuiteClasses({ TesteConstructorGrupa.class, TesteGetPromovabilitateGrupa.class,
	TestPomovabiliateteGrupaCuFixture.class, TestPromovabilitateGrupaDubluri.class })
@IncludeCategory(ITestePromovabilitateCategorii.class)
@ExcludeCategory(ITesteUrgente.class)
public class SuitaCustom {
	
}
