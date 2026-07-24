---
title: "System::Net::Http::Headers::NameValueWithParametersHeaderValue クラス"
linktitle: "NameValueWithParametersHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::NameValueWithParametersHeaderValue クラス。ヘッダーで使用するパラメータ付きのキー/バリュー ペアを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 1500
url: /ja/cpp/system.net.http.headers/namevaluewithparametersheadervalue/
---
## NameValueWithParametersHeaderValue class


ヘッダーで使用するパラメータ付きのキー/バリュー ペアを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
class NameValueWithParametersHeaderValue : public System::Net::Http::Headers::NameValueHeaderValue
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Parameters](./get_parameters/)() | RTTI 情報。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [GetNameValueWithParametersLength](./getnamevaluewithparameterslength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 指定されたインデックスから渡された文字列を [NameValueWithParametersHeaderValue](./) クラスのインスタンスに変換します。 |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String) | 新しいインスタンスを構築します。 |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String, String) | 新しいインスタンスを構築します。 |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)() | 新しいインスタンスを構築します。 |
| static [Parse](./parse/)(String) | 渡された文字列を [NameValueWithParametersHeaderValue](./) クラスのインスタンスに変換します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueWithParametersHeaderValue\>\&) | 渡された文字列を [NameValueWithParametersHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [NameValueHeaderValue](../namevalueheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
