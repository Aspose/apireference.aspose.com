---
title: Aspose::Page::XPS::Presentation::Pdf::PdfDigitalSignatureDetails class
linktitle: PdfDigitalSignatureDetails
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Presentation::Pdf::PdfDigitalSignatureDetails class. Contains details for a PDF digital signature in C++.'
type: docs
weight: 100
url: /cpp/aspose.page.xps.presentation.pdf/pdfdigitalsignaturedetails/
---
## PdfDigitalSignatureDetails class


Contains details for a PDF digital signature.

```cpp
class PdfDigitalSignatureDetails : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_Certificate](./get_certificate/)() const | Certificate to sign with. |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | Hash algorithm. |
| [get_Location](./get_location/)() const | Location of signing. |
| [get_Reason](./get_reason/)() const | The reason of signing. |
| [get_SignatureDate](./get_signaturedate/)() const | Date of signing. |
| [PdfDigitalSignatureDetails](./pdfdigitalsignaturedetails/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509Certificate2\>, System::String, System::String, System::DateTime, PdfDigitalSignatureHashAlgorithm) | Initializes a new instance of the [PdfDigitalSignatureDetails](./) class. |
| [set_Certificate](./set_certificate/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509Certificate2\>) | Certificate to sign with. |
| [set_HashAlgorithm](./set_hashalgorithm/)(PdfDigitalSignatureHashAlgorithm) | Hash algorithm. |
| [set_Location](./set_location/)(System::String) | Location of signing. |
| [set_Reason](./set_reason/)(System::String) | The reason of signing. |
| [set_SignatureDate](./set_signaturedate/)(System::DateTime) | Date of signing. |
| [ToCore](./tocore/)() |  |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
