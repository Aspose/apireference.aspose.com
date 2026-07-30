---
title: "System::Security::Cryptography::DSA::VerifySignature 方法"
linktitle: "VerifySignature"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::DSA::VerifySignature 方法。 在 C++ 中验证指定数据的 DSA 签名。"
type: docs
weight: 800
url: /zh/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


验证指定数据的 [DSA](../) 签名。

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) 使用 **rgb_signature** 签名。 |
| rgb_signature | ByteArrayPtr | [DSA](../) 签名。 |

### ReturnValue

true - 如果 **rgb_signature** 与在 **rgb_hash** 上计算的 [DSA](../) 签名匹配，否则为 false。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
