package com.keebraa.license.docs;

import com.keebraa.docs.exceptions.DocumentHandlingException;
import com.keebraa.docs.model.BasedDocument;
import com.keebraa.docs.model.Document;

public abstract class AbstractLicenseBasedDocument extends BasedDocument
{

    public AbstractLicenseBasedDocument(Document basedDocument)
            throws DocumentHandlingException
    {
        super(basedDocument);
    }

    @Override
    public boolean hasRecords()
    {
        return false;
    }
}
