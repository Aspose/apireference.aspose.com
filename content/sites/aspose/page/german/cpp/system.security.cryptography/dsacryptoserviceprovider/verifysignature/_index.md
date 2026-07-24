---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature Methode"
linktitle: "VerifySignature"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature Methode. Verifiziert die DSA‑Signatur für die angegebenen Daten in C++."
type: docs
weight: 1900
url: /de/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Verifiziere die [DSA](../../dsa/) Signatur für die angegebenen Daten.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) signiert mit **rgb_signature**. |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) Signatur. |

### ReturnValue

true – wenn **rgb_signature** mit der auf **rgb_hash** berechneten [DSA](../../dsa/) Signatur übereinstimmt, sonst – false.

## Siehe auch

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
