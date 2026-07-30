---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt 方法"
linktitle: "Decrypt"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Decrypt 方法。使用指定的填充模式在 C++ 中解密输入数据。"
type: docs
weight: 200
url: /zh/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


使用指定的填充模式解密输入数据。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
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
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


解密消息。未实现。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) 用于解密。 |
| use_oaep | bool | True 表示使用 OAEP 填充，false 表示使用 PKCS#1 v1.5 填充。 |

### ReturnValue

已解密的数据数组。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
