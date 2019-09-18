package utilities;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class CompareImages
{
    public static boolean IsPngEquals(File pngFile, byte[] pngBytes) throws IOException
    {
        BufferedImage imageA = ImageIO.read(pngFile);

        ByteArrayInputStream inStreamB = new ByteArrayInputStream(pngBytes);
        BufferedImage imageB = ImageIO.read(inStreamB);
        inStreamB.close();

        DataBufferByte dataBufferA = (DataBufferByte) imageA.getRaster().getDataBuffer();
        DataBufferByte dataBufferB = (DataBufferByte) imageB.getRaster().getDataBuffer();

        if (dataBufferA.getNumBanks() != dataBufferB.getNumBanks())
        {
            return false;
        }
        for (int bank = 0; bank < dataBufferA.getNumBanks(); bank++)
        {
            if (!Arrays.equals(dataBufferA.getData(bank), dataBufferB.getData(bank)))
            {
                return false;
            }
        }
        return true;
    }
}
