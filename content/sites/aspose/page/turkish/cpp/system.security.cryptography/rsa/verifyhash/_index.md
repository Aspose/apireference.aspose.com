---
title: "System::Security::Cryptography::RSA::VerifyHash method"
linktitle: "VerifyHash"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RSA::VerifyHash yöntemi. Belirtilen hash'in imzasının C++'ta geçerli olduğunu doğrular."
type: docs
weight: 1400
url: /tr/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


Belirtilen hash'in imzasının geçerli olduğunu doğrular.

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| özet | ByteArrayPtr | İmzalanmış verinin hash değeri. |
| imza | ByteArrayPtr | İmza verisi. |
| hash_algorithm | const HashAlgorithmName\& | Hash algoritması. |
| dolgu | SharedPtr\<RSASignaturePadding\> | Dolgu modu. İmza geçerli ise true, aksi takdirde false döndürür. |

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
