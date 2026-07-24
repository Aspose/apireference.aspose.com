---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter クラス"
linktitle: "RSAPKCS1SignatureDeformatter"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter クラス。RSA PKCS #1 v1.5 署名を検証するクラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上でインスタンスを作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 3700
url: /ja/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/
---
## RSAPKCS1SignatureDeformatter class


[RSA](../rsa/) PKCS #1 v1.5 署名を検証するクラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上でインスタンスを作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class RSAPKCS1SignatureDeformatter : public System::Security::Cryptography::AsymmetricSignatureDeformatter
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)() | RTTI 情報。 |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | コンストラクタ。 |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | 使用するハッシュアルゴリズムを設定します。 |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | キー値を設定します。未実装です。 |
| [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | データハッシュの署名を検証します。 |
## 参照

* Class [AsymmetricSignatureDeformatter](../asymmetricsignaturedeformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
