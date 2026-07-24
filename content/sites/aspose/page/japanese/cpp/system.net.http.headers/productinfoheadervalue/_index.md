---
title: "System::Net::Http::Headers::ProductInfoHeaderValue クラス"
linktitle: "ProductInfoHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::ProductInfoHeaderValue クラス。''User-Agent'' ヘッダーの値における製品またはコメントを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として渡すようにしてください。"
type: docs
weight: 1800
url: /ja/cpp/system.net.http.headers/productinfoheadervalue/
---
## ProductInfoHeaderValue class


'User-Agent' ヘッダーの値における製品またはコメントを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class ProductInfoHeaderValue : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Comment](./get_comment/)() | コメントを返します。 |
| [get_Product](./get_product/)() | RTTI 情報。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [GetProductInfoLength](./getproductinfolength/)(String, int32_t, System::SharedPtr\<ProductInfoHeaderValue\>\&) | 指定されたインデックスから渡された文字列を [ProductInfoHeaderValue](./) クラスのインスタンスに変換します。 |
| static [Parse](./parse/)(String) | 渡された文字列を [ProductInfoHeaderValue](./) クラスのインスタンスに変換します。 |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String, String) | 新しいインスタンスを構築します。 |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(System::SharedPtr\<ProductHeaderValue\>) | 新しいインスタンスを構築します。 |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String) | 新しいインスタンスを構築します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductInfoHeaderValue\>\&) | 渡された文字列を [ProductInfoHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
