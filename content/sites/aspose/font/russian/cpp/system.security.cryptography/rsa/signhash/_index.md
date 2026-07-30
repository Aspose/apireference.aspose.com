---
title: "Метод System::Security::Cryptography::RSA::SignHash"
linktitle: "SignHash"
second_title: "Aspose.Font для C++"
description: "Метод System::Security::Cryptography::RSA::SignHash. Вычисляет подпись для указанного хеш‑значения в C++."
type: docs
weight: 1100
url: /ru/cpp/system.security.cryptography/rsa/signhash/
---
## RSA::SignHash method


Вычисляет подпись для указанного хеш‑значения.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| hash | ByteArrayPtr | Хеш‑значение. |
| hash_algorithm | HashAlgorithmName | Алгоритм хеширования. |
| padding | SharedPtr\<RSASignaturePadding\> | Режим заполнения. Возвращает подпись [RSA](../) для указанного хеша. |

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
