---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter クラス"
linktitle: "AsymmetricSignatureFormatter"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter クラス。非対称署名フォーマッタの基底クラス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 400
url: /ja/cpp/system.security.cryptography/asymmetricsignatureformatter/
---
## AsymmetricSignatureFormatter class


非対称署名フォーマッタの基底クラス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class AsymmetricSignatureFormatter : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) | RTTI 情報。 |
| virtual [CreateSignature](./createsignature/)(System::SharedPtr\<HashAlgorithm\>) | 指定されたハッシュ値の署名を作成します。 |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | 使用するハッシュアルゴリズムを設定します。 |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | 署名を計算する際に使用する非対称アルゴリズムを設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
