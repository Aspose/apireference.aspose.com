---
title: "System::Security::Cryptography::RijndaelManaged::CreateEncryptor 方法"
linktitle: "CreateEncryptor"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::RijndaelManaged::CreateEncryptor 方法。使用算法对象定义的参数在 C++ 中创建加密器对象。"
type: docs
weight: 200
url: /zh/cpp/system.security.cryptography/rijndaelmanaged/createencryptor/
---
## RijndaelManaged::CreateEncryptor() method


使用算法对象定义的参数创建加密器对象。

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RijndaelManaged::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


使用显式参数创建加密器对象。

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | 以字节数组形式的加密密钥。 |
| rgbIV | System::ArrayPtr\<uint8_t\> | 以字节数组形式的初始值。 |

### ReturnValue

新创建的加密器对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
