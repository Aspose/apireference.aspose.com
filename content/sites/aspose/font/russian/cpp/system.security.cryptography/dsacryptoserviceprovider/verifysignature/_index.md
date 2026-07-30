---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature method"
linktitle: "VerifySignature"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature method. Проверяет DSA‑подпись для указанных данных в C++."
type: docs
weight: 1900
url: /ru/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Проверить подпись [DSA](../../dsa/) для указанных данных.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) подписан с помощью **rgb_signature**. |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) подпись. |

### ReturnValue

true — если **rgb_signature** совпадает с подписью [DSA](../../dsa/), вычисленной по **rgb_hash**, иначе — false.

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
