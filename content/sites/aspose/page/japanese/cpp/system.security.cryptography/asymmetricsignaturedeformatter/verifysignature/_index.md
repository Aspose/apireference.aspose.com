---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature メソッド"
linktitle: "VerifySignature"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature メソッド。C++ でデータの署名を検証します。"
type: docs
weight: 300
url: /ja/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


データ上の署名を検証します。

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) が **rgbSignature** で署名されています。 |
| rgbSignature | System::ArrayPtr\<uint8_t\> | データに対して検証される署名。 |

### ReturnValue

署名チェックが成功した場合は true、そうでない場合は false。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


データ上の署名を検証します。未実装です。

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ハッシュ | System::SharedPtr\<HashAlgorithm\> | ハッシュ化に使用するアルゴリズム。 |
| rgbSignature | System::ArrayPtr\<uint8_t\> | データに対して検証される署名。 |

### ReturnValue

署名チェックが成功した場合は true、そうでない場合は false。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
