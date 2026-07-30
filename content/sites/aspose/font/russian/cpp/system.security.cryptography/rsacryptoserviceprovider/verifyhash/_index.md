---
title: "Метод System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash"
linktitle: "VerifyHash"
second_title: "Aspose.Font для C++"
description: "Метод System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash. Проверяет, что подпись указанного хэша действительна, в C++."
type: docs
weight: 1900
url: /ru/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


Проверяет, что подпись указанного хеша действительна.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| hash | ByteArrayPtr | Хеш‑значение подписанных данных. |
| signature | ByteArrayPtr | Данные подписи. |
| hash_algorithm | const HashAlgorithmName\& | Алгоритм хеширования. |
| padding | SharedPtr\<RSASignaturePadding\> | Режим заполнения. возвращает true, если подпись действительна, иначе — false. |

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


Проверяет подпись данных.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Хеш, вычисленный для полученных данных. |
| str | const String\& | Имя используемого алгоритма хеширования. |
| rgb_signature | const ByteArrayPtr\& | Подпись в полученном виде. |

### ReturnValue

True, если подпись действительна, false — в противном случае.

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
