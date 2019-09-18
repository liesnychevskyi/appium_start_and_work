package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class CapabilitiesReader
    {
     //---------------------------------------------------------------------------------------------------------------//
        public CapabilitiesReader()
        {

        }
    //----------------------------------------------------------------------------------------------------------------//
        public DesiredCapabilities getCapabilities()
        {
            DesiredCapabilities cap = new DesiredCapabilities();
            BufferedReader reader;

            try
            {
                reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\cababilities\\androidCapabilities.txt"));
                String line = reader.readLine();
                while (line != null)
                {
                    System.out.println(line);
                    String[] caps = line.split("=");
                    cap.setCapability(caps[0], caps[1]);
                    line = reader.readLine();
                }
                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            return cap;
        }
    //----------------------------------------------------------------------------------------------------------------//
    }