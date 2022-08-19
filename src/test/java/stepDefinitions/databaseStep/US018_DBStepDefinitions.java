package stepDefinitions.databaseStep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US018_DBStepDefinitions {

    String filePath = "src/test/resources/testdata/DoktorID.txt";

    @Given("Admin connects to the database")
    public void adminConnectsToTheDatabase() {
        DatabaseUtility.createConnection();
    }

    @Then("Admin gets the {string} table")
    public void adminGetsTheTable(String query) {
        System.out.println(DatabaseUtility.getColumnNames(query) + "\n");

        List<Object> idList = DatabaseUtility.getColumnData(query, "id");
        System.out.println(idList + "\n");
        filePath = "src/test/resources/testdata/DoktorID.txt";
        WriteToTxt.savePhysicianIds(filePath, idList);
    }

    @Then("Admin set the expected data and verify it")
    public void adminSetTheExpectedDataAndVerifyIt() {
        List<Object> actualData = ReadTxt.returnPhysicianIDsList(filePath);
        List<Object> expectedData = new ArrayList<Object>();
        expectedData.add(135673);
        expectedData.add(94211);
        expectedData.add(42958);
        expectedData.add(36433);
        expectedData.add(12345);
        expectedData.add(10514);
        expectedData.add(10520);
        expectedData.add(3651);
        expectedData.add(10517);
        expectedData.add(10516);
        expectedData.add(10507);
        expectedData.add(147332);
        expectedData.add(147335);
        expectedData.add(147340);
        expectedData.add(10518);

        Assert.assertTrue("ID'ler uyusmuyor", actualData.containsAll(expectedData));
    }

    @Then("close the database connection")
    public void closeTheDatabaseConnection() {
        DatabaseUtility.closeConnection();
    }
}
