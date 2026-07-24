---
title: "System::Xml::Schema::XmlSchemaObjectTable クラス"
linktitle: "XmlSchemaObjectTable"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaObjectTable クラス。C++ における XmlSchema クラスに含まれる要素（例: Attributes、AttributeGroups、Elements など）のコレクションを提供します。"
type: docs
weight: 5300
url: /ja/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


[XmlSchema](../xmlschema/) クラスに含まれる要素（例: Attributes、AttributeGroups、Elements など）のコレクションを提供します。

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | 指定された修飾名がコレクションに存在するかどうかを判定します。 |
| [get_Count](./get_count/)() | [XmlSchemaObjectTable](./) に含まれる項目数を返します。 |
| [get_Names](./get_names/)() | [XmlSchemaObjectTable](./) のすべての名前付き要素のコレクションを返します。 |
| [get_Values](./get_values/)() | [XmlSchemaObjectTable](./) のすべての要素のすべての値のコレクションを返します。 |
| [GetEnumerator](./getenumerator/)() override | [XmlSchemaObjectTable](./) を反復処理できる列挙子を返します。 |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | 修飾名で指定された [XmlSchemaObjectTable](./) の要素を返します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
