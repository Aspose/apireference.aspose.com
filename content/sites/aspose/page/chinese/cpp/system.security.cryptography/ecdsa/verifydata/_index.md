---
title: "System::Security::Cryptography::ECDsa::VerifyData 方法"
linktitle: "VerifyData"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Cryptography::ECDsa::VerifyData 方法。验证在 C++ 中指定数据的签名是否有效。"
type: docs
weight: 900
url: /zh/cpp/system.security.cryptography/ecdsa/verifydata/
---
## ECDsa::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


验证指定数据的签名是否有效。

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\\& | 已签名数据。 |
| 签名 | const ByteArrayPtr\\& | 签名数据。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。若签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


验证指定数据的签名是否有效。

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\\& | 已签名数据。 |
| offset | int32_t | 在 **data** 中的偏移量。 |
| count | int32_t | 要进行哈希的字节数。 |
| 签名 | const ByteArrayPtr\\& | 签名数据。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。若签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## ECDsa::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


验证指定二进制流的签名是否有效。

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | const StreamPtr\& | 已签名数据。 |
| 签名 | const ByteArrayPtr\\& | 签名数据。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。若签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
