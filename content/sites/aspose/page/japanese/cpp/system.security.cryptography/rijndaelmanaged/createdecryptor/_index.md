---
title: "System::Security::Cryptography::RijndaelManaged::CreateDecryptor メソッド"
linktitle: "CreateDecryptor"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RijndaelManaged::CreateDecryptor メソッド。アルゴリズムオブジェクトで定義されたパラメーターを使用して復号化オブジェクトを作成します（C++）。"
type: docs
weight: 100
url: /ja/cpp/system.security.cryptography/rijndaelmanaged/createdecryptor/
---
## RijndaelManaged::CreateDecryptor() method


アルゴリズムオブジェクトで定義されたパラメータで復号器オブジェクトを作成します。

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RijndaelManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


明示的なパラメータで復号器オブジェクトを作成します。

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | バイト配列形式の暗号化キー。 |
| rgbIV | System::ArrayPtr\<uint8_t\> | バイト配列形式の初期ベクトル。 |

### ReturnValue

新しく作成された復号化オブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
