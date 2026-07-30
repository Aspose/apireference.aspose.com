---
title: "System::Security::Cryptography::RSA::SignHash 方法"
linktitle: "SignHash"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSA::SignHash 方法。计算指定哈希值的签名，在 C++ 中。"
type: docs
weight: 1100
url: /zh/cpp/system.security.cryptography/rsa/signhash/
---
## RSA::SignHash method


为指定的哈希值计算签名。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 哈希 | ByteArrayPtr | 哈希值。 |
| hash_algorithm | HashAlgorithmName | 哈希算法。 |
| padding | SharedPtr\<RSASignaturePadding\> | 填充模式。返回指定哈希的 [RSA](../) 签名。 |

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
