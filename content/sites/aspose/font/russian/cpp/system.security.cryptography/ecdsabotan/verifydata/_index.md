---
title: "System::Security::Cryptography::ECDsaBotan::VerifyData метод"
linktitle: "VerifyData"
second_title: "Aspose.Font для C++"
description: "System::Security::Cryptography::ECDsaBotan::VerifyData метод. Проверяет, что подпись указанных данных действительна в C++."
type: docs
weight: 1400
url: /ru/cpp/system.security.cryptography/ecdsabotan/verifydata/
---
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


Проверяет, что подпись указанных данных действительна.

```cpp
bool System::Security::Cryptography::ECDsaBotan::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| данные | const ByteArrayPtr\& | Подписанные данные. |
| signature | const ByteArrayPtr\& | Данные подписи. Возвращает true, если подпись действительна, иначе - false. |

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Проверяет, что подпись указанных данных действительна.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| данные | const ByteArrayPtr\& | Подписанные данные. |
| signature | const ByteArrayPtr\& | Данные подписи. |
| hash_algorithm | const HashAlgorithmName\& | Алгоритм хеширования. возвращает true, если подпись действительна, иначе - false. |

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) method


Проверяет, что подпись указанных данных действительна.

```cpp
bool System::Security::Cryptography::ECDsaBotan::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| данные | const ByteArrayPtr\& | Подписанные данные. |
| смещение | int32_t | Смещение в **data**. |
| count | int32_t | Количество байтов для хеширования. |
| signature | const ByteArrayPtr\& | Данные подписи. Возвращает true, если подпись действительна, иначе - false. |

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Проверяет, что подпись указанных данных действительна.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
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
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::VerifyData(const StreamPtr\&, const ByteArrayPtr\&) method


Проверяет, что подпись указанного бинарного потока действительна.

```cpp
bool System::Security::Cryptography::ECDsaBotan::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const StreamPtr\& | Подписанные данные. |
| signature | const ByteArrayPtr\& | Данные подписи. Возвращает true, если подпись действительна, иначе - false. |

## См. также

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Проверяет, что подпись указанного бинарного потока действительна.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const StreamPtr\& | Подписанные данные. |
| signature | const ByteArrayPtr\& | Данные подписи. |
| hash_algorithm | const HashAlgorithmName\& | Алгоритм хеширования. возвращает true, если подпись действительна, иначе - false. |

## См. также

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
