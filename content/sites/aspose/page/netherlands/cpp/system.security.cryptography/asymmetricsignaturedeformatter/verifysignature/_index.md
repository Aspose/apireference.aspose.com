---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature-methode"
linktitle: "VerifySignature"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature methode. Verifieert de handtekening op gegevens in C++."
type: docs
weight: 300
url: /nl/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Verifieert de handtekening op gegevens.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) ondertekend met **rgbSignature**. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Handtekening die moet worden geverifieerd voor gegevens. |

### ReturnValue

True als de handtekeningcontrole slaagt, false anders.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


Verifieert de handtekening op gegevens. Niet geïmplementeerd.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Algoritme om te gebruiken voor hashen. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Handtekening die moet worden geverifieerd voor gegevens. |

### ReturnValue

True als de handtekeningcontrole slaagt, false anders.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
