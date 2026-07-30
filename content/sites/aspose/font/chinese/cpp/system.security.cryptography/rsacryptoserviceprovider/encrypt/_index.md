---
title: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt 方法"
linktitle: "Encrypt"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::Encrypt 方法。使用指定的填充模式在 C++ 中加密输入数据。"
type: docs
weight: 400
url: /zh/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


使用指定的填充模式加密输入数据。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
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
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


加密消息。未实现。

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) 用于加密。 |
| use_oaep | bool | True 表示使用 OAEP 填充，false 表示使用 PKCS#1 v1.5 填充。 |

### ReturnValue

已加密的数据数组。

## 另见

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
