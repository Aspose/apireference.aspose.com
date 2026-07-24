---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature methode"
linktitle: "VerifySignature"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature methode. Verifieert de DSA-handtekening voor de opgegeven gegevens in C++."
type: docs
weight: 1900
url: /nl/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Verifieer de [DSA](../../dsa/) handtekening voor de opgegeven gegevens.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) ondertekend met **rgb_signature**. |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) handtekening. |

### ReturnValue

true - als **rgb_signature** overeenkomt met de op **rgb_hash** berekende [DSA](../../dsa/) handtekening, anders - false.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
