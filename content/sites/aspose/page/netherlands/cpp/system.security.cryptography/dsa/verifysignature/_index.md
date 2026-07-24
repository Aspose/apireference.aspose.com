---
title: "System::Security::Cryptography::DSA::VerifySignature methode"
linktitle: "VerifySignature"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::DSA::VerifySignature methode. Verifieert DSA-handtekening voor de opgegeven gegevens in C++."
type: docs
weight: 800
url: /nl/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


Verifieer [DSA](../) handtekening voor de opgegeven gegevens.

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) ondertekend met **rgb_signature**. |
| rgb_signature | ByteArrayPtr | [DSA](../) handtekening. |

### ReturnValue

true - als **rgb_signature** overeenkomt met de [DSA](../) handtekening berekend op **rgb_hash**, anders - false.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
