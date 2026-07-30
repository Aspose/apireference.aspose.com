---
title: "System::Security::Cryptography::RSA::VerifyHash 方法"
linktitle: "VerifyHash"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSA::VerifyHash 方法。验证指定哈希的签名在 C++ 中是否有效。"
type: docs
weight: 1400
url: /zh/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


验证指定哈希的签名是否有效。

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
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
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
