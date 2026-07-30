---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature 方法"
linktitle: "VerifySignature"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature 方法。在 C++ 中验证指定数据的 DSA 签名。"
type: docs
weight: 1900
url: /zh/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


验证指定数据的 [DSA](../../dsa/) 签名。

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) 使用 **rgb_signature** 签名。 |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) 签名。 |

### ReturnValue

true - 如果 **rgb_signature** 与在 **rgb_hash** 上计算的 [DSA](../../dsa/) 签名匹配，则为 true，否则为 false。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
