---
title: "System::Xml::Schema::XmlSchema クラス"
linktitle: "XmlSchema"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchema クラス。World Wide Web Consortium（W3C）および C++ で指定された XML スキーマのインメモリ表現です。"
type: docs
weight: 400
url: /ja/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


XML [Schema](../) のインメモリ表現で、World Wide [Web](../../system.web/) Consortium（W3C）による [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) および [XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/) で規定されています。

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | XML [Schema](../)[Object](../../system/object/) モデル（SOM）を検証用のスキーマ情報にコンパイルします。プログラムで構築された SOM の構文的および意味的構造をチェックするために使用されます。意味的検証はコンパイル時に実行されます。 |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | XML [Schema](../)[Object](../../system/object/) モデル（SOM）を検証用のスキーマ情報にコンパイルします。プログラムで構築された SOM の構文的および意味的構造をチェックするために使用されます。意味的検証はコンパイル時に実行されます。 |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | スキーマの対象名前空間で宣言された属性の形式を返します。 |
| [get_AttributeGroups](./get_attributegroups/)() | スキーマ内のすべてのグローバル属性グループのスキーマコンパイル後の値を返します。 |
| [get_Attributes](./get_attributes/)() | スキーマ内のすべての属性のスキーマコンパイル後の値を返します。 |
| [get_BlockDefault](./get_blockdefault/)() | スキーマの **targetNamespace** にある要素および複合型の **block** 属性のデフォルト値を設定する **blockDefault** 属性を返します。 |
| [get_ElementFormDefault](./get_elementformdefault/)() | スキーマの対象名前空間で宣言された要素の形式を返します。 |
| [get_Elements](./get_elements/)() | スキーマ内のすべての要素のスキーマコンパイル後の値を返します。 |
| [get_FinalDefault](./get_finaldefault/)() | スキーマの対象名前空間にある要素および複合型の **final** 属性のデフォルト値を設定する **finalDefault** 属性を返します。 |
| [get_Groups](./get_groups/)() | スキーマ内のすべてのグループのスキーマコンパイル後の値を返します。 |
| [get_Id](./get_id/)() | 文字列 ID を返します。 |
| [get_Includes](./get_includes/)() | 含まれるスキーマとインポートされたスキーマのコレクションを返します。 |
| [get_IsCompiled](./get_iscompiled/)() | スキーマがコンパイルされたかどうかを示します。 |
| [get_Items](./get_items/)() | スキーマ内のスキーマ要素のコレクションを返し、**schema** 要素レベルで新しい要素タイプを追加するために使用されます。 |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | **schema** 要素が参照するファイル内の行番号を返します。 |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | **schema** 要素が参照するファイル内の行位置を返します。 |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | このスキーマオブジェクトで使用する XmlSerializerNamespaces を返します。 |
| [get_Notations](./get_notations/)() | スキーマ内のすべての表記のスキーマコンパイル後の値を返します。 |
| [get_Parent](../xmlschemaobject/get_parent/)() | この [XmlSchemaObject](../xmlschemaobject/) の親を返します。 |
| [get_SchemaTypes](./get_schematypes/)() | スキーマ内のすべてのスキーマ型のスキーマコンパイル後の値を返します。 |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | スキーマを読み込んだファイルのソース位置を返します。 |
| [get_TargetNamespace](./get_targetnamespace/)() | スキーマのターゲット名前空間の Uniform Resource Identifier (URI) を返します。 |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | スキーマのターゲット名前空間に属さない修飾属性を返します。 |
| [get_Version](./get_version/)() | スキーマのバージョンを返します。 |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | 提供された [IO::TextReader](../../system.io/textreader/) から XML [Schema](../) を読み取ります。 |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | 提供されたストリームから XML [Schema](../) を読み取ります。 |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | 提供された [XmlReader](../../system.xml/xmlreader/) から XML [Schema](../) を読み取ります。 |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | スキーマのターゲット名前空間で宣言された属性の形式を設定します。 |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | スキーマの **targetNamespace** にある要素および複合型の **block** 属性のデフォルト値を設定する **blockDefault** 属性を設定します。 |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | スキーマのターゲット名前空間で宣言された要素の形式を設定します。 |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | スキーマのターゲット名前空間にある要素および複合型の **final** 属性のデフォルト値を設定する **finalDefault** 属性を設定します。 |
| [set_Id](./set_id/)(const String\&) | 文字列 ID を設定します。 |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | **schema** 要素が参照するファイル内の行番号を設定します。 |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | **schema** 要素が参照するファイル内の行位置を設定します。 |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | このスキーマ オブジェクトで使用する XmlSerializerNamespaces を設定します。 |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | この [XmlSchemaObject](../xmlschemaobject/) の親を設定します。 |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | スキーマを読み込んだファイルのソース位置を設定します。 |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | スキーマ ターゲット 名前空間の Uniform Resource Identifier (URI) を設定します。 |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | スキーマ ターゲット 名前空間に属さない修飾属性を設定します。 |
| [set_Version](./set_version/)(const String\&) | スキーマのバージョンを設定します。 |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | 提供されたデータ ストリームに XML [Schema](../) を書き込みます。 |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | 指定された [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) を使用して、提供されたストリームに XML [Schema](../) を書き込みます。 |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | 提供された [IO::TextWriter](../../system.io/textwriter/) に XML [Schema](../) を書き込みます。 |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | 提供された TextWriter に XML [Schema](../) を書き込みます。 |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | 提供された [XmlWriter](../../system.xml/xmlwriter/) に XML [Schema](../) を書き込みます。 |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | 提供された [XmlWriter](../../system.xml/xmlwriter/) に XML [Schema](../) を書き込みます。 |
| [XmlSchema](./xmlschema/)() | [XmlSchema](./) クラスの新しいインスタンスを初期化します。 |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | [XmlSchemaObject](../xmlschemaobject/) クラスの新しいインスタンスを初期化します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | XML スキーマ インスタンス 名前空間です。このフィールドは定数です。 |
| static [Namespace](./namespace/) | XML スキーマ 名前空間です。このフィールドは定数です。 |
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
