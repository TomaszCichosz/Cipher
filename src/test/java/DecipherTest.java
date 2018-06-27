import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecipherTest {

    private EncipheredMessage encipheredMessage;
    private String message;

    @Test
    public void when__Provided__Expected() {
        message = "";
        encipheredMessage = new EncipheredMessage(message);
        assertEquals("", encipheredMessage.decipher());
    }

    @Test
    public void when_A_Provided_A_Expected() {
        message = "A";
        encipheredMessage = new EncipheredMessage(message);
        assertEquals("A", encipheredMessage.decipher());
    }

    @Test
    public void when___Provided___Expected() {
        message = " ";
        encipheredMessage = new EncipheredMessage(message);
        assertEquals(" ", encipheredMessage.decipher());
    }

    @Test
    public void when_Aaltao_km_a_Provided_Ala_ma_kota_Expected() {
        message = "Aaltao km a";
        encipheredMessage = new EncipheredMessage(message);
        assertEquals("Ala ma kota", encipheredMessage.decipher());
    }

    @Test
    public void whenStringWithOddLength_BkoelleokL__i_Provided_Bolek_i_Lolek_Expected() {
        message = "BkoelleokL  i";
        encipheredMessage = new EncipheredMessage(message);
        assertEquals("Bolek i Lolek", encipheredMessage.decipher());
    }

    @Test
    public void whenStringWithEvenLength_BkoelleokL__iE_Provided_Bolek_iE_Lolek_Expected() {
        message = "BkoelleokL  iE";
        encipheredMessage = new EncipheredMessage(message);
        assertEquals("Bolek iE Lolek", encipheredMessage.decipher());
    }
}