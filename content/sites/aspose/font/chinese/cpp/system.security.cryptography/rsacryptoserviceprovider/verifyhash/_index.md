---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash 方法"
linktitle: "VerifyHash"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash 方法。验证指定哈希的签名在 C++ 中是否有效。"
type: docs
weight: 1900
url: /zh/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


验证指定哈希的签名是否有效。

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 哈希 | ByteArrayPtr | 已签名数据的哈希值。 |
| 签名 | ByteArrayPtr | 签名数据。 |
| hash_algorithm | const HashAlgorithmName\& | 哈希算法。 |
| padding | SharedPtr\<RSASignaturePadding\> | 填充模式。如果签名有效返回 true，否则返回 false。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


检查数据签名。

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | 为接收的数据计算的哈希。 |
| str | const String\& | 使用的哈希算法名称。 |
| rgb_signature | const ByteArrayPtr\& | 接收到的签名。 |

### ReturnValue

如果签名有效则为 True，否则为 false。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
