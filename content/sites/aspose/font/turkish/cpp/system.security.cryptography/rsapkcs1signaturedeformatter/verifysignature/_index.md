---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature metodu"
linktitle: "VerifySignature"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature metodu. Veri hash'inin imzasını C++'ta doğrular."
type: docs
weight: 400
url: /tr/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


Veri karmasının imzasını doğrular.

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | Veri için hesaplanan hash. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Veri için alınan imza. |

### ReturnValue

İmza geçerliyse Doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
