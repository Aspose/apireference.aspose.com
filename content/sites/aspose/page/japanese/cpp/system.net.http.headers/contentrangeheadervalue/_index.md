---
title: "System::Net::Http::Headers::ContentRangeHeaderValue クラス"
linktitle: "ContentRangeHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::ContentRangeHeaderValue クラス。 ''Content-Range'' ヘッダーの値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、関数への引数としてこのポインタを使用してください。"
type: docs
weight: 400
url: /ja/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


'Content-Range' ヘッダーの値を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数への引数としてこのポインタを使用してください。

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | 新しいインスタンスを構築します。 |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | 新しいインスタンスを構築します。 |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | 新しいインスタンスを構築します。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_From](./get_from/)() | データ送信を開始しなければならない位置を取得します。 |
| [get_HasLength](./get_haslength/)() const | 現在のヘッダーで長さが指定されているかどうかを示す値を取得します。 |
| [get_HasRange](./get_hasrange/)() const | 現在のヘッダーで範囲が指定されているかどうかを示す値を取得します。 |
| [get_Length](./get_length/)() | エンティティ本体の長さを取得します。 |
| [get_To](./get_to/)() | データ送信を停止しなければならない位置を取得します。 |
| [get_Unit](./get_unit/)() | RTTI 情報。 |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 指定された位置から渡された文字列を [ContentRangeHeaderValue](./) クラスのインスタンスに変換します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [Parse](./parse/)(String) | 渡された文字列を [ContentRangeHeaderValue](./) クラスのインスタンスに変換します。 |
| [set_Unit](./set_unit/)(String) | 範囲で使用される単位を設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | 渡された文字列を [ContentRangeHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
