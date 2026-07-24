---
title: "System::Xml::XmlParserContext クラス"
linktitle: "XmlParserContext"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlParserContext クラス。C++ で XML フラグメントを解析するために XmlReader が必要とするすべてのコンテキスト情報を提供します。"
type: docs
weight: 3000
url: /ja/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


XML フラグメントを解析するために [XmlReader](../xmlreader/) が必要とするすべてのコンテキスト情報を提供します。

```cpp
class XmlParserContext : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | ベース URI を返します。 |
| [get_DocTypeName](./get_doctypename/)() | 文書型宣言の名前を返します。 |
| [get_Encoding](./get_encoding/)() | エンコーディングの種類を返します。 |
| [get_InternalSubset](./get_internalsubset/)() | 内部 DTD サブセットを返します。 |
| [get_NamespaceManager](./get_namespacemanager/)() | [XmlNamespaceManager](../xmlnamespacemanager/) を返します。 |
| [get_NameTable](./get_nametable/)() | [XmlNameTable](../xmlnametable/) を返します。このテーブルは文字列をアトミック化するために使用されます。アトミック化された文字列の詳細については、[XmlNameTable](../xmlnametable/) を参照してください。 |
| [get_PublicId](./get_publicid/)() | 公開識別子を返します。 |
| [get_SystemId](./get_systemid/)() | システム識別子を返します。 |
| [get_XmlLang](./get_xmllang/)() | 現在の **xml:lang** スコープを返します。 |
| [get_XmlSpace](./get_xmlspace/)() | 現在の **xml:space** スコープを返します。 |
| [set_BaseURI](./set_baseuri/)(const String\&) | ベース URI を設定します。 |
| [set_DocTypeName](./set_doctypename/)(const String\&) | 文書型宣言の名前を設定します。 |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | エンコーディングの種類を設定します。 |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | 内部 DTD サブセットを設定します。 |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | [XmlNamespaceManager](../xmlnamespacemanager/) を設定します。 |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | [XmlNameTable](../xmlnametable/) を設定します。このテーブルは文字列をアトミック化するために使用されます。アトミック化された文字列の詳細については、[XmlNameTable](../xmlnametable/) を参照してください。 |
| [set_PublicId](./set_publicid/)(const String\&) | 公開識別子を設定します。 |
| [set_SystemId](./set_systemid/)(const String\&) | システム識別子を設定します。 |
| [set_XmlLang](./set_xmllang/)(const String\&) | 現在の **xml:lang** スコープを設定します。 |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | 現在の **xml:space** スコープを設定します。 |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | 指定された [XmlNameTable](../xmlnametable/)、[XmlNamespaceManager](../xmlnamespacemanager/)、**xml:lang**、**xml:space** の値を使用して、[XmlParserContext](./) クラスの新しいインスタンスを初期化します。 |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | 指定された [XmlNameTable](../xmlnametable/)、[XmlNamespaceManager](../xmlnamespacemanager/)、**xml:lang**、**xml:space**、エンコーディングの値を使用して、[XmlParserContext](./) クラスの新しいインスタンスを初期化します。 |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | 指定された [XmlNameTable](../xmlnametable/)、[XmlNamespaceManager](../xmlnamespacemanager/)、ベース URI、**xml:lang**、**xml:space**、文書型の値を使用して、[XmlParserContext](./) クラスの新しいインスタンスを初期化します。 |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | 指定された[XmlNameTable](../xmlnametable/)、[XmlNamespaceManager](../xmlnamespacemanager/)、ベースURI、**xml:lang**、**xml:space**、エンコーディング、および文書タイプの値を使用して、[XmlParserContext](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
