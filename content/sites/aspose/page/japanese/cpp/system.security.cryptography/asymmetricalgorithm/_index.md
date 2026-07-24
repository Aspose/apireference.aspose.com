---
title: "System::Security::Cryptography::AsymmetricAlgorithm クラス"
linktitle: "AsymmetricAlgorithm"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::AsymmetricAlgorithm クラス。非対称暗号アルゴリズムの抽象基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうすると実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 200
url: /ja/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


非対称暗号アルゴリズムの抽象基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうすると実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数に引数として渡す際にそのポインタを使用してください。

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clear](./clear/)() | すべてのリソースを解放します。 |
| static [Create](./create/)() | デフォルトのアルゴリズムを作成します。未実装です。 |
| static [Create](./create/)(const String\&) | 名前でアルゴリズムを作成します。未実装です。 |
| [Dispose](./dispose/)() override | 現在のオブジェクトが所有するリソースを解放します。 |
| virtual [FromXmlString](./fromxmlstring/)(String) | XML 文字列からアルゴリズム パラメーターを読み取ります。 |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | 使用する鍵交換アルゴリズムを取得します。 |
| virtual [get_KeySize](./get_keysize/)() | RTTI 情報。 |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | 許可されている鍵サイズの配列を取得します。 |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | 使用する署名アルゴリズムを取得します。 |
| virtual [set_KeySize](./set_keysize/)(int32_t) | 鍵サイズを設定します。 |
| virtual [ToXmlString](./toxmlstring/)(bool) | アルゴリズム パラメーターを XML 文字列に書き込みます。 |
## 参照

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
