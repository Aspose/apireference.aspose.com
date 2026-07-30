---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash Methode"
linktitle: "VerifyHash"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash Methode. Prüft die Datensignatur in C++."
type: docs
weight: 1800
url: /de/cpp/system.security.cryptography/dsacryptoserviceprovider/verifyhash/
---
## DSACryptoServiceProvider::VerifyHash method


Prüft die Datensignatur.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hash, der für empfangene Daten berechnet wurde. |
| str | const String\& | Name des verwendeten Hash-Algorithmus. |
| rgb_signature | const ByteArrayPtr\& | Signatur wie empfangen. |

### ReturnValue

True, wenn die Signatur gültig ist, false sonst.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
