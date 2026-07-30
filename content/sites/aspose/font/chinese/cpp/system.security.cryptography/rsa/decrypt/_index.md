---
title: "System::Security::Cryptography::RSA::Decrypt 方法"
linktitle: "Decrypt"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSA::Decrypt 方法. 使用指定的填充模式在 C++ 中解密输入数据。"
type: docs
weight: 100
url: /zh/cpp/system.security.cryptography/rsa/decrypt/
---
## RSA::Decrypt method


使用指定的填充模式解密输入数据。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) 用于解密的数组。 |
| padding | SharedPtr\<RSAEncryptionPadding\> | 填充模式。 |

### ReturnValue

解密后的数据以字节数组格式。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
