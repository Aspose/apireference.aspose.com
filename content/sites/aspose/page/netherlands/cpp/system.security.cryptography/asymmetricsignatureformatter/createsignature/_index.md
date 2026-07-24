---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature methode"
linktitle: "CreateSignature"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature methode. RTTI-informatie in C++."
type: docs
weight: 100
url: /nl/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


RTTI-informatie.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) om hash te berekenen voor. |

### ReturnValue

Berekende handtekening in byte-arrayvorm.
## Opmerkingen


Maakt de handtekening voor de opgegeven gegevens.
## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


Maakt de handtekening voor de opgegeven hashwaarde.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Hash-algoritme om te gebruiken bij het maken van een handtekening. |

### ReturnValue

Berekende handtekening in byte-arrayvorm.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
