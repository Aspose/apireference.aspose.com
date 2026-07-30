---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature Methode"
linktitle: "VerifySignature"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature Methode. Verifiziert die Signatur des Daten-Hashs in C++."
type: docs
weight: 400
url: /de/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


Verifiziert die Signatur des Daten-Hashes.

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | Hash für die Daten berechnet. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Signatur für die Daten empfangen. |

### ReturnValue

True, wenn die Signatur gültig ist, false sonst.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
