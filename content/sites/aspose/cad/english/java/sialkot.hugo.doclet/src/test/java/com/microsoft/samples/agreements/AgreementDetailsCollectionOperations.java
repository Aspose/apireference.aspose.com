package com.microsoft.samples.agreements;

import com.microsoft.samples.BasePartnerComponentString;
import com.microsoft.samples.IPartner;


/**
 * Agreement details collection operations implementation class {@link BasePartnerComponentString} is base class important {@link AgreementDetailsCollectionOperations#get()}.
 *  {@link AgreementDetailsCollectionOperations} is child class
 *
 */
public class AgreementDetailsCollectionOperations
        extends BasePartnerComponentString
        implements IAgreementDetailsCollection

{
    /**
     * Initializes a new instance of the AgreementDetailsCollectionOperations class.
     *
     * @param rootPartnerOperations The root partner operations instance.
     */
    public AgreementDetailsCollectionOperations( IPartner rootPartnerOperations, IPartner secondPartnerOperation, String string, int number)
    {
        super( rootPartnerOperations );
    }
    AgreementDetailsCollectionOperations(IPartner rootPartnerOperations)
    {
        super(rootPartnerOperations);
    }
    private AgreementDetailsCollectionOperations(IPartner rootPartnerOperations, boolean isPrivate)
    {
        super(rootPartnerOperations);
    }

    /**
     * Retrieves the agreement details.
     * Read and Write {@link long}
     * @return A list of agreement details.
     */
    public ResourceCollection<AgreementMetaData> get()
    {
        return null;
    }
    void isInternal() {}
    private void isPrivate(){}
    public void isPublic(){}

    /**
     * This method returns A {@link AgreementMetaData}
     * @return A {@link AgreementMetaData}
     * @param iAgreementDetailsCollection The {@link IAgreementDetailsCollection}
     */
    public AgreementMetaData getAgreementMetaData(IAgreementDetailsCollection iAgreementDetailsCollection){return null;}

    protected Object memberwiseClone()
    {
        return null;
    }
}