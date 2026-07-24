---
title: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor メソッド"
linktitle: "CreateDecryptor"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::TripleDESManaged::CreateDecryptor メソッド。C++ のアルゴリズムオブジェクトで定義されたパラメータを使用して復号化オブジェクトを作成します。"
type: docs
weight: 100
url: /ja/cpp/system.security.cryptography/tripledesmanaged/createdecryptor/
---
## TripleDESManaged::CreateDecryptor() method


アルゴリズムオブジェクトで定義されたパラメータで復号器オブジェクトを作成します。

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## TripleDESManaged::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


明示的なパラメータで復号器オブジェクトを作成します。

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::TripleDESManaged::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
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
* Class [TripleDESManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
