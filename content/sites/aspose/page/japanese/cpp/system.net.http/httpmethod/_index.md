---
title: "System::Net::Http::HttpMethod クラス"
linktitle: "HttpMethod"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::HttpMethod クラス。HTTP メソッドを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。"
type: docs
weight: 700
url: /ja/cpp/system.net.http/httpmethod/
---
## HttpMethod class


HTTP メソッドを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | 現在のオブジェクトと指定されたオブジェクトが等しいかどうかを判定します。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| static [get_Delete](./get_delete/)() | 'DELETE' HTTP メソッドを返します。 |
| static [get_Get](./get_get/)() | 'GET' HTTP メソッドを返します。 |
| static [get_Head](./get_head/)() | 'HEAD' HTTP メソッドを返します。 |
| [get_Method](./get_method/)() | HTTP メソッドの文字列表現を返します。 |
| static [get_Options](./get_options/)() | 'OPTIONS' HTTP メソッドを返します。 |
| static [get_Post](./get_post/)() | 'POST' HTTP メソッドを返します。 |
| static [get_Put](./get_put/)() | 'PUT' HTTP メソッドを返します。 |
| static [get_Trace](./get_trace/)() | 'TRACE' HTTP メソッドを返します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| [HttpMethod](./httpmethod/)(String) | 新しいインスタンスを構築します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
## 参照

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
