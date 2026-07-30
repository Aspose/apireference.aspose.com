---
title: "System::Security::Cryptography::HashAlgorithm::ComputeHash 方法"
linktitle: "ComputeHash"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::HashAlgorithm::ComputeHash 方法。对缓冲区进行哈希计算（C++）。"
type: docs
weight: 200
url: /zh/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


对缓冲区进行哈希。

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | 源缓冲区。 |

### ReturnValue

计算得到的哈希值。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


对缓冲区切片进行哈希。

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | 源缓冲区。 |
| offset | int | 源缓冲区中的偏移量。 |
| count | int | 要从源缓冲区使用的字节数。 |

### ReturnValue

计算得到的哈希值。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


读取流直至结束并计算读取数据的哈希。

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | 用于读取数据的流。 |

### ReturnValue

整个流数据的计算哈希值。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
