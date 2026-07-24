---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfDigitalSignatureDetails::PdfDigitalSignatureDetails コンストラクタ"
linktitle: "PdfDigitalSignatureDetails"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfDigitalSignatureDetails::PdfDigitalSignatureDetails コンストラクタ。C++ で PdfDigitalSignatureDetails クラスの新しいインスタンスを初期化します。"
type: docs
weight: 100
url: /ja/cpp/aspose.page.xps.presentation.pdf/pdfdigitalsignaturedetails/pdfdigitalsignaturedetails/
---
## PdfDigitalSignatureDetails::PdfDigitalSignatureDetails constructor


新しい [PdfDigitalSignatureDetails](../) クラスのインスタンスを初期化します。

```cpp
Aspose::Page::XPS::Presentation::Pdf::PdfDigitalSignatureDetails::PdfDigitalSignatureDetails(System::SharedPtr<System::Security::Cryptography::X509Certificates::X509Certificate2> certificate, System::String reason, System::String location, System::DateTime signatureDate, PdfDigitalSignatureHashAlgorithm hashAlgorithm)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 証明書 | System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509Certificate2\> | 証明書です。 |
| 理由 | System::String | 理由です。 |
| location | System::String | 場所です。 |
| signatureDate | System::DateTime | 署名の日付です。 |
| hashAlgorithm | PdfDigitalSignatureHashAlgorithm | ハッシュアルゴリズムです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [X509Certificate2](../../../system.security.cryptography.x509certificates/x509certificate2/)
* Class [String](../../../system/string/)
* Class [DateTime](../../../system/datetime/)
* Enum [PdfDigitalSignatureHashAlgorithm](../../pdfdigitalsignaturehashalgorithm/)
* Class [PdfDigitalSignatureDetails](../)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../../)
* Library [Aspose.Page for C++](../../../)
