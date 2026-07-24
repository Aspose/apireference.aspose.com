---
title: "System::Xml::Schema::XmlSchemaAnnotation クラス"
linktitle: "XmlSchemaAnnotation"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaAnnotation クラス。C++ における World Wide Web Consortium (W3C) の annotation 要素を表します。"
type: docs
weight: 700
url: /ja/cpp/system.xml.schema/xmlschemaannotation/
---
## XmlSchemaAnnotation class


World Wide [Web](../../system.web/) Consortium (W3C) の **annotation** 要素を表します。

```cpp
class XmlSchemaAnnotation : public System::Xml::Schema::XmlSchemaObject
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Id](./get_id/)() | 文字列 ID を返します。 |
| [get_Items](./get_items/)() | **Items** コレクションを返します。このコレクションは **appinfo** と **documentation** の子要素を格納するために使用されます。 |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | スキーマの対象名前空間に属さない修飾属性を返します。 |
| [set_Id](./set_id/)(const String\&) | 文字列 ID を設定します。 |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | スキーマの対象名前空間に属さない修飾属性を設定します。 |
| [XmlSchemaAnnotation](./xmlschemaannotation/)() | 新しい [XmlSchemaAnnotation](./) クラスのインスタンスを初期化します。 |
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
