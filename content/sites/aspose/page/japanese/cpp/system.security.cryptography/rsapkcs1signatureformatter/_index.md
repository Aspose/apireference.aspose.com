---
title: "System::Security::Cryptography::RSAPKCS1SignatureFormatter クラス"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RSAPKCS1SignatureFormatter クラス。RSA PKCS #1 v1.5 署名でデータに署名します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 3800
url: /ja/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


データに [RSA](../rsa/) PKCS #1 v1.5 署名で署名します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | データに署名します。 |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | RTTI 情報。 |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | コンストラクタ。 |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | 使用するハッシュアルゴリズムを設定します。 |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | キー値を設定します。未実装です。 |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | デストラクタ。 |
## 参照

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
