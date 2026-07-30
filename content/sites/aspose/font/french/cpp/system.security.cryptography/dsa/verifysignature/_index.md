---
title: "System::Security::Cryptography::DSA::VerifySignature méthode"
linktitle: "VerifySignature"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::DSA::VerifySignature method. Vérifie la signature DSA pour les données spécifiées en C++."
type: docs
weight: 800
url: /fr/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


Vérifie la signature [DSA](../) pour les données spécifiées.

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) signé avec **rgb_signature**. |
| rgb_signature | ByteArrayPtr | Signature [DSA](../). |

### ReturnValue

true - si **rgb_signature** correspond à la signature [DSA](../) calculée sur **rgb_hash**, sinon - false.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
