---
title: "System::Security::Cryptography::RijndaelManaged::CreateEncryptor メソッド"
linktitle: "CreateEncryptor"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RijndaelManaged::CreateEncryptor メソッド。アルゴリズムオブジェクトで定義されたパラメーターを使用して暗号化オブジェクトを作成します（C++）。"
type: docs
weight: 200
url: /ja/cpp/system.security.cryptography/rijndaelmanaged/createencryptor/
---
## RijndaelManaged::CreateEncryptor() method


アルゴリズムオブジェクトで定義されたパラメータで暗号化オブジェクトを作成します。

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RijndaelManaged::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


明示的なパラメータで暗号化オブジェクトを作成します。

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | バイト配列形式の暗号化キー。 |
| rgbIV | System::ArrayPtr\<uint8_t\> | バイト配列形式の初期ベクトル。 |

### ReturnValue

新しく作成された暗号化オブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
