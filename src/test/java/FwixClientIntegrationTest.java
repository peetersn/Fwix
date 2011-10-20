import com.fwix.api.domain.Place;
import com.fwix.api.domain.PlacesWrapper;
import com.fwix.api.service.FwixAPIWrapper;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;

@ContextConfiguration({"classpath:/fwixContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class FwixClientIntegrationTest {

    @Autowired
    private FwixAPIWrapper fwixAPIWrapper;

    private static String apiKey;

    @BeforeClass
    public static void loadProperties() throws IOException {
        Properties props = new Properties();
        InputStream inputStream = FwixClientIntegrationTest.class.getClassLoader().getResourceAsStream("auth.properties");
        props.load(inputStream);
        apiKey = props.getProperty("key");
    }

    @Test
    public void findByLatLng() throws Exception {
        PlacesWrapper places = fwixAPIWrapper.findByLatLng(apiKey, "35.047762", "-90.026237");
        assertNotNull(places);
        for (Place p : places.getPlaces()) {
            assertNotNull(p);
            System.out.println(p.toString());
        }
    }

    @Test
    public void findByLoc() throws Exception {
        PlacesWrapper places = fwixAPIWrapper.findByLocality(apiKey, "NY", "New+York+City", "Tribeca");
        assertNotNull(places);
        for (Place p : places.getPlaces()) {
            assertNotNull(p);
            System.out.println(p.toString());
        }
    }

    @Test
    public void findById() throws Exception {
        Place p = fwixAPIWrapper.findById(apiKey, "17f5fcd-3312-7a52-f551-d4e8f70dbc8a9");
        assertNotNull(p);
        System.out.println(p.toString());
    }
}
