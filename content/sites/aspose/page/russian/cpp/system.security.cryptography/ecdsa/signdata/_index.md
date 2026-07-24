---
title: "Метод System::Security::Cryptography::ECDsa::SignData"
linktitle: "SignData"
second_title: "Aspose.Page для C++"
description: "Метод System::Security::Cryptography::ECDsa::SignData. Вычисляет хеш-значение указанного массива данных, используя указанный алгоритм хеширования, и подписывает результат в C++."
type: docs
weight: 700
url: /ru/cpp/system.security.cryptography/ecdsa/signdata/
---
## ECDsa::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Вычисляет хеш‑значение указанного массива данных с использованием указанного хеш‑алгоритма и подписывает результат.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| данные | const ByteArrayPtr\& | Массив входных данных. |
| hash_algorithm | const HashAlgorithmName\& | Алгоритм хеширования. Возвращает подпись ECDSA для входных данных. |

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Вычисляет хеш‑значение указанного массива данных с использованием указанного хеш‑алгоритма и подписывает результат.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| данные | const ByteArrayPtr\& | Массив входных данных. |
| смещение | int32_t | Смещение в **data**. |
| count | int32_t | Количество байтов, используемых в качестве входных данных. |
| hash_algorithm | const HashAlgorithmName\& | Алгоритм хеширования. Возвращает подпись ECDSA для входных данных. |

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Вычисляет хеш‑значение указанного бинарного потока с использованием указанного хеш‑алгоритма и подписывает результат.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const StreamPtr\& | Бинарный поток. |
| hash_algorithm | const HashAlgorithmName\& | Алгоритм хеширования. Возвращает подпись ECDSA для входных данных. |

## См. также

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
