---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature metodu"
linktitle: "VerifySignature"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature metodu. C++'ta belirtilen veri için DSA imzasını doğrular."
type: docs
weight: 1900
url: /tr/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Belirtilen veri için [DSA](../../dsa/) imzasını doğrula.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) **rgb_signature** ile imzalanmış. |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) imzası. |

### ReturnValue

doğru - eğer **rgb_signature**, **rgb_hash** üzerinde hesaplanan [DSA](../../dsa/) imzasıyla eşleşiyorsa, aksi takdirde - yanlış.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
