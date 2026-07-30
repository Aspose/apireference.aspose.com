---
title: "System::Security::Cryptography::RSA::VerifyData 方法"
linktitle: "VerifyData"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSA::VerifyData 方法。验证指定数据的签名在 C++ 中是否有效。"
type: docs
weight: 1300
url: /zh/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


验证指定数据的签名是否有效。

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\& | 已签名的数据。 |
| 签名 | const ByteArrayPtr\& | 签名数据。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。 |
| padding | const SharedPtr\<RSASignaturePadding\>\& | 填充模式。如果签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


验证指定数据的签名是否有效。

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 数据 | const ByteArrayPtr\& | 已签名的数据。 |
| offset | int32_t | 在 **data** 中的偏移。 |
| count | int32_t | 要进行哈希的字节数。 |
| 签名 | const ByteArrayPtr\& | 签名数据。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。 |
| padding | const SharedPtr\<RSASignaturePadding\>\& | 填充模式。如果签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


验证指定二进制流的签名是否有效。

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const StreamPtr\& | 已签名的数据。 |
| 签名 | const ByteArrayPtr\& | 签名数据。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。 |
| padding | const SharedPtr\<RSASignaturePadding\>\& | 填充模式。如果签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
