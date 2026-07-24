---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature method"
linktitle: "CreateSignature"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature method. C++のRTTI情報。"
type: docs
weight: 100
url: /ja/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


RTTI 情報。

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | ハッシュ計算に使用する[Data](../../../system.data/)。 |

### ReturnValue

バイト配列形式の計算済み署名。
## 備考


指定されたデータの署名を作成します。
## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


指定されたハッシュ値の署名を作成します。

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ハッシュ | System::SharedPtr\<HashAlgorithm\> | 署名作成時に使用するハッシュアルゴリズム。 |

### ReturnValue

バイト配列形式の計算済み署名。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
