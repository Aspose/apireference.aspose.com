---
title: "Método VerifySignature de System::Security::Cryptography::AsymmetricSignatureDeformatter"
linktitle: "VerifySignature"
second_title: "Aspose.Page para C++"
description: "Método System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature. Verifica la firma en los datos en C++."
type: docs
weight: 300
url: /es/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Verifica la firma en los datos.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) firmado con **rgbSignature**. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Firma que debe verificarse para los datos. |

### ReturnValue

True si la verificación de la firma tiene éxito, false en caso contrario.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


Verifica la firma en los datos. No implementado.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Algoritmo a usar para el hash. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Firma que debe verificarse para los datos. |

### ReturnValue

True si la verificación de la firma tiene éxito, false en caso contrario.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
