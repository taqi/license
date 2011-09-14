package com.keebraa.license.docs;

import com.keebraa.docs.exceptions.DocumentHandlingException;

public class ReportDocument extends AbstractLicenseBasedDocument
{

    public ReportDocument(InspectionDocument basedDocument) throws DocumentHandlingException
    {
        super(basedDocument); 
    }
}
