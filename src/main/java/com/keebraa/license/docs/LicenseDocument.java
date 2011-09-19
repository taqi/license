package com.keebraa.license.docs;

import com.keebraa.docs.exceptions.DocumentHandlingException;
import com.keebraa.docs.model.Document;

public class LicenseDocument extends AbstractLicenseBasedDocument
{

    public LicenseDocument(Document basedDocument) throws DocumentHandlingException
    {
        super(basedDocument); 
    }

}
