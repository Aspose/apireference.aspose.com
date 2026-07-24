---
title: "System::Xml::XmlNodeReader クラス"
linktitle: "XmlNodeReader"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeReader クラス。C++ における XmlNode の XML データに対し、キャッシュなしで高速かつ順方向のみのアクセスを提供するリーダーを表します。"
type: docs
weight: 2800
url: /ja/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


[XmlNode](../xmlnode/) の XML データに対し、キャッシュなしで高速かつ順方向のみのアクセスを提供するリーダーを表します。

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() override | [XmlNodeReader::get_ReadState](./get_readstate/) を [ReadState::Closed](../readstate/) に変更します。 |
| [get_AttributeCount](./get_attributecount/)() override | 現在のノードの属性数を返します。 |
| [get_BaseURI](./get_baseuri/)() override | 現在のノードの基本 URI を返します。 |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | [XmlNodeReader](./) がバイナリ コンテンツ読み取りメソッドを実装しているかどうかを示す値を返します。 |
| [get_CanResolveEntity](./get_canresolveentity/)() override | このリーダーがエンティティを解析および解決できるかどうかを示す値を返します。 |
| [get_Depth](./get_depth/)() override | XML ドキュメント内の現在のノードの深さを返します。 |
| [get_EOF](./get_eof/)() override | リーダーがストリームの末尾に位置しているかどうかを示す値を返します。 |
| [get_HasAttributes](./get_hasattributes/)() override | 現在のノードに属性があるかどうかを示す値を返します。 |
| [get_HasValue](./get_hasvalue/)() override | 現在のノードが [XmlNodeReader::get_Value](./get_value/) の値を持つことができるかどうかを示す値を返します。 |
| [get_IsDefault](./get_isdefault/)() override | 現在のノードが文書型定義 (DTD) またはスキーマで定義されたデフォルト値から生成された属性かどうかを示す値を返します。 |
| [get_IsEmptyElement](./get_isemptyelement/)() override | 現在のノードが空要素かどうかを示す値を返します（例: **<MyElement/>**）。 |
| [get_LocalName](./get_localname/)() override | 現在のノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | 現在のノードの修飾名を返します。 |
| [get_NamespaceURI](./get_namespaceuri/)() override | リーダーが位置しているノードの名前空間 URI（W3C 名前空間仕様で定義されている）を返します。 |
| [get_NameTable](./get_nametable/)() override | この実装に関連付けられた [XmlNameTable](../xmlnametable/) を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_Prefix](./get_prefix/)() override | 現在のノードに関連付けられた名前空間プレフィックスを返します。 |
| [get_ReadState](./get_readstate/)() override | リーダーの状態を返します。 |
| [get_SchemaInfo](./get_schemainfo/)() override | 現在のノードに割り当てられたスキーマ情報を返します。 |
| [get_Value](./get_value/)() override | 現在のノードのテキスト値を返します。 |
| [get_XmlLang](./get_xmllang/)() override | 現在の **xml:lang** スコープを返します。 |
| [get_XmlSpace](./get_xmlspace/)() override | 現在の **xml:space** スコープを返します。 |
| [GetAttribute](./getattribute/)(String) override | 指定された名前の属性の値を返します。 |
| [GetAttribute](./getattribute/)(String, String) override | 指定されたローカル名と名前空間 URI を持つ属性の値を返します。 |
| [GetAttribute](./getattribute/)(int32_t) override | 指定されたインデックスの属性の値を返します。 |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 現在の要素のスコープ内で名前空間プレフィックスを解決します。 |
| [MoveToAttribute](./movetoattribute/)(String) override | 指定された名前の属性へ移動します。 |
| [MoveToAttribute](./movetoattribute/)(String, String) override | 指定されたローカル名と名前空間 URI を持つ属性へ移動します。 |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | 指定されたインデックスの属性へ移動します。 |
| [MoveToElement](./movetoelement/)() override | 現在の属性ノードを含む要素へ移動します。 |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | 最初の属性へ移動します。 |
| [MoveToNextAttribute](./movetonextattribute/)() override | 次の属性へ移動します。 |
| [Read](./read/)() override | ストリームから次のノードを読み取ります。 |
| [ReadAttributeValue](./readattributevalue/)() override | 属性値を解析し、1つ以上の **[Text](../../system.text/)**、**EntityReference**、または **EndEntity** ノードに変換します。 |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 内容を読み取り、Base64 デコードされたバイナリバイトを返します。 |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 内容を読み取り、BinHex デコードされたバイナリバイトを返します。 |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 要素を読み取り、Base64 コンテンツをデコードします。 |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 要素を読み取り、BinHex コンテンツをデコードします。 |
| [ReadString](./readstring/)() override | 要素またはテキストノードの内容を文字列として読み取ります。 |
| [ResolveEntity](./resolveentity/)() override | **EntityReference** ノードのエンティティ参照を解決します。 |
| [Skip](./skip/)() override | 現在のノードの子ノードをスキップします。 |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | 指定された [XmlNode](../xmlnode/) を使用して、[XmlNodeReader](./) クラスのインスタンスを作成します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
