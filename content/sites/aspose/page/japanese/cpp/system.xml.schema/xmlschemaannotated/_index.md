---
title: "System::Xml::Schema::XmlSchemaAnnotated クラス"
linktitle: "XmlSchemaAnnotated"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAnnotated クラス。C++ でアノテーション要素を含むことができるすべての要素の基底クラスです。"
type: docs
weight: 600
url: /ja/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


アノテーション要素を含むことができる任意の要素の基底クラスです。

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** プロパティを返します。 |
| [get_Id](./get_id/)() | 文字列 ID を返します。 |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | 現在のスキーマのターゲット名前空間に属さない修飾属性を返します。 |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** プロパティを設定します。 |
| [set_Id](./set_id/)(const String\&) | 文字列 ID を設定します。 |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | 現在のスキーマのターゲット名前空間に属さない修飾属性を設定します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
