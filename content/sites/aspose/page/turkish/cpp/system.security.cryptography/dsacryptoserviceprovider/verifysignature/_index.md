---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature yöntemi"
linktitle: "VerifySignature"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature yöntemi. Belirtilen veri için C++'da DSA imzasını doğrular."
type: docs
weight: 1900
url: /tr/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Belirtilen veri için [DSA](../../dsa/) imzasını doğrula.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) **rgb_signature** ile imzalanmış. |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) imzası. |

### ReturnValue

true - eğer **rgb_signature**, **rgb_hash** üzerinde hesaplanan [DSA](../../dsa/) imzasıyla eşleşiyorsa, aksi takdirde - false.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
