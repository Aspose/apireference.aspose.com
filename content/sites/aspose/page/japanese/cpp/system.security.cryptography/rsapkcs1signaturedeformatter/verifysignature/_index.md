---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature メソッド"
linktitle: "VerifySignature"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature メソッド。C++ でデータハッシュの署名を検証します。"
type: docs
weight: 400
url: /ja/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


データハッシュの署名を検証します。

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | データのハッシュが計算されました。 |
| rgbSignature | System::ArrayPtr\<uint8_t\> | データの署名が受信されました。 |

### ReturnValue

署名が有効な場合は true、そうでない場合は false。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
