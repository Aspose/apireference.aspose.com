---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature metodu"
linktitle: "VerifySignature"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature metodu. C++'de veri hash'inin imzasını doğrular."
type: docs
weight: 400
url: /tr/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


Veri karmasının imzasını doğrular.

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | Veri için hesaplanan hash. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Veri için alınan imza. |

### ReturnValue

İmza geçerliyse true, aksi takdirde false.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
