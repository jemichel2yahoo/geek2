package org.jemichel.hello;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 */
public class HelloTest 
{
    /**
     * Test the Hello class.
     */
    @Test public void testHello()
    {
        Hello.main( new String[] {} );

        Hello mockedHello = mock(Hello.class);
        when( mockedHello.getTimes() ).thenReturn(100);

        System.out.println( mockedHello.getTimes() );
        assertEquals(mockedHello.getTimes(), 100);

        verify(mockedHello, times(2)).getTimes();
    }
}
