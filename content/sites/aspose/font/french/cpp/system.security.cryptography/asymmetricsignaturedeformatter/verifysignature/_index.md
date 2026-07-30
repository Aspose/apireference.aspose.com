---
title: "Méthode System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature"
linktitle: "VerifySignature"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature. Vérifie la signature sur les données en C++."
type: docs
weight: 300
url: /fr/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Vérifie la signature des données.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) signé avec **rgbSignature**. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Signature à vérifier pour les données. |

### ReturnValue

Vrai si la vérification de la signature réussit, faux sinon.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


Vérifie la signature des données. Non implémenté.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| hachage | System::SharedPtr\<HashAlgorithm\> | Algorithme à utiliser pour le hachage. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Signature à vérifier pour les données. |

### ReturnValue

Vrai si la vérification de la signature réussit, faux sinon.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
