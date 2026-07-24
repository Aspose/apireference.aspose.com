---
title: "System::Xml::Schema::XmlSchemaFacet クラス"
linktitle: "XmlSchemaFacet"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaFacet クラス。C++ において、制限によって単純型が派生されるときに使用されるすべてのファセットの基底クラスです。"
type: docs
weight: 2900
url: /ja/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


制限によって単純型が派生する際に使用されるすべてのファセットの基底クラスです。

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | このファセットが固定されていることを示す情報を返します。 |
| [get_Value](./get_value/)() | ファセットの **value** 属性を返します。 |
| virtual [set_IsFixed](./set_isfixed/)(bool) | このファセットが固定されていることを示す情報を設定します。 |
| [set_Value](./set_value/)(const String\&) | ファセットの **value** 属性を設定します。 |
| [XmlSchemaFacet](./xmlschemafacet/)() | 新しいインスタンスを初期化します。[XmlSchemaFacet](./) クラス。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
