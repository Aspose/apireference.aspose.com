---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature metod"
linktitle: "VerifySignature"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature metod. Verifierar signaturen för datahashen i C++."
type: docs
weight: 400
url: /sv/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


Verifierar signaturen för datahash.

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | Hash beräknad för data. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Signatur mottagen för data. |

### ReturnValue

Sant om signaturen är giltig, falskt annars.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
