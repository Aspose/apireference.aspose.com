---
title: Aspose::Words::Saving::PdfDigitalSignatureDetails class
linktitle: PdfDigitalSignatureDetails
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Saving::PdfDigitalSignatureDetails class. Contains details for signing a PDF document with a digital signature in C++.'
type: docs
weight: 22000
url: /cpp/aspose.words.saving/pdfdigitalsignaturedetails/
---
## PdfDigitalSignatureDetails class


Contains details for signing a PDF document with a digital signature.

```cpp
class PdfDigitalSignatureDetails : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_CertificateHolder](./get_certificateholder/)() const | Returns the certificate holder object that contains the certificate was used to sign the document. |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | Gets the hash algorithm. |
| [get_Location](./get_location/)() const | Gets the location of the signing. |
| [get_Reason](./get_reason/)() const | Gets the reason for the signing. |
| [get_SignatureDate](./get_signaturedate/)() const | Gets or sets the date of the signing. |
| [get_TimestampSettings](./get_timestampsettings/)() const | Gets or sets the digital signature timestamp settings. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [PdfDigitalSignatureDetails](./pdfdigitalsignaturedetails/)() | Initializes an instance of this class. |
| [PdfDigitalSignatureDetails](./pdfdigitalsignaturedetails/)(const System::SharedPtr\<Aspose::Words::DigitalSignatures::CertificateHolder\>\&, const System::String\&, const System::String\&, System::DateTime) | Initializes an instance of this class. |
| [set_CertificateHolder](./set_certificateholder/)(const System::SharedPtr\<Aspose::Words::DigitalSignatures::CertificateHolder\>\&) | Returns the certificate holder object that contains the certificate was used to sign the document. |
| [set_HashAlgorithm](./set_hashalgorithm/)(Aspose::Words::Saving::PdfDigitalSignatureHashAlgorithm) | Sets the hash algorithm. |
| [set_Location](./set_location/)(const System::String\&) | Sets the location of the signing. |
| [set_Reason](./set_reason/)(const System::String\&) | Sets the reason for the signing. |
| [set_SignatureDate](./set_signaturedate/)(System::DateTime) | Setter for [Aspose::Words::Saving::PdfDigitalSignatureDetails::get_SignatureDate](./get_signaturedate/). |
| [set_TimestampSettings](./set_timestampsettings/)(const System::SharedPtr\<Aspose::Words::Saving::PdfDigitalSignatureTimestampSettings\>\&) | Setter for [Aspose::Words::Saving::PdfDigitalSignatureDetails::get_TimestampSettings](./get_timestampsettings/). |
| static [Type](./type/)() |  |
## Remarks


At the moment digitally signing PDF documents is only available on .NET 3.5 or higher.

To digitally sign a PDF document when it is created by Aspose.Words, set the [DigitalSignatureDetails](../pdfsaveoptions/get_digitalsignaturedetails/) property to a valid [PdfDigitalSignatureDetails](./) object and then save the document in the PDF format passing the [PdfSaveOptions](../pdfsaveoptions/) as a parameter into the [Save()](../) method.

Aspose.Words creates a PKCS#7 signature over the whole PDF document and uses the "Adobe.PPKMS" filter and "adbe.pkcs7.sha1" subfilter when creating a digital signature.

## See Also

* Namespace [Aspose::Words::Saving](../)
* Library [Aspose.Words for C++](../../)
