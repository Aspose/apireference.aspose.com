---
title: "Méthode System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature"
linktitle: "CréerSignature"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature. Informations RTTI en C++."
type: docs
weight: 100
url: /fr/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


Informations RTTI.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) à utiliser pour calculer le hachage. |

### ReturnValue

Signature calculée sous forme de tableau d'octets.
## Remarques


Crée la signature pour les données spécifiées.
## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


Crée la signature pour la valeur de hachage spécifiée.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| hachage | System::SharedPtr\<HashAlgorithm\> | Algorithme de hachage à utiliser lors de la création de la signature. |

### ReturnValue

Signature calculée sous forme de tableau d'octets.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
