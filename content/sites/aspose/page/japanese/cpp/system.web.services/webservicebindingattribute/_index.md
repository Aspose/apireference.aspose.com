---
title: "System::Web::Services::WebServiceBindingAttribute class"
linktitle: "WebServiceBindingAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::WebServiceBindingAttribute クラス。XML Web サービスの 1 つ以上のメソッドを定義するバインディングを宣言するために使用されます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを関数への引数として使用してください。"
type: docs
weight: 400
url: /ja/cpp/system.web.services/webservicebindingattribute/
---
## WebServiceBindingAttribute class


XML [Web](../../system.web/) サービスの 1 つ以上のメソッドを定義するバインディングを宣言するために使用されます。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class WebServiceBindingAttribute : public System::Attribute
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_ConformsTo](./get_conformsto/)() | WSI 仕様を取得します。 |
| [get_EmitConformanceClaims](./get_emitconformanceclaims/)() | バインディングが適合性クレームを発行するかどうかを示す値を取得します。 |
| [get_Location](./get_location/)() | RTTI 情報。 |
| [get_Name](./get_name/)() | バインディングの名前を取得します。 |
| [get_Namespace](./get_namespace/)() | バインディングに関連付けられた名前空間を取得します。 |
| [set_ConformsTo](./set_conformsto/)(System::SharedPtr\<WsiProfiles\>) | WSI 仕様を設定します。 |
| [set_EmitConformanceClaims](./set_emitconformanceclaims/)(bool) | バインディングが適合性クレームを発行するかどうかを示す値を設定します。 |
| [set_Location](./set_location/)(String) | バインディングが定義されている場所を設定します。 |
| [set_Name](./set_name/)(String) | バインディングの名前を設定します。 |
| [set_Namespace](./set_namespace/)(String) | バインディングに関連付けられた名前空間を設定します。 |
| [WebServiceBindingAttribute](./webservicebindingattribute/)() | 新しいインスタンスを構築します。 |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String) | 新しいインスタンスを構築します。 |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String) | 新しいインスタンスを構築します。 |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String, String) | 新しいインスタンスを構築します。 |
## 参照

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services](../)
* Library [Aspose.Page for C++](../../)
