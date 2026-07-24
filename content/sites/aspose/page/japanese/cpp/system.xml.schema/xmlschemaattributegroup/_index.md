---
title: "System::Xml::Schema::XmlSchemaAttributeGroup クラス"
linktitle: "XmlSchemaAttributeGroup"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAttributeGroup クラス。XML Schema の attributeGroup 要素を World Wide Web Consortium (W3C) が指定する形で表します。AttributesGroups は属性宣言の集合をグループ化するメカニズムを提供し、C++ の複合型定義にグループとして組み込むことができます。"
type: docs
weight: 1200
url: /ja/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


XML [Schema](../) の **attributeGroup** 要素を、World Wide [Web](../../system.web/) Consortium (W3C) が定義する通りに表します。AttributesGroups は属性宣言のセットをグループ化し、複合型定義にグループとして組み込むためのメカニズムを提供します。

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | 属性グループの [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) コンポーネントを返します。 |
| [get_Attributes](./get_attributes/)() | 属性グループの属性コレクションを返します。[XmlSchemaAttribute](../xmlschemaattribute/) と [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) 要素が含まれます。 |
| [get_Name](./get_name/)() | 属性グループの名前を返します。 |
| [get_QualifiedName](./get_qualifiedname/)() | 属性グループの修飾名を返します。 |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | XML [Schema](../) から再定義された属性グループプロパティを返します。 |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | 属性グループの [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) コンポーネントを設定します。 |
| [set_Name](./set_name/)(const String\&) | 属性グループの名前を設定します。 |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | [XmlSchemaAttributeGroup](./) クラスの新しいインスタンスを初期化します。 |
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
