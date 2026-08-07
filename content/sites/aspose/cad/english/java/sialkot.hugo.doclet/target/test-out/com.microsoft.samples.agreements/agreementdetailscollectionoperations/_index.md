---
title: AgreementDetailsCollectionOperations
second_title: Aspose.Sildes for Java API Reference
description: Agreement details collection operations implementation class  is base class important .
type: docs
weight: 10
url: /java/com.microsoft.samples.agreements/agreementdetailscollectionoperations/
---
**Inheritance:**
java.lang.Object, com.microsoft.samples.BasePartnerComponent, [com.microsoft.samples.BasePartnerComponentString](../../com.microsoft.samples/basepartnercomponentstring)

**All Implemented Interfaces:**
[com.microsoft.samples.agreements.IAgreementDetailsCollection](../../com.microsoft.samples.agreements/iagreementdetailscollection)
```
public class AgreementDetailsCollectionOperations extends BasePartnerComponentString implements IAgreementDetailsCollection
```

Agreement details collection operations implementation class [BasePartnerComponentString](../../com.microsoft.samples/basepartnercomponentstring) is base class important [AgreementDetailsCollectionOperations\#get()](../../com.microsoft.samples.agreements/agreementdetailscollectionoperations\#get--). [AgreementDetailsCollectionOperations](../../com.microsoft.samples.agreements/agreementdetailscollectionoperations) is child class
## Constructors

| Constructor | Description |
| --- | --- |
| [AgreementDetailsCollectionOperations(IPartner rootPartnerOperations, IPartner secondPartnerOperation, String string, int number)](#AgreementDetailsCollectionOperations-com.microsoft.samples.IPartner-com.microsoft.samples.IPartner-java.lang.String-int-) | Initializes a new instance of the AgreementDetailsCollectionOperations class. |
## Methods

| Method | Description |
| --- | --- |
| [get()](#get--) | Retrieves the agreement details. |
| [isPublic()](#isPublic--) |  |
| [getAgreementMetaData(IAgreementDetailsCollection iAgreementDetailsCollection)](#getAgreementMetaData-com.microsoft.samples.agreements.IAgreementDetailsCollection-) | This method returns A [AgreementMetaData](../../com.microsoft.samples.agreements/agreementmetadata) |
### AgreementDetailsCollectionOperations(IPartner rootPartnerOperations, IPartner secondPartnerOperation, String string, int number) {#AgreementDetailsCollectionOperations-com.microsoft.samples.IPartner-com.microsoft.samples.IPartner-java.lang.String-int-}
```
public AgreementDetailsCollectionOperations(IPartner rootPartnerOperations, IPartner secondPartnerOperation, String string, int number)
```


Initializes a new instance of the AgreementDetailsCollectionOperations class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rootPartnerOperations | [IPartner](../../com.microsoft.samples/ipartner) | The root partner operations instance. |
| secondPartnerOperation | [IPartner](../../com.microsoft.samples/ipartner) |  |
| string | java.lang.String |  |
| number | int |  |

### get() {#get--}
```
public ResourceCollection<AgreementMetaData> get()
```


Retrieves the agreement details. Read and Write long

**Returns:**
[ResourceCollection](../../com.microsoft.samples.agreements/resourcecollection) - A list of agreement details.
### isPublic() {#isPublic--}
```
public void isPublic()
```




### getAgreementMetaData(IAgreementDetailsCollection iAgreementDetailsCollection) {#getAgreementMetaData-com.microsoft.samples.agreements.IAgreementDetailsCollection-}
```
public AgreementMetaData getAgreementMetaData(IAgreementDetailsCollection iAgreementDetailsCollection)
```


This method returns A [AgreementMetaData](../../com.microsoft.samples.agreements/agreementmetadata)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| iAgreementDetailsCollection | [IAgreementDetailsCollection](../../com.microsoft.samples.agreements/iagreementdetailscollection) | The [IAgreementDetailsCollection](../../com.microsoft.samples.agreements/iagreementdetailscollection) |

**Returns:**
[AgreementMetaData](../../com.microsoft.samples.agreements/agreementmetadata) - A [AgreementMetaData](../../com.microsoft.samples.agreements/agreementmetadata)
