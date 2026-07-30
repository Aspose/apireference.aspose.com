---
title: "System::Security::Cryptography::DSA::VerifySignature yöntemi"
linktitle: "VerifySignature"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::DSA::VerifySignature yöntemi. C++'ta belirtilen veri için DSA imzasını doğrular."
type: docs
weight: 800
url: /tr/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


Belirtilen veri için [DSA](../) imzasını doğrula.

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) **rgb_signature** ile imzalanmış. |
| rgb_signature | ByteArrayPtr | [DSA](../) imzası. |

### ReturnValue

true - eğer **rgb_signature**, **rgb_hash** üzerinde hesaplanan [DSA](../) imzasıyla eşleşiyorsa, aksi takdirde - false.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
