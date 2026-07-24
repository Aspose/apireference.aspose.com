---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash 方法"
linktitle: "VerifyHash"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash 方法。检查 C++ 中的数据签名。"
type: docs
weight: 1800
url: /zh/cpp/system.security.cryptography/dsacryptoserviceprovider/verifyhash/
---
## DSACryptoServiceProvider::VerifyHash method


检查数据签名。

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\\& | 对接收数据计算的哈希。 |
| str | const String\& | 使用的哈希算法名称。 |
| rgb_signature | const ByteArrayPtr\\& | 接收到的签名。 |

### ReturnValue

如果签名有效则为 True，否则为 false。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
