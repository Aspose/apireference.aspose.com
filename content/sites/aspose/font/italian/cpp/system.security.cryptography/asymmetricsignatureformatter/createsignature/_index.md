---
title: "Metodo System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature"
linktitle: "CreateSignature"
second_title: "Aspose.Font per C++"
description: "Metodo System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature. Informazioni RTTI in C++."
type: docs
weight: 100
url: /it/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


Informazioni RTTI.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) per calcolare l'hash. |

### ReturnValue

Firma calcolata in forma di array di byte.
## Osservazioni


Crea la firma per i dati specificati.
## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


Crea la firma per il valore hash specificato.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Algoritmo di hash da utilizzare durante la creazione della firma. |

### ReturnValue

Firma calcolata in forma di array di byte.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
