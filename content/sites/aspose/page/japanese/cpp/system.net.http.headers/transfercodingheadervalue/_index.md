---
title: "System::Net::Http::Headers::TransferCodingHeaderValue クラス"
linktitle: "TransferCodingHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::TransferCodingHeaderValue クラス。''Accept-Encoding'' ヘッダーの値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として渡すようにしてください。"
type: docs
weight: 2400
url: /ja/cpp/system.net.http.headers/transfercodingheadervalue/
---
## TransferCodingHeaderValue class


''Accept-Encoding'' ヘッダーの値を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class TransferCodingHeaderValue : public virtual System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Parameters](./get_parameters/)() | パラメーターを返します。 |
| [get_Value](./get_value/)() | RTTI 情報。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [GetTransferCodingLength](./gettransfercodinglength/)(String, int32_t, const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\&, System::SharedPtr\<TransferCodingHeaderValue\>\&) | 指定されたインデックスから渡された文字列を [TransferCodingHeaderValue](./) クラスのインスタンスに変換します。 |
| static [Parse](./parse/)(String) | 渡された文字列を [TransferCodingHeaderValue](./) クラスのインスタンスに変換します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)() | 新しいインスタンスを構築します。 |
| [TransferCodingHeaderValue](./transfercodingheadervalue/)(String) | 新しいインスタンスを構築します。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<TransferCodingHeaderValue\>\&) | 渡された文字列を [TransferCodingHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
