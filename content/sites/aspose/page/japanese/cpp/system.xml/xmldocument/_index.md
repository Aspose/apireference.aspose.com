---
title: "System::Xml::XmlDocument クラス"
linktitle: "XmlDocument"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocument クラス。XML ドキュメントを表します。このクラスは C++ でドキュメント内の XML をロード、検証、編集、追加、配置するために使用できます。"
type: docs
weight: 1400
url: /ja/cpp/system.xml/xmldocument/
---
## XmlDocument class


XML ドキュメントを表します。このクラスを使用して、XML をロード、検証、編集、追加、およびドキュメント内で位置付けできます。

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | このノードの複製を作成します。 |
| [CreateAttribute](./createattribute/)(const String\&) | 指定された名前で [XmlAttribute](../xmlattribute/) を作成します。 |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | 指定された修飾名と [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) を使用して [XmlAttribute](../xmlattribute/) を作成します。 |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | 指定された [XmlNode::get_Prefix](../xmlnode/get_prefix/)、[XmlDocument::get_LocalName](./get_localname/)、および [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) を使用して [XmlAttribute](../xmlattribute/) を作成します。 |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | 指定されたデータを含む [XmlCDataSection](../xmlcdatasection/) を作成します。 |
| virtual [CreateComment](./createcomment/)(const String\&) | 指定されたデータを含む [XmlComment](../xmlcomment/) を作成します。 |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | [XmlDocumentFragment](../xmldocumentfragment/) を作成します。 |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | 新しい [XmlDocumentType](../xmldocumenttype/) オブジェクトを返します。 |
| [CreateElement](./createelement/)(const String\&) | 指定された名前の要素を作成します。 |
| [CreateElement](./createelement/)(const String\&, const String\&) | 修飾名と [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) を使用して [XmlElement](../xmlelement/) を作成します。 |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | 指定された [XmlNode::get_Prefix](../xmlnode/get_prefix/)、[XmlDocument::get_LocalName](./get_localname/)、および [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) を使用して要素を作成します。 |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | 指定された名前で [XmlEntityReference](../xmlentityreference/) を作成します。 |
| [CreateNavigator](./createnavigator/)() override | このドキュメントをナビゲートするための新しい XPathNavigator オブジェクトを作成します。 |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | 指定された [XmlNodeType](../xmlnodetype/)、[XmlNode::get_Prefix](../xmlnode/get_prefix/)、[XmlDocument::get_Name](./get_name/)、および [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) を使用して [XmlNode](../xmlnode/) を作成します。 |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | 指定されたノードタイプ、[XmlDocument::get_Name](./get_name/)、および [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) を使用して [XmlNode](../xmlnode/) を作成します。 |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | 指定された [XmlNodeType](../xmlnodetype/)、[XmlDocument::get_Name](./get_name/)、および [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) を使用して [XmlNode](../xmlnode/) を作成します。 |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | 指定された名前とデータで [XmlProcessingInstruction](../xmlprocessinginstruction/) を作成します。 |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | [XmlSignificantWhitespace](../xmlsignificantwhitespace/) ノードを作成します。 |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | 指定されたテキストで[XmlText](../xmltext/)を作成します。 |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | [XmlWhitespace](../xmlwhitespace/)ノードを作成します。 |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | 指定された値で[XmlDeclaration](../xmldeclaration/)ノードを作成します。 |
| [get_BaseURI](./get_baseuri/)() override | 現在のノードの基本 URI を返します。 |
| [get_DocumentElement](./get_documentelement/)() | ドキュメントのルート[XmlElement](../xmlelement/)を返します。 |
| virtual [get_DocumentType](./get_documenttype/)() | DOCTYPE宣言を含むノードを返します。 |
| [get_Implementation](./get_implementation/)() | 現在のドキュメント用の[XmlImplementation](../xmlimplementation/)オブジェクトを返します。 |
| [get_InnerXml](./get_innerxml/)() override | 現在のノードの子要素を表すマークアップを返します。 |
| [get_IsReadOnly](./get_isreadonly/)() override | 現在のノードが読み取り専用かどうかを示す値を返します。 |
| [get_LocalName](./get_localname/)() override | ノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | ノードの修飾名を返します。 |
| [get_NameTable](./get_nametable/)() | この実装に関連付けられた [XmlNameTable](../xmlnametable/) を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_OwnerDocument](./get_ownerdocument/)() override | 現在のノードが属する[XmlDocument](./)を返します。 |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | 要素コンテンツで空白を保持するかどうかを示す値を返します。 |
| [get_SchemaInfo](./get_schemainfo/)() override | ノードのスキーマ検証後情報セット（PSVI）を返します。 |
| [get_Schemas](./get_schemas/)() | この[XmlDocument](./)に関連付けられたXmlSchemaSetオブジェクトを返します。 |
| virtual [GetElementById](./getelementbyid/)(String) | 指定されたIDを持つ[XmlElement](../xmlelement/)を返します。 |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | 指定された名前に一致するすべての子孫要素のリストを含む[XmlNodeList](../xmlnodelist/)を返します。 |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | 指定された[XmlDocument::get_LocalName](./get_localname/)および[XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/)に一致するすべての子孫要素のリストを含む[XmlNodeList](../xmlnodelist/)を返します。 |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | 別のドキュメントからノードをインポートして現在のドキュメントに追加します。 |
| virtual [Load](./load/)(String) | 指定されたURLからXMLドキュメントをロードします。 |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | 指定されたストリームからXMLドキュメントをロードします。 |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | 指定されたTextReaderからXMLドキュメントをロードします。 |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | 指定された[XmlReader](../xmlreader/)からXMLドキュメントをロードします。 |
| virtual [LoadXml](./loadxml/)(String) | 指定された文字列からXMLドキュメントをロードします。 |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | [XmlReader](../xmlreader/)の情報に基づいて[XmlNode](../xmlnode/)オブジェクトを作成します。リーダーはノードまたは属性上に位置している必要があります。 |
| virtual [Save](./save/)(String) | XMLドキュメントを指定されたファイルに保存します。指定されたファイルが存在する場合、このメソッドは上書きします。 |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | XMLドキュメントを指定されたストリームに保存します。 |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | XMLドキュメントを指定されたTextWriterに保存します。 |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | 指定された[XmlWriter](../xmlwriter/)にXMLドキュメントを保存します。 |
| [set_InnerText](./set_innertext/)(String) override | すべての場合にInvalidOperationExceptionをスローします。 |
| [set_InnerXml](./set_innerxml/)(String) override | 現在のノードの子要素を表すマークアップを設定します。 |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | 要素の内容で空白を保持するかどうかを示す値を設定します。 |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | この[XmlDocument](./)に関連付けられたXmlSchemaSetオブジェクトを設定します。 |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | 外部リソースの解決に使用する[XmlResolver](../xmlresolver/)を設定します。 |
| [Validate](./validate/)(Schema::ValidationEventHandler) | [XmlDocument](./)を、[XmlDocument::get_Schemas](./get_schemas/)リストに含まれるXML [Schema](../../system.xml.schema/) 定義言語（XSD）スキーマに対して検証します。 |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | 指定された[XmlNode](../xmlnode/)オブジェクトを、[XmlDocument::get_Schemas](./get_schemas/)リストにあるXML [Schema](../../system.xml.schema/) 定義言語（XSD）スキーマに対して検証します。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | [XmlDocument](./)ノードのすべての子要素を、指定された[XmlWriter](../xmlwriter/)に保存します。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | [XmlDocument](./)ノードを、指定された[XmlWriter](../xmlwriter/)に保存します。 |
| [XmlDocument](./xmldocument/)() | [XmlDocument](./)クラスの新しいインスタンスを初期化します。 |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | 指定された[XmlNameTable](../xmlnametable/)を使用して、[XmlDocument](./)クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
