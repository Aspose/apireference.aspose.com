---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash methode"
linktitle: "VerifyHash"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash methode. Controleert de gegevenshandtekening in C++."
type: docs
weight: 1800
url: /nl/cpp/system.security.cryptography/dsacryptoserviceprovider/verifyhash/
---
## DSACryptoServiceProvider::VerifyHash method


Controleert de gegevenshandtekening.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hash berekend voor ontvangen gegevens. |
| str | const String\& | Naam van de gebruikte hash-algoritme. |
| rgb_signature | const ByteArrayPtr\& | Handtekening zoals ontvangen. |

### ReturnValue

True als de handtekening geldig is, false anders.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
