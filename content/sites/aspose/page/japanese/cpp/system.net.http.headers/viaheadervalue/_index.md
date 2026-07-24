---
title: "System::Net::Http::Headers::ViaHeaderValue クラス"
linktitle: "ViaHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::ViaHeaderValue クラス。''Via'' ヘッダーの値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2600
url: /ja/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


‘Via’ ヘッダーの値を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class ViaHeaderValue : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Comment](./get_comment/)() | ‘Via’ ヘッダー値からコメントを返します。 |
| [get_ProtocolName](./get_protocolname/)() | RTTI 情報。 |
| [get_ProtocolVersion](./get_protocolversion/)() | ‘Via’ ヘッダー値からプロトコル バージョンを返します。 |
| [get_ReceivedBy](./get_receivedby/)() | リクエストまたはレスポンスが受信されたホストとポートを返します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 指定されたインデックスから渡された文字列を [ViaHeaderValue](./) クラスのインスタンスに変換します。 |
| static [Parse](./parse/)(String) | 渡された文字列を [ViaHeaderValue](./) クラスのインスタンスに変換します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | 渡された文字列を [ViaHeaderValue](./) クラスのインスタンスに変換しようとします。 |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | 新しいインスタンスを構築します。 |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | 新しいインスタンスを構築します。 |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | 新しいインスタンスを構築します。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
