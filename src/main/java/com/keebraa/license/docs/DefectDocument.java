package com.keebraa.license.docs;

import com.keebraa.docs.exceptions.DocumentHandlingException;

public class DefectDocument extends AbstractLicenseBasedDocument
{

    public DefectDocument(ReportDocument basedDocument) throws DocumentHandlingException
    {
        super(basedDocument);
    }
}
