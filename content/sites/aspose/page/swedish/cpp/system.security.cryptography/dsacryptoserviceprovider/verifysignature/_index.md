---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature metod"
linktitle: "VerifySignature"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature metod. Verifiera DSA-signatur för den angivna datan i C++."
type: docs
weight: 1900
url: /sv/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Verifiera [DSA](../../dsa/) signatur för den angivna datan.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) signerad med **rgb_signature**. |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) signatur. |

### ReturnValue

true - om **rgb_signature** matchar den [DSA](../../dsa/) signatur som beräknats på **rgb_hash**, annars - false.

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
