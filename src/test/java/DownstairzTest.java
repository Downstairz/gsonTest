import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: buddha
 * Date: 2/6/14
 * Time: 7:59 PM
 * To change this template use File | Settings | File Templates.
 */


public class DownstairzTest {

    @Test
    public void testDeserialization() {
        Main downstairzMain = new Main();
        Downstairz downstairzJsonObject = downstairzMain.deserializeJson();
        About aboutDownstairz = downstairzJsonObject.getAbout();
        String[] languages = downstairzJsonObject.getLanguages();

        Assert.assertEquals(aboutDownstairz.getFirstName(), "Buddha");
        Assert.assertEquals(aboutDownstairz.getLastName(), "Soumpholphakdy");
        Assert.assertEquals(aboutDownstairz.getAlias(), "Downstairz");

        Assert.assertTrue(languages.length == 7);
    }

    @Test
    public void testSerialization() {
        Downstairz downstairz = getBaseDownstairzJsonO();

        Gson gson = new Gson();
        String downstairzJsonStr = gson.toJson(downstairz);

        System.out.println(downstairz);
        Assert.assertTrue(downstairzJsonStr.contains("Buddha"));
        Assert.assertTrue(downstairzJsonStr.contains("Soumpholphakdy"));
        Assert.assertTrue(downstairzJsonStr.contains("Downstairz"));
        Assert.assertTrue(downstairzJsonStr.contains("Objective-c"));
        Assert.assertTrue(downstairzJsonStr.contains("Java"));
        Assert.assertTrue(downstairzJsonStr.contains("Python"));
        Assert.assertTrue(downstairzJsonStr.contains("Perl"));
        Assert.assertTrue(downstairzJsonStr.contains("Ruby"));
        Assert.assertTrue(downstairzJsonStr.contains("PHP"));
        Assert.assertTrue(downstairzJsonStr.contains("Javascript"));
    }

    private Downstairz getBaseDownstairzJsonO() {
        Downstairz downstairzObject = new Downstairz();
        String[] languages = new String[]{"Objective-c","Java", "Python","Perl","Ruby","PHP","Javascript"};
        About aboutDownstairz = new About();
        aboutDownstairz.setAlias("Downstairz");
        aboutDownstairz.setFirstName("Buddha");
        aboutDownstairz.setLastName("Soumpholphakdy");

        downstairzObject.setLanguages(languages);
        downstairzObject.setAbout(aboutDownstairz);
        return downstairzObject;
    }

    private Downstairz2 getBaseDownstairzJsonO2() {
        Downstairz2 downstairzObject = new Downstairz2();
        String[] languages = new String[]{"Objective-c","Java", "Python","Perl","Ruby","PHP","Javascript"};
        About aboutDownstairz = new About();
        aboutDownstairz.setAlias("Downstairz");
        aboutDownstairz.setFirstName("Buddha");
        aboutDownstairz.setLastName("Soumpholphakdy");

        downstairzObject.setLanguages(languages);
        downstairzObject.setAbout(aboutDownstairz);
        return downstairzObject;
    }

    private Downstairz3 getBaseDownstairzJsonO3() {
        Downstairz3 downstairzObject = new Downstairz3();
        String[] languages = new String[]{"Objective-c","Java", "Python","Perl","Ruby","PHP","Javascript"};
        About aboutDownstairz = new About();
        aboutDownstairz.setAlias("Downstairz");
        aboutDownstairz.setFirstName("Buddha");
        aboutDownstairz.setLastName("Soumpholphakdy");

        downstairzObject.setLanguages(languages);
        downstairzObject.setAbout(aboutDownstairz);
        return downstairzObject;
    }

    @Test
    public void testExtraParamWithCustomNameWhenSerializing() {
        Downstairz2 downstairz2 = getBaseDownstairzJsonO2();

        Gson gson = new Gson();
        String downstairzJsonStr = gson.toJson(downstairz2);
        System.out.println(downstairzJsonStr);
        Assert.assertTrue(downstairzJsonStr.contains("Buddha AKA Downstairz"));

    }

    @Test
    public void testSerializingSpecificFields() {
        Downstairz3 downstairz3 = getBaseDownstairzJsonO3();
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        String downstairzJsonStr = gson.toJson(downstairz3);
        System.out.println(downstairzJsonStr);
        Assert.assertTrue(!downstairzJsonStr.contains("about"));
        Assert.assertTrue(!downstairzJsonStr.contains("og"));

    }
}
