---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter クラス"
linktitle: "AsymmetricSignatureDeformatter"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter クラス。非対称署名デフォーマッタの基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 300
url: /ja/cpp/system.security.cryptography/asymmetricsignaturedeformatter/
---
## AsymmetricSignatureDeformatter class


非対称署名デフォーマッタの基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class AsymmetricSignatureDeformatter : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | RTTI 情報。 |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | アルゴリズムで使用するキーを設定します。 |
| virtual [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | データ上の署名を検証します。 |
| virtual [VerifySignature](./verifysignature/)(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) | データ上の署名を検証します。未実装です。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
