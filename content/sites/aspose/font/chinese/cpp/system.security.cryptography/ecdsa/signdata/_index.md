---
title: "System::Security::Cryptography::ECDsa::SignData 方法"
linktitle: "SignData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::ECDsa::SignData 方法。使用指定的哈希算法计算指定数据数组的哈希值，并在 C++ 中对结果进行签名。"
type: docs
weight: 700
url: /zh/cpp/system.security.cryptography/ecdsa/signdata/
---
## ECDsa::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


使用指定的哈希算法计算指定数据数组的哈希值，并对结果进行签名。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\& | 输入数据数组。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。返回输入数据的 ECDSA 签名。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


使用指定的哈希算法计算指定数据数组的哈希值，并对结果进行签名。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\& | 输入数据数组。 |
| offset | int32_t | 在 **data** 中的偏移。 |
| count | int32_t | 用作输入数据的字节数。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。返回输入数据的 ECDSA 签名。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


使用指定的哈希算法计算指定二进制流的哈希值，并对结果进行签名。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const StreamPtr\& | 二进制流。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。返回输入数据的 ECDSA 签名。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
