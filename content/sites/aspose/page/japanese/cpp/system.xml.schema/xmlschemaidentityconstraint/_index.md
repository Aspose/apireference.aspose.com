---
title: "System::Xml::Schema::XmlSchemaIdentityConstraint クラス"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaIdentityConstraint クラス。C++ における同一性制約（key、keyref、unique 要素）用のクラスです。"
type: docs
weight: 3400
url: /ja/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


識別制約 (**key**、**keyref**、**unique**) 要素用のクラスです。

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Fields](./get_fields/)() | XML Path Language（[XPath](../../system.xml.xpath/)）式セレクタの子要素として適用されるフィールドのコレクションを返します。 |
| [get_Name](./get_name/)() | 同一性制約の名前を返します。 |
| [get_QualifiedName](./get_qualifiedname/)() | 同一性制約の修飾名を返します。この修飾名は **QualifiedName** 値のコンパイル後の解釈を保持します。 |
| [get_Selector](./get_selector/)() | [XPath](../../system.xml.xpath/) 式の **selector** 要素を返します。 |
| [set_Name](./set_name/)(const String\&) | 同一性制約の名前を設定します。 |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | [XPath](../../system.xml.xpath/) 式の **selector** 要素を設定します。 |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | [XmlSchemaIdentityConstraint](./) クラスの新しいインスタンスを初期化します。 |
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
