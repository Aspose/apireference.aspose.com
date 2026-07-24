---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature 方法"
linktitle: "VerifySignature"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature 方法。验证在 C++ 中对指定数据的 DSA 签名。"
type: docs
weight: 1900
url: /zh/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


验证针对指定数据的 [DSA](../../dsa/) 签名。

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) 使用 **rgb_signature** 签名。 |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) 签名。 |

### ReturnValue

true - 如果 **rgb_signature** 与基于 **rgb_hash** 计算的 [DSA](../../dsa/) 签名匹配，否则 - false。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
