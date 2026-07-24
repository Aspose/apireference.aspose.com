---
title: "System::Net::Http::Headers::RangeHeaderValue クラス"
linktitle: "RangeHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::RangeHeaderValue クラス。''Range'' ヘッダーの値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 2000
url: /ja/cpp/system.net.http.headers/rangeheadervalue/
---
## RangeHeaderValue class


'Range' ヘッダーの値を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class RangeHeaderValue : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Ranges](./get_ranges/)() | 範囲のコレクションを返します。 |
| [get_Unit](./get_unit/)() | RTTI 情報。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [GetRangeLength](./getrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 指定されたインデックスから渡された文字列を [RangeHeaderValue](./) クラスのインスタンスに変換します。 |
| static [Parse](./parse/)(String) | 渡された文字列を [RangeHeaderValue](./) クラスのインスタンスに変換します。 |
| [RangeHeaderValue](./rangeheadervalue/)() | 新しいインスタンスを構築します。 |
| [RangeHeaderValue](./rangeheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | 新しいインスタンスを構築します。 |
| [set_Unit](./set_unit/)(String) | 単位を設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeHeaderValue\>\&) | 渡された文字列を [RangeHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
