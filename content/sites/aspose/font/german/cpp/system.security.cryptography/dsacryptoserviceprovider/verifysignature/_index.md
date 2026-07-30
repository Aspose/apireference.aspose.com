---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature Methode"
linktitle: "VerifySignature"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature Methode. Verifiziert DSA-Signatur für die angegebenen Daten in C++."
type: docs
weight: 1900
url: /de/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Verifiziere [DSA](../../dsa/) Signatur für die angegebenen Daten.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Daten](../../../system.data/) signiert mit **rgb_signature**. |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) Signatur. |

### ReturnValue

true - wenn **rgb_signature** mit der [DSA](../../dsa/) Signatur übereinstimmt, die aus **rgb_hash** berechnet wurde, sonst - false.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
