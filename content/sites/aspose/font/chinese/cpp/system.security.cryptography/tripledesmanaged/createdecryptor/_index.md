---
title: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor 方法"
linktitle: "CreateDecryptor"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor 方法。创建解密器对象，使用算法对象中定义的参数（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.security.cryptography/tripledesmanaged/createdecryptor/
---
## TripleDESManaged::CreateDecryptor() method


使用算法对象定义的参数创建解密器对象。

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## TripleDESManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


使用显式参数创建解密器对象。

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::TripleDESManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | 以字节数组形式的加密密钥。 |
| rgbIV | System::ArrayPtr\<uint8_t\> | 以字节数组形式的初始值。 |

### ReturnValue

新创建的解密器对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
