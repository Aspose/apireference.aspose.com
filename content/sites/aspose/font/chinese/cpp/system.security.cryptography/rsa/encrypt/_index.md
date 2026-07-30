---
title: "System::Security::Cryptography::RSA::Encrypt 方法"
linktitle: "Encrypt"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSA::Encrypt 方法. 使用指定的填充模式在 C++ 中加密输入数据。"
type: docs
weight: 300
url: /zh/cpp/system.security.cryptography/rsa/encrypt/
---
## RSA::Encrypt method


使用指定的填充模式加密输入数据。

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) 用于加密的字节数组。 |
| padding | SharedPtr\<RSAEncryptionPadding\> | 填充模式。 |

### ReturnValue

以字节数组格式的加密数据。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
