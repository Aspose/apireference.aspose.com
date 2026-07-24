---
title: "System::Security::Cryptography::RSA::VerifyHash метод"
linktitle: "VerifyHash"
second_title: "Aspose.Page для C++"
description: "System::Security::Cryptography::RSA::VerifyHash метод. Проверяет, что подпись указанного хеша действительна в C++."
type: docs
weight: 1400
url: /ru/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


Проверяет, что подпись указанного хеша действительна.

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| хеш | ByteArrayPtr | Хеш-значение подписанных данных. |
| подпись | ByteArrayPtr | Данные подписи. |
| hash_algorithm | const HashAlgorithmName\& | Алгоритм хеширования. |
| padding | SharedPtr\<RSASignaturePadding\> | Режим заполнения. возвращает true, если подпись действительна, иначе - false. |

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
