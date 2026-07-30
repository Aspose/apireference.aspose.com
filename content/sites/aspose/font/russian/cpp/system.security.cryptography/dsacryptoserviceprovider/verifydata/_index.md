---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData метод"
linktitle: "VerifyData"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData метод. Проверяет подпись данных в C++."
type: docs
weight: 1700
url: /ru/cpp/system.security.cryptography/dsacryptoserviceprovider/verifydata/
---
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


Проверяет подпись данных.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const ByteArrayPtr &signature)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) для проверки подписи. |
| signature | const ByteArrayPtr\& | Подпись в полученном виде. |

### ReturnValue

True, если подпись действительна, false — в противном случае.

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Проверяет, что подпись указанных данных действительна.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| данные | const ByteArrayPtr\& | Подписанные данные. |
| signature | const ByteArrayPtr\& | Данные подписи. |
| hash_algorithm | const HashAlgorithmName\& | Алгоритм хеширования. возвращает true, если подпись действительна, иначе - false. |

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Проверяет, что подпись указанных данных действительна.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| данные | const ByteArrayPtr\& | Подписанные данные. |
| смещение | int32_t | Смещение в **data**. |
| count | int32_t | Количество байтов для хеширования. |
| signature | const ByteArrayPtr\& | Данные подписи. |
| hash_algorithm | const HashAlgorithmName\& | Алгоритм хеширования. возвращает true, если подпись действительна, иначе - false. |

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Проверяет, что подпись указанного бинарного потока действительна.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const StreamPtr\& | Подписанные данные. |
| signature | const ByteArrayPtr\& | Данные подписи. |
| hash_algorithm | const HashAlgorithmName\& | Алгоритм хеширования. возвращает true, если подпись действительна, иначе - false. |

## См. также

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
