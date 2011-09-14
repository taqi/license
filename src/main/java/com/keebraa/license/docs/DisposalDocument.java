package com.keebraa.license.docs;

import com.keebraa.docs.exceptions.DocumentHandlingException;

public class DisposalDocument extends AbstractLicenseBasedDocument
{

    public DisposalDocument(ReportDocument basedDocument) throws DocumentHandlingException
    {
        super(basedDocument); 
    }

}
