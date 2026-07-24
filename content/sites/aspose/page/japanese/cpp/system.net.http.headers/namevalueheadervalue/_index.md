---
title: "System::Net::Http::Headers::NameValueHeaderValue クラス"
linktitle: "NameValueHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::NameValueHeaderValue クラス。ヘッダーで使用するキー/バリューのペアを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際にはそのポインタを使用してください。"
type: docs
weight: 1400
url: /ja/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


ヘッダーで使用するキー/バリューのペアを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数として渡す際にはそのポインタを使用してください。

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | 指定された名前でコレクション内の NameValueHeaderValue クラスのインスタンスを検索します。 |
| [get_Name](./get_name/)() | 現在のインスタンスの名前を返します。 |
| [get_Value](./get_value/)() | 現在のインスタンスの値を取得します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | コレクション内のすべての項目のハッシュコードを返します。 |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | 指定されたインデックスから渡された文字列を [NameValueHeaderValue](./) クラスのインスタンスに変換します。 |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | 指定されたインデックスから渡された文字列を [NameValueHeaderValue](./) クラスのインスタンスに変換します。 |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | 指定されたインデックスから渡された文字列を NameValueHeaderValue クラスのインスタンスのコレクションに変換し、解析されたサブ文字列の長さを返します。 |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | 指定されたインデックスからの値の長さを返します。 |
| [NameValueHeaderValue](./namevalueheadervalue/)() | 新しいインスタンスを構築します。 |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | 新しいインスタンスを構築します。 |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | 新しいインスタンスを構築します。 |
| static [Parse](./parse/)(String) | 渡された文字列を [NameValueHeaderValue](./) クラスのインスタンスに変換します。 |
| [set_Value](./set_value/)(String) | 現在のインスタンスの値を設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | NameValueHeaderValue クラスのインスタンスのコレクションの文字列表現を返します。 |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | NameValueHeaderValue クラスのインスタンスのコレクションの文字列表現を返します。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | 渡された文字列を [NameValueHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
