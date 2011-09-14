package com.keebraa.license.docs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ComplaintDocumentTest
{
    @Test
    public void testSetText() throws Exception
    {
        ComplaintDocument sut = new ComplaintDocument();
        
        assertEquals("", sut.getText());
        
        sut.setText("some text");        
        
        assertNotNull(sut.getText());
        assertEquals("some text", sut.getText());
    }
    
    @Test
    public void testAppendText() throws Exception
    {
        ComplaintDocument sut = new ComplaintDocument();
        
        assertEquals("", sut.getText());
        
        sut.setText("some text");
        sut.addText("some another text");
        
        assertNotNull(sut.getText());
        assertEquals("some textsome another text", sut.getText());
    }
    
    @Test
    public void testAddTextLineToEmptyText() throws Exception
    {
        ComplaintDocument sut = new ComplaintDocument();
        
        assertEquals("", sut.getText());
        
        sut.addTextLine("some text");
        sut.addTextLine("some another text");
        
        String expected = "some text\nsome another text";
        assertNotNull(sut.getText());
        assertEquals(expected, sut.getText());
    }
    
    @Test
    public void testAddTextLineToFilledText() throws Exception
    {
        ComplaintDocument sut = new ComplaintDocument();
        
        assertEquals("", sut.getText());
        sut.setText("filled");
        sut.addTextLine("some text");
        sut.addTextLine("some another text");
        
        String expected = "filled\nsome text\nsome another text";
        assertNotNull(sut.getText());
        assertEquals(expected, sut.getText());
    }
}
