---
title: "System::Xml::XmlTextReader クラス"
linktitle: "XmlTextReader"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextReader クラス。C++ で XML データへの高速、非キャッシュ、前方のみのアクセスを提供するリーダーを表します。"
type: docs
weight: 3900
url: /ja/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


XML データへの高速でキャッシュされていない前方のみのアクセスを提供するリーダーを表します。

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() override | [XmlReader::get_ReadState](../xmlreader/get_readstate/) を **Closed** に変更します。 |
| [get_AttributeCount](./get_attributecount/)() override | 現在のノードの属性数を返します。 |
| [get_BaseURI](./get_baseuri/)() override | 現在のノードの基本 URI を返します。 |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | [XmlTextReader](./) がバイナリコンテンツ読み取りメソッドを実装しているかどうかを示す値を返します。 |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | [XmlTextReader](./) が [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/) メソッドを実装しているかどうかを示す値を返します。 |
| [get_CanResolveEntity](./get_canresolveentity/)() override | このリーダーがエンティティを解析および解決できるかどうかを示す値を返します。 |
| [get_Depth](./get_depth/)() override | XML ドキュメント内の現在のノードの深さを返します。 |
| [get_DtdProcessing](./get_dtdprocessing/)() | [DtdProcessing](../dtdprocessing/) 列挙体を返します。 |
| [get_Encoding](./get_encoding/)() | ドキュメントのエンコーディングを返します。 |
| [get_EntityHandling](./get_entityhandling/)() | リーダーがエンティティを処理する方法を指定する値を返します。 |
| [get_EOF](./get_eof/)() override | リーダーがストリームの末尾に位置しているかどうかを示す値を返します。 |
| [get_HasValue](./get_hasvalue/)() override | 現在のノードが [XmlTextReader::get_Value](./get_value/) に [String::Empty](../../system/string/empty/) 以外の値を持てるかどうかを示す値を返します。 |
| [get_IsDefault](./get_isdefault/)() override | 現在のノードが DTD またはスキーマで定義されたデフォルト値から生成された属性かどうかを示す値を返します。 |
| [get_IsEmptyElement](./get_isemptyelement/)() override | 現在のノードが空要素かどうかを示す値を返します（例: **<MyElement/>**）。 |
| [get_LineNumber](./get_linenumber/)() override | 現在の行番号を返します。 |
| [get_LinePosition](./get_lineposition/)() override | 現在の行位置を返します。 |
| [get_LocalName](./get_localname/)() override | 現在のノードのローカル名を返します。 |
| [get_Name](./get_name/)() override | 現在のノードの修飾名を返します。 |
| [get_Namespaces](./get_namespaces/)() | 名前空間サポートを行うかどうかを示す値を返します。 |
| [get_NamespaceURI](./get_namespaceuri/)() override | リーダーが位置しているノードの名前空間 URI（W3C 名前空間仕様で定義されている）を返します。 |
| [get_NameTable](./get_nametable/)() override | この実装に関連付けられた [XmlNameTable](../xmlnametable/) を返します。 |
| [get_NodeType](./get_nodetype/)() override | 現在のノードの型を返します。 |
| [get_Normalization](./get_normalization/)() | 空白と属性値を正規化するかどうかを示す値を返します。 |
| [get_Prefix](./get_prefix/)() override | 現在のノードに関連付けられた名前空間プレフィックスを返します。 |
| [get_ProhibitDtd](./get_prohibitdtd/)() | DTD 処理を許可するかどうかを示す値を返します。 |
| [get_QuoteChar](./get_quotechar/)() override | 属性ノードの値を囲むために使用される引用符文字を返します。 |
| [get_ReadState](./get_readstate/)() override | リーダーの状態を返します。 |
| [get_Value](./get_value/)() override | 現在のノードのテキスト値を返します。 |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | 空白がどのように処理されるかを指定する値を返します。 |
| [get_XmlLang](./get_xmllang/)() override | 現在の **xml:lang** スコープを返します。 |
| [get_XmlSpace](./get_xmlspace/)() override | 現在の **xml:space** スコープを返します。 |
| [GetAttribute](./getattribute/)(String) override | 指定された名前の属性の値を返します。 |
| [GetAttribute](./getattribute/)(String, String) override | 指定されたローカル名と名前空間 URI を持つ属性の値を返します。 |
| [GetAttribute](./getattribute/)(int32_t) override | 指定されたインデックスの属性の値を返します。 |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | 現在スコープ内にあるすべての名前空間を含むコレクションを返します。 |
| [GetRemainder](./getremainder/)() | バッファされた XML の残りを返します。 |
| [HasLineInfo](./haslineinfo/)() override | クラスが行情報を返すことができるかどうかを示す値を返します。 |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | 現在の要素のスコープ内で名前空間プレフィックスを解決します。 |
| [MoveToAttribute](./movetoattribute/)(String) override | 指定された名前の属性へ移動します。 |
| [MoveToAttribute](./movetoattribute/)(String, String) override | 指定されたローカル名と名前空間 URI を持つ属性へ移動します。 |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | 指定されたインデックスの属性へ移動します。 |
| [MoveToElement](./movetoelement/)() override | 現在の属性ノードを含む要素へ移動します。 |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | 最初の属性へ移動します。 |
| [MoveToNextAttribute](./movetonextattribute/)() override | 次の属性へ移動します。 |
| [Read](./read/)() override | ストリームから次のノードを読み取ります。 |
| [ReadAttributeValue](./readattributevalue/)() override | 属性値を解析し、1つ以上の **[Text](../../system.text/)**、**EntityReference**、または **EndEntity** ノードに変換します。 |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Base64 をデコードし、デコードされたバイナリバイトを返します。 |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | **BinHex** をデコードし、デコードされたバイナリバイトを返します。 |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | 要素のテキスト内容を文字バッファに読み取ります。このメソッドは、埋め込みテキストの大きなストリームを連続して呼び出すことで読み取るように設計されています。 |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 内容を読み取り、**Base64** デコードされたバイナリバイトを返します。 |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 内容を読み取り、**BinHex** デコードされたバイナリバイトを返します。 |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 要素を読み取り、Base64 コンテンツをデコードします。 |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 要素を読み取り、**BinHex** コンテンツをデコードします。 |
| [ReadString](./readstring/)() override | 要素またはテキストノードの内容を文字列として読み取ります。 |
| [ResetState](./resetstate/)() | リーダーの状態を [ReadState::Initial](../readstate/) にリセットします。 |
| [ResolveEntity](./resolveentity/)() override | **EntityReference** ノードのエンティティ参照を解決します。 |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | [DtdProcessing](../dtdprocessing/) 列挙体を設定します。 |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | リーダーがエンティティを処理する方法を指定する値を設定します。 |
| [set_Namespaces](./set_namespaces/)(bool) | 名前空間サポートを行うかどうかを示す値を設定します。 |
| [set_Normalization](./set_normalization/)(bool) | 空白と属性値を正規化するかどうかを示す値を設定します。 |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | DTD 処理を許可するかどうかを示す値を設定します。 |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | 空白がどのように処理されるかを指定する値を設定します。 |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | DTD 参照の解決に使用される [XmlResolver](../xmlresolver/) を設定します。 |
| [Skip](./skip/)() override | 現在のノードの子ノードをスキップします。 |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | 指定されたストリームで [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | 指定された URL とストリームで [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | 指定されたストリームと [XmlNameTable](../xmlnametable/) で [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | 指定された URL、ストリーム、および [XmlNameTable](../xmlnametable/) で [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | 指定された TextReader で [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | 指定された URL と TextReader で [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | 指定された TextReader と [XmlNameTable](../xmlnametable/) で [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | 指定された URL、TextReader、および [XmlNameTable](../xmlnametable/) で [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | 指定されたストリーム、[XmlNodeType](../xmlnodetype/) および [XmlParserContext](../xmlparsercontext/) で [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | 指定された文字列、[XmlNodeType](../xmlnodetype/) および [XmlParserContext](../xmlparsercontext/) で [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
| [XmlTextReader](./xmltextreader/)(const String\&) | 指定されたファイルで [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | 指定されたファイルと [XmlNameTable](../xmlnametable/) で [XmlTextReader](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



代わりに [XmlReader](../xmlreader/) クラスを使用することが推奨されます。

このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
