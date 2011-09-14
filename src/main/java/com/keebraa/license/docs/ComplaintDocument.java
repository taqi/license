package com.keebraa.license.docs;

import com.keebraa.docs.exceptions.DocumentHandlingException;

public class ComplaintDocument extends AbstractLicenseBasedDocument
{
    private StringBuilder text;
    
    private static final String lineSeparatorKey = "line.separator";

    public ComplaintDocument(DisposalDocument document) throws DocumentHandlingException
    {
        super(document);
        text = new StringBuilder();
    }

    public void setText(String text)
    {
        this.text = new StringBuilder();
        this.text.append(text);
    }

    public void addText(String text)
    {
        this.text.append(text);
    }

    public void addTextLine(String text)
    {
        if(this.text.length() > 0)
        {
            this.text.append(System.getProperty(lineSeparatorKey));
        }
        this.text.append(text);
    }
    
    public String getText()
    {
        return this.text.toString();
    }
}
