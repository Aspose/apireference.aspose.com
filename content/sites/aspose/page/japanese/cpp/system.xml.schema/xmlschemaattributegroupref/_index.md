---
title: "System::Xml::Schema::XmlSchemaAttributeGroupRef クラス"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAttributeGroupRef クラス。XML Schema の attributeGroup 要素を ref 属性で表します。AttributesGroupRef は attributeGroup の参照であり、name プロパティには C++ で参照される属性グループが含まれます。"
type: docs
weight: 1300
url: /ja/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


XML [Schema](../) の **attributeGroup** 要素を **ref** 属性で表します（[World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454) が指定）。AttributesGroupRef は attributeGroup の参照であり、name プロパティには参照されている属性グループが含まれます。

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_RefName](./get_refname/)() | 参照された **attributeGroup** 要素の名前を返します。 |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | 参照された **attributeGroup** 要素の名前を設定します。 |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | [XmlSchemaAttributeGroupRef](./) クラスの新しいインスタンスを初期化します。 |
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
