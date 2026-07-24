---
title: "System::Net::Http::Headers::ProductHeaderValue クラス"
linktitle: "ProductHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::ProductHeaderValue クラス。''User-Agent'' ヘッダーの値に含まれる製品トークンを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用して作成したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 1700
url: /ja/cpp/system.net.http.headers/productheadervalue/
---
## ProductHeaderValue class


'User-Agent' ヘッダーの値に含まれる製品トークンを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用して作成したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class ProductHeaderValue : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Name](./get_name/)() | RTTI 情報。 |
| [get_Version](./get_version/)() | 製品トークンのバージョンを返します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [GetProductLength](./getproductlength/)(String, int32_t, System::SharedPtr\<ProductHeaderValue\>\&) | 指定されたインデックスから渡された文字列を [ProductHeaderValue](./) クラスのインスタンスに変換します。 |
| static [Parse](./parse/)(String) | 渡された文字列を [ProductHeaderValue](./) クラスのインスタンスに変換します。 |
| [ProductHeaderValue](./productheadervalue/)(String) | 新しいインスタンスを構築します。 |
| [ProductHeaderValue](./productheadervalue/)(String, String) | 新しいインスタンスを構築します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductHeaderValue\>\&) | 渡された文字列を [ProductHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
