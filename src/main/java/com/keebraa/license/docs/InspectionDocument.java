package com.keebraa.license.docs;

import com.keebraa.docs.exceptions.DocumentHandlingException;
import com.keebraa.docs.model.Document;

public class InspectionDocument extends AbstractLicenseBasedDocument
{

    public InspectionDocument(Document basedDocument) throws DocumentHandlingException
    {
        super(basedDocument);
    }

}
