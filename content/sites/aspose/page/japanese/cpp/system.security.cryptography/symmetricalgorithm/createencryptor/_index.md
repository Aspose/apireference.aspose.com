---
title: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor メソッド"
linktitle: "CreateEncryptor"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor メソッド。C++ でアルゴリズムオブジェクトに関連付けられたパラメータで暗号化器を作成します。"
type: docs
weight: 200
url: /ja/cpp/system.security.cryptography/symmetricalgorithm/createencryptor/
---
## SymmetricAlgorithm::CreateEncryptor() method


アルゴリズムオブジェクトに関連付けられたパラメータで暗号化器を作成します。

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```


### ReturnValue

新しく作成された暗号化オブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


明示的なパラメータで暗号化器を作成します。

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | 使用するキー。 |
| rgbIV | System::ArrayPtr\<uint8_t\> | 使用する初期ベクトル。 |

### ReturnValue

新しく作成された暗号化オブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
