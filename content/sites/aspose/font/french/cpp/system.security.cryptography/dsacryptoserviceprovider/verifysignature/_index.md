---
title: "méthode System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature"
linktitle: "VerifySignature"
second_title: "Aspose.Font pour C++"
description: "méthode System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature. Vérifie la signature DSA pour les données spécifiées en C++."
type: docs
weight: 1900
url: /fr/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Vérifier la signature [DSA](../../dsa/) pour les données spécifiées.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) signé avec **rgb_signature**. |
| rgb_signature | ByteArrayPtr | Signature [DSA](../../dsa/). |

### ReturnValue

true - si **rgb_signature** correspond à la signature [DSA](../../dsa/) calculée sur **rgb_hash**, sinon - false.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
