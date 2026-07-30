---
title: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor 方法"
linktitle: "CreateEncryptor"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor 方法。创建使用与算法对象关联的参数的加密器（在 C++ 中）。"
type: docs
weight: 200
url: /zh/cpp/system.security.cryptography/symmetricalgorithm/createencryptor/
---
## SymmetricAlgorithm::CreateEncryptor() method


使用与算法对象关联的参数创建加密器。

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```


### ReturnValue

新创建的加密器对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


使用显式参数创建加密器。

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | 要使用的密钥。 |
| rgbIV | System::ArrayPtr\<uint8_t\> | 要使用的初始值。 |

### ReturnValue

新创建的加密器对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
