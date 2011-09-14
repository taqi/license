package com.keebraa.license.docs;

import com.keebraa.docs.exceptions.DocumentHandlingException;
import com.keebraa.docs.model.Document;

public class AbstractLicenseDocument extends Document
{

    public AbstractLicenseDocument() throws DocumentHandlingException
    {
        super();
    }

    @Override
    public boolean hasRecords()
    {
        return false;
    }
}
