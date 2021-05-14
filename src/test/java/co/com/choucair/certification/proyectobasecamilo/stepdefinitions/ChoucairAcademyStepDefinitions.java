package co.com.choucair.certification.proyectobasecamilo.stepdefinitions;

import co.com.choucair.certification.proyectobasecamilo.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobasecamilo.questions.Answer;
import co.com.choucair.certification.proyectobasecamilo.tasks.Login;
import co.com.choucair.certification.proyectobasecamilo.tasks.Openup;
import co.com.choucair.certification.proyectobasecamilo.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Camilo wants to learn automation at the academy Choucair$")
    public void thanCamiloWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("Camilo").wasAbleTo(Openup.thePage(), (Login.OnThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));

    }

    @When("^he search for the course Recursos Automatización Bancolombia on the choucair academy platform$")
    public void heSearchForTheCourseOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }

    @Then("^he finds the course called resources Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalled(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }


}