---
title: "System::Security::Cryptography::DSACryptoServiceProvider::SignHash 方法"
linktitle: "SignHash"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::SignHash 方法。计算在 C++ 中指定输入值的签名。"
type: docs
weight: 1600
url: /zh/cpp/system.security.cryptography/dsacryptoserviceprovider/signhash/
---
## DSACryptoServiceProvider::SignHash method


计算指定输入值的签名。

```cpp
ByteArrayPtr System::Security::Cryptography::DSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | 待签名数据的哈希值。 |
| str | const String\& | 用于创建哈希的哈希算法标识符。 |

### ReturnValue

[DSA](../../dsa/) signature for specified data.

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
