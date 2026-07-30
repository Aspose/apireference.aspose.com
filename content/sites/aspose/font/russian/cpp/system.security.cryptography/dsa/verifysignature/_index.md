---
title: "System::Security::Cryptography::DSA::VerifySignature method"
linktitle: "VerifySignature"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::DSA::VerifySignature method. Проверяет подпись DSA для указанных данных в C++."
type: docs
weight: 800
url: /ru/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


Проверьте подпись [DSA](../) для указанных данных.

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) подписан с помощью **rgb_signature**. |
| rgb_signature | ByteArrayPtr | Подпись [DSA](../). |

### ReturnValue

true - если **rgb_signature** совпадает с подписью [DSA](../), вычисленной на **rgb_hash**, иначе - false.

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
