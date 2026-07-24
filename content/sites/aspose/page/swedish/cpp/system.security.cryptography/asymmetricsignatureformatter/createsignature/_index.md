---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature method"
linktitle: "CreateSignature"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature method. RTTI-information i C++."
type: docs
weight: 100
url: /sv/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


RTTI-information.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) för att beräkna hash för. |

### ReturnValue

Beräknad signatur i bytearrayform.
## Anmärkningar


Skapar signaturen för den angivna datan.
## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


Skapar signaturen för det specificerade hashvärdet.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Hashalgoritm att använda när signaturen skapas. |

### ReturnValue

Beräknad signatur i bytearrayform.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
