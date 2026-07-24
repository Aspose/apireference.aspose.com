---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfDigitalSignatureDetails::PdfDigitalSignatureDetails 构造函数"
linktitle: "PdfDigitalSignatureDetails"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfDigitalSignatureDetails::PdfDigitalSignatureDetails 构造函数。初始化在 C++ 中的 PdfDigitalSignatureDetails 类的新实例。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.xps.presentation.pdf/pdfdigitalsignaturedetails/pdfdigitalsignaturedetails/
---
## PdfDigitalSignatureDetails::PdfDigitalSignatureDetails constructor


初始化 [PdfDigitalSignatureDetails](../) 类的新实例。

```cpp
Aspose::Page::XPS::Presentation::Pdf::PdfDigitalSignatureDetails::PdfDigitalSignatureDetails(System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate2> certificate, System::String reason, System::String location, System::DateTime signatureDate, PdfDigitalSignatureHashAlgorithm hashAlgorithm)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 证书 | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509Certificate2\> | 证书。 |
| 原因 | System::String | 原因。 |
| location | System::String | 位置。 |
| signatureDate | System::DateTime | 签名日期。 |
| hashAlgorithm | PdfDigitalSignatureHashAlgorithm | 该哈希算法。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509Certificate2](../../../system.security.cryptography.x509certificates/x509certificate2/)
* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Enum [PdfDigitalSignatureHashAlgorithm](../../pdfdigitalsignaturehashalgorithm/)
* Class [PdfDigitalSignatureDetails](../)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../../)
* Library [Aspose.Page for C++](../../../)
