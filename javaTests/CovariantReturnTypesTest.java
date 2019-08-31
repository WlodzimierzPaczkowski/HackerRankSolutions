import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


// here i create taste cases for CovariantReturnTypes exercise, i tested all classes for all their methods
// there is repetition of tests code for all subclasses
class FlowerTest {
    @Test
    void whatsYourName() {
        //Given
        String returnStatement = "I have many names and types.";

        //When
        Flower flower = new Flower();

        //Then
        assertEquals(flower.whatsYourName(), returnStatement);
    }
}

class JasmineTest {
    @Test
    void whatsYourName() {
        //Given
        String returnStatement = "Jasmine";

        //When
        Jasmine jasmine = new Jasmine();

        //Then
        assertEquals(jasmine.whatsYourName(), returnStatement);
    }
}

class LilyTest {
    @Test
    void whatsYourName() {
        //Given
        String returnStatement = "Lily";

        //When
        Lily lily = new Lily();

        //Then
        assertEquals(lily.whatsYourName(), returnStatement);
    }
}

class RegionTest {
    @Test
    void yourNationalFlower() {
        //Given
        Flower returnClass = new Flower();

        //When
        Region region = new Region();


        // Then (i decided to test if region return correct flower by
        // comparing whatsYourName() method of object given back by region and whatsYourName()
        // method of instance of class region should return
        assertEquals(region.yourNationalFlower().whatsYourName(), returnClass.whatsYourName());
    }
}
// tests fixed, i forget to put "Test" at end of class, so junit didn't work correctly, which explain why same
// logic used in region test work but here it didn't
class AndhraPradeshTest {
    @Test
    void yourNationalFlower() {
        //Given
        Lily returnClass = new Lily();

        //When
        AndhraPradesh region = new AndhraPradesh();


        // Then
        assertEquals(region.yourNationalFlower().whatsYourName(), returnClass.whatsYourName() );
    }
}

class WestBengalTest {
    @Test

    void yourNationalFlower() {
        //Given
        Jasmine returnClass = new Jasmine();

        //When
        WestBengal region = new WestBengal();

        // Then
        assertEquals(region.yourNationalFlower().whatsYourName(), returnClass.whatsYourName() );
    }
}

//this is only for sake of knowing which exercises this test belong to
class CovariantReturnTypesTest {
}