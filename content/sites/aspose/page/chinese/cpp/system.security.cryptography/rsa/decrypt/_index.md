---
title: "System::Security::Cryptography::RSA::Decrypt 方法"
linktitle: "Decrypt"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Cryptography::RSA::Decrypt 方法。 在 C++ 中使用指定的填充模式解密输入数据。"
type: docs
weight: 100
url: /zh/cpp/system.security.cryptography/rsa/decrypt/
---
## RSA::Decrypt method


使用指定的填充模式解密输入数据。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| data | ByteArrayPtr | 要解密的 [Byte](../../../system/byte/) 数组。 |
| 填充 | SharedPtr\<RSAEncryptionPadding\> | 填充模式。 |

### ReturnValue

解密后的数据以字节数组格式。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
