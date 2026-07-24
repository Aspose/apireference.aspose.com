---
title: "System::Net::Http::Headers::WarningHeaderValue クラス"
linktitle: "WarningHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::WarningHeaderValue クラス。''Warning'' ヘッダーの値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 2700
url: /ja/cpp/system.net.http.headers/warningheadervalue/
---
## WarningHeaderValue class


'Warning' ヘッダーの値を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class WarningHeaderValue : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Agent](./get_agent/)() | 警告に付随するホストを返します。 |
| [get_Code](./get_code/)() | RTTI 情報。 |
| [get_Date](./get_date/)() | 警告の日時を返します。 |
| [get_Text](./get_text/)() | 警告テキストを返します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [GetWarningLength](./getwarninglength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 指定されたインデックスから渡された文字列を [WarningHeaderValue](./) クラスのインスタンスに変換します。 |
| static [Parse](./parse/)(String) | 渡された文字列を [WarningHeaderValue](./) クラスのインスタンスに変換します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<WarningHeaderValue\>\&) | 渡された文字列を [WarningHeaderValue](./) クラスのインスタンスに変換しようとします。 |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String) | 新しいインスタンスを構築します。 |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String, DateTimeOffset) | 新しいインスタンスを構築します。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
