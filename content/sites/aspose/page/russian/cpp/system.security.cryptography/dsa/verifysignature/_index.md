---
title: "Метод System::Security::Cryptography::DSA::VerifySignature"
linktitle: "VerifySignature"
second_title: "Aspose.Page для C++"
description: "Метод System::Security::Cryptography::DSA::VerifySignature. Проверяет подпись DSA для указанных данных в C++."
type: docs
weight: 800
url: /ru/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


Проверить подпись [DSA](../) для указанных данных.

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) подписаны с помощью **rgb_signature**. |
| rgb_signature | ByteArrayPtr | Подпись [DSA](../). |

### ReturnValue

true - если **rgb_signature** совпадает с подписью [DSA](../), вычисленной на **rgb_hash**, иначе - false.

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
