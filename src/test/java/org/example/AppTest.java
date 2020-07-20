package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }



    @Test(expected=IllegalArgumentException.class)
    public void test1() {
        SpringUtils.vowels(null);
    }

    @Test
    public void test2() {
        assertEquals("aa", SpringUtils.vowels("ama"));
    }

    @Test
    public void test3() {
        assertEquals("aeiouyAEIOUY", SpringUtils.vowels("aeiouyAEIOUY"));
    }

    @Test
    public void test4() {
        assertEquals("ae", SpringUtils.uniqueVowels("aaee"));
        assertEquals("Aae", SpringUtils.uniqueVowels("Aaaeeeeffff"));
        assertEquals("", SpringUtils.uniqueVowels("qsdfg"));

    }
}
