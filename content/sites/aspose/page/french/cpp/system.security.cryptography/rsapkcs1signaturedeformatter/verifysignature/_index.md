---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature méthode"
linktitle: "VerifySignature"
second_title: "Aspose.Page pour C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature méthode. Vérifie la signature du hachage des données en C++."
type: docs
weight: 400
url: /fr/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


Vérifie la signature du hachage des données.

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | Hachage calculé pour les données. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Signature reçue pour les données. |

### ReturnValue

Vrai si la signature est valide, faux sinon.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
