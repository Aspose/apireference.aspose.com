---
title: "System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor 方法"
linktitle: "CreateDecryptor"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor 方法。使用与算法对象关联的参数在 C++ 中创建解密器。"
type: docs
weight: 100
url: /zh/cpp/system.security.cryptography/symmetricalgorithm/createdecryptor/
---
## SymmetricAlgorithm::CreateDecryptor() method


使用与算法对象关联的参数创建解密器。

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```


### ReturnValue

新创建的解密器对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## SymmetricAlgorithm::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


使用显式参数创建解密器。

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | 要使用的密钥。 |
| rgbIV | System::ArrayPtr\<uint8_t\> | 要使用的初始值。 |

### ReturnValue

新创建的解密器对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
