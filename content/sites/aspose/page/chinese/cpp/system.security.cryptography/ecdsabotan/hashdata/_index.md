---
title: "System::Security::Cryptography::ECDsaBotan::HashData 方法"
linktitle: "HashData"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Cryptography::ECDsaBotan::HashData 方法。 在 C++ 中使用指定的哈希算法计算指定数据数组的哈希值。"
type: docs
weight: 700
url: /zh/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


使用指定的哈希算法计算指定数据数组的哈希值。

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| data | ByteArrayPtr | [Data](../../../system.data/) 用于哈希。 |
| offset | int32_t | 在 **data** 中的偏移量。 |
| count | int32_t | 要进行哈希的字节数。 |
| hash_algorithm | HashAlgorithmName | 哈希算法。 |

### ReturnValue

已哈希的数据。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


使用指定的哈希算法计算指定二进制流的哈希值。

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | StreamPtr | Bynary 流用于哈希。 |
| hash_algorithm | HashAlgorithmName | 哈希算法。 |

### ReturnValue

已哈希的数据。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
