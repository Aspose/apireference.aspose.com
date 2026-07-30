---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature Methode"
linktitle: "CreateSignature"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature Methode. RTTI‑Informationen in C++."
type: docs
weight: 100
url: /de/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


RTTI-Informationen.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Daten](../../../system.data/) zum Berechnen des Hashs. |

### ReturnValue

Berechnete Signatur in Form eines Byte‑Arrays.
## Hinweise


Erstellt die Signatur für die angegebenen Daten.
## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


Erstellt die Signatur für den angegebenen Hash-Wert.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| hash | System::SharedPtr\<HashAlgorithm\> | Hash-Algorithmus, der beim Erstellen der Signatur verwendet wird. |

### ReturnValue

Berechnete Signatur in Form eines Byte‑Arrays.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
