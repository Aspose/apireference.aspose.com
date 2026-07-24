---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash 方法"
linktitle: "SignHash"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash 方法。计算指定哈希值的签名（在 C++ 中）。"
type: docs
weight: 1700
url: /zh/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


为指定的哈希值计算签名。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 哈希 | ByteArrayPtr | 哈希值。 |
| hash_algorithm | HashAlgorithmName | 哈希算法。 |
| padding | SharedPtr\<RSASignaturePadding\> | 填充模式。返回针对指定哈希的 [RSA](../../rsa/) 签名。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


计算指定输入值的签名。未实现。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\\& | 待签名数据的哈希值。 |
| str | const String\& | 用于创建哈希的哈希算法标识符。 |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
