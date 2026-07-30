---
title: "Metodo System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature"
linktitle: "VerifySignature"
second_title: "Aspose.Font per C++"
description: "Metodo System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature. Verifica la firma sui dati in C++."
type: docs
weight: 300
url: /it/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Verifica la firma sui dati.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) firmata con **rgbSignature**. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Firma da verificare per i dati. |

### ReturnValue

Vero se il controllo della firma ha successo, falso altrimenti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


Verifica la firma sui dati. Non implementato.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Algoritmo da utilizzare per l'hashing. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Firma da verificare per i dati. |

### ReturnValue

Vero se il controllo della firma ha successo, falso altrimenti.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
