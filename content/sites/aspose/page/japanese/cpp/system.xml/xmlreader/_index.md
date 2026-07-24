---
title: "System::Xml::XmlReader class"
linktitle: "XmlReader"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader class。C++ で XML データへの高速、非キャッシュ、前方のみのアクセスを提供するリーダーを表します。"
type: docs
weight: 3300
url: /ja/cpp/system.xml/xmlreader/
---
## XmlReader class


XML データへの高速でキャッシュされていない前方のみのアクセスを提供するリーダーを表します。

```cpp
class XmlReader : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Close](./close/)() | 派生クラスでオーバーライドされた場合、[XmlReader::get_ReadState](./get_readstate/) を [ReadState::Closed](../readstate/) に変更します。 |
| static [Create](./create/)(const String\&) | 指定された URI で新しい [XmlReader](./) インスタンスを作成します。 |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | 指定された URI と設定を使用して新しい [XmlReader](./) インスタンスを作成します。 |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | 指定された URI、設定、および解析用のコンテキスト情報を使用して新しい [XmlReader](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | 指定されたストリームを使用し、デフォルト設定で新しい [XmlReader](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | 指定されたストリームと設定で新しい [XmlReader](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | 指定されたストリーム、ベース URI、設定を使用して新しい [XmlReader](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | 指定されたストリーム、設定、および解析用のコンテキスト情報を使用して新しい [XmlReader](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | 指定されたテキストリーダーを使用して新しい [XmlReader](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | 指定されたテキストリーダーと設定を使用して新しい [XmlReader](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | 指定されたテキストリーダー、設定、ベース URI を使用して新しい [XmlReader](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | 指定されたテキストリーダー、設定、および解析用のコンテキスト情報を使用して新しい [XmlReader](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | 指定された XML リーダーと設定を使用して新しい [XmlReader](./) インスタンスを作成します。 |
| [Dispose](./dispose/)() override | 現在の [XmlReader](./) クラスのインスタンスが使用しているすべてのリソースを解放します。 |
| virtual [get_AttributeCount](./get_attributecount/)() | 派生クラスでオーバーライドされた場合、現在のノードの属性数を取得します。 |
| virtual [get_BaseURI](./get_baseuri/)() | 派生クラスでオーバーライドされた場合、現在のノードのベース URI を取得します。 |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | [XmlReader](./) がバイナリコンテンツ読み取りメソッドを実装しているかどうかを示す値を返します。 |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | [XmlReader](./) が [XmlReader::ReadValueChunk](./readvaluechunk/) メソッドを実装しているかどうかを示す値を返します。 |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | このリーダーがエンティティを解析および解決できるかどうかを示す値を返します。 |
| virtual [get_Depth](./get_depth/)() | 派生クラスでオーバーライドされた場合、XML ドキュメント内の現在のノードの深さを取得します。 |
| virtual [get_EOF](./get_eof/)() | 派生クラスでオーバーライドされた場合、リーダーがストリームの末尾に位置しているかどうかを示す値を取得します。 |
| virtual [get_HasAttributes](./get_hasattributes/)() | 現在のノードに属性があるかどうかを示す値を返します。 |
| virtual [get_HasValue](./get_hasvalue/)() | 派生クラスでオーバーライドされた場合、現在のノードが [XmlReader::get_Value](./get_value/) の値を持つことができるかどうかを示す値を取得します。 |
| virtual [get_IsDefault](./get_isdefault/)() | 派生クラスでオーバーライドされた場合、現在のノードが DTD またはスキーマで定義されたデフォルト値から生成された属性かどうかを示す値を取得します。 |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | 派生クラスでオーバーライドされた場合、現在のノードが空要素かどうかを示す値を取得します（例: **<MyElement/>**）。 |
| virtual [get_LocalName](./get_localname/)() | 派生クラスでオーバーライドされた場合、現在のノードのローカル名を取得します。 |
| virtual [get_Name](./get_name/)() | 派生クラスでオーバーライドされた場合、現在のノードの修飾名を取得します。 |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | 派生クラスでオーバーライドされた場合、リーダーが位置しているノードの名前空間 URI（W3C 名前空間仕様で定義されているもの）を取得します。 |
| virtual [get_NameTable](./get_nametable/)() | 派生クラスでオーバーライドされた場合、この実装に関連付けられた [XmlNameTable](../xmlnametable/) を取得します。 |
| virtual [get_NodeType](./get_nodetype/)() | 派生クラスでオーバーライドされた場合、現在のノードの型を取得します。 |
| virtual [get_Prefix](./get_prefix/)() | 派生クラスでオーバーライドされた場合、現在のノードに関連付けられた名前空間プレフィックスを取得します。 |
| virtual [get_QuoteChar](./get_quotechar/)() | 派生クラスでオーバーライドされた場合、属性ノードの値を囲むために使用される引用符文字を取得します。 |
| virtual [get_ReadState](./get_readstate/)() | 派生クラスでオーバーライドされた場合、リーダーの状態を取得します。 |
| virtual [get_SchemaInfo](./get_schemainfo/)() | スキーマ検証の結果、現在のノードに割り当てられたスキーマ情報を返します。 |
| virtual [get_Settings](./get_settings/)() | この [XmlReader](./) インスタンスの作成に使用された [XmlReaderSettings](../xmlreadersettings/) オブジェクトを返します。 |
| virtual [get_Value](./get_value/)() | 派生クラスでオーバーライドされた場合、現在のノードのテキスト値を取得します。 |
| virtual [get_ValueType](./get_valuetype/)() | 現在のノードの型を返します。 |
| virtual [get_XmlLang](./get_xmllang/)() | 派生クラスでオーバーライドされた場合、現在の **xml:lang** スコープを取得します。 |
| virtual [get_XmlSpace](./get_xmlspace/)() | 派生クラスでオーバーライドされた場合、現在の **xml:space** スコープを取得します。 |
| virtual [GetAttribute](./getattribute/)(String) | 派生クラスでオーバーライドされた場合、指定された [XmlReader::get_Name](./get_name/) 値を持つ属性の値を取得します。 |
| virtual [GetAttribute](./getattribute/)(String, String) | 派生クラスでオーバーライドされた場合、指定された [XmlReader::get_LocalName](./get_localname/) と [XmlReader::get_NamespaceURI](./get_namespaceuri/) の値を持つ属性の値を取得します。 |
| virtual [GetAttribute](./getattribute/)(int32_t) | 派生クラスでオーバーライドされた場合、指定されたインデックスの属性の値を取得します。 |
| virtual [idx_get](./idx_get/)(int32_t) | 派生クラスでオーバーライドされた場合、指定されたインデックスの属性の値を取得します。 |
| virtual [idx_get](./idx_get/)(String) | 派生クラスでオーバーライドされた場合、指定された [XmlReader::get_Name](./get_name/) 値を持つ属性の値を取得します。 |
| virtual [idx_get](./idx_get/)(String, String) | 派生クラスでオーバーライドされた場合、指定された [XmlReader::get_LocalName](./get_localname/) と [XmlReader::get_NamespaceURI](./get_namespaceuri/) の値を持つ属性の値を取得します。 |
| static [IsName](./isname/)(const String\&) | 文字列引数が有効な XML 名かどうかを示す値を返します。 |
| static [IsNameToken](./isnametoken/)(const String\&) | 文字列引数が有効な XML 名トークンかどうかを示す値を返します。 |
| virtual [IsStartElement](./isstartelement/)() | [XmlReader::MoveToContent](./movetocontent/) を呼び出し、現在のコンテンツノードが開始タグまたは空要素タグかどうかをテストします。 |
| virtual [IsStartElement](./isstartelement/)(String) | [XmlReader::MoveToContent](./movetocontent/) を呼び出し、現在のコンテンツノードが開始タグまたは空要素タグであるか、さらに見つかった要素の [XmlReader::get_Name](./get_name/) 値が指定された引数と一致するかをテストします。 |
| virtual [IsStartElement](./isstartelement/)(String, String) | [XmlReader::MoveToContent](./movetocontent/) を呼び出し、現在のコンテンツノードが開始タグまたは空要素タグであるか、さらに見つかった要素の [XmlReader::get_LocalName](./get_localname/) と [XmlReader::get_NamespaceURI](./get_namespaceuri/) の値が指定された文字列と一致するかをテストします。 |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | 派生クラスでオーバーライドされた場合、現在の要素のスコープ内で名前空間プレフィックスを解決します。 |
| virtual [MoveToAttribute](./movetoattribute/)(String) | 派生クラスでオーバーライドされた場合、指定された [XmlReader::get_Name](./get_name/) 値を持つ属性へ移動します。 |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | 派生クラスでオーバーライドされた場合、指定された [XmlReader::get_LocalName](./get_localname/) と [XmlReader::get_NamespaceURI](./get_namespaceuri/) の値を持つ属性へ移動します。 |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | 派生クラスでオーバーライドされた場合、指定されたインデックスの属性へ移動します。 |
| virtual [MoveToContent](./movetocontent/)() | 現在のノードがコンテンツノード（空白以外のテキスト、**CDATA**、**Element**、**EndElement**、**EntityReference**、または **EndEntity**）かどうかをチェックします。ノードがコンテンツノードでない場合、リーダーは次のコンテンツノードまたはファイルの終端までスキップします。次のタイプのノードはスキップされます：**ProcessingInstruction**、**DocumentType**、**Comment**、**Whitespace**、または **SignificantWhitespace**。 |
| virtual [MoveToElement](./movetoelement/)() | 派生クラスでオーバーライドされた場合、現在の属性ノードを含む要素へ移動します。 |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | 派生クラスでオーバーライドされた場合、最初の属性に移動します。 |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | 派生クラスでオーバーライドされた場合、次の属性に移動します。 |
| virtual [Read](./read/)() | 派生クラスでオーバーライドされた場合、ストリームから次のノードを読み取ります。 |
| virtual [ReadAttributeValue](./readattributevalue/)() | 派生クラスでオーバーライドされた場合、属性値を1つ以上の **[Text](../../system.text/)**、**EntityReference**、または **EndEntity** ノードに解析します。 |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | 指定された型のオブジェクトとしてコンテンツを読み取ります。 |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 内容を読み取り、Base64 デコードされたバイナリバイトを返します。 |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 内容を読み取り、**BinHex** デコードされたバイナリバイトを返します。 |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | 現在位置のテキストコンテンツを [Boolean](../../system/boolean/) として読み取ります。 |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | 現在位置のテキストコンテンツを [DateTime](../../system/datetime/) オブジェクトとして読み取ります。 |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | 現在位置のテキストコンテンツを [DateTimeOffset](../../system/datetimeoffset/) オブジェクトとして読み取ります。 |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | 現在位置のテキストコンテンツを [Decimal](../../system/decimal/) オブジェクトとして読み取ります。 |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | 現在位置のテキストコンテンツを倍精度浮動小数点数として読み取ります。 |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | 現在位置のテキストコンテンツを単精度浮動小数点数として読み取ります。 |
| virtual [ReadContentAsInt](./readcontentasint/)() | 現在位置のテキストコンテンツを 32 ビット符号付き整数として読み取ります。 |
| virtual [ReadContentAsLong](./readcontentaslong/)() | 現在位置のテキストコンテンツを 64 ビット符号付き整数として読み取ります。 |
| virtual [ReadContentAsObject](./readcontentasobject/)() | 現在位置のテキストコンテンツを [Object](../../system/object/) として読み取ります。 |
| virtual [ReadContentAsString](./readcontentasstring/)() | 現在位置のテキストコンテンツを [String](../../system/string/) オブジェクトとして読み取ります。 |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | 要素のコンテンツを要求された型として読み取ります。 |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | 指定されたローカル名と名前空間 URI が現在の要素と一致することを確認し、次に要素のコンテンツを要求された型として読み取ります。 |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 要素を読み取り、**Base64** コンテンツをデコードします。 |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 要素を読み取り、**BinHex** コンテンツをデコードします。 |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | 現在の要素を読み取り、内容を [Boolean](../../system/boolean/) オブジェクトとして返します。 |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | 指定されたローカル名と名前空間 URI が現在の要素と一致することを確認し、次に現在の要素を読み取り、内容を [Boolean](../../system/boolean/) オブジェクトとして返します。 |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | 現在の要素を読み取り、内容を [DateTime](../../system/datetime/) オブジェクトとして返します。 |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | 指定されたローカル名と名前空間 URI が現在の要素と一致することを確認し、次に現在の要素を読み取り、内容を [DateTime](../../system/datetime/) オブジェクトとして返します。 |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | 現在の要素を読み取り、内容を [Decimal](../../system/decimal/) オブジェクトとして返します。 |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | 指定されたローカル名と名前空間 URI が現在の要素と一致することを確認し、次に現在の要素を読み取り、内容を [Decimal](../../system/decimal/) オブジェクトとして返します。 |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | 現在の要素を読み取り、内容を倍精度浮動小数点数として返します。 |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | 指定されたローカル名と名前空間URIが現在の要素と一致することを確認し、現在の要素を読み取り、その内容を倍精度浮動小数点数として返します。 |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | 現在の要素を読み取り、その内容を単精度浮動小数点数として返します。 |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | 指定されたローカル名と名前空間URIが現在の要素と一致することを確認し、現在の要素を読み取り、その内容を単精度浮動小数点数として返します。 |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | 現在の要素を読み取り、その内容を 32 ビット符号付き整数として返します。 |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | 指定されたローカル名と名前空間URIが現在の要素と一致することを確認し、現在の要素を読み取り、その内容を 32 ビット符号付き整数として返します。 |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | 現在の要素を読み取り、その内容を 64 ビット符号付き整数として返します。 |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | 指定されたローカル名と名前空間URIが現在の要素と一致することを確認し、現在の要素を読み取り、その内容を 64 ビット符号付き整数として返します。 |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | 現在の要素を読み取り、その内容を [Object](../../system/object/) として返します。 |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | 指定されたローカル名と名前空間URIが現在の要素と一致することを確認し、現在の要素を読み取り、その内容を [Object](../../system/object/) として返します。 |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | 現在の要素を読み取り、その内容を [String](../../system/string/) オブジェクトとして返します。 |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | 指定されたローカル名と名前空間URIが現在の要素と一致することを確認し、現在の要素を読み取り、その内容を [String](../../system/string/) オブジェクトとして返します。 |
| virtual [ReadElementString](./readelementstring/)() | テキストのみの要素を読み取ります。ただし、この操作をより簡潔に処理できるため、代わりに [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) メソッドの使用が推奨されます。 |
| virtual [ReadElementString](./readelementstring/)(String) | テキストのみの要素を読む前に、見つかった要素の [XmlReader::get_Name](./get_name/) の値が指定された文字列と一致することを確認します。ただし、この操作をより簡潔に処理できるため、代わりに [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) メソッドの使用が推奨されます。 |
| virtual [ReadElementString](./readelementstring/)(String, String) | テキストのみの要素を読む前に、見つかった要素の [XmlReader::get_LocalName](./get_localname/) と [XmlReader::get_NamespaceURI](./get_namespaceuri/) の値が指定された文字列と一致することを確認します。ただし、この操作をより簡潔に処理できるため、代わりに [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) メソッドの使用が推奨されます。 |
| virtual [ReadEndElement](./readendelement/)() | 現在のコンテンツノードが終了タグであることを確認し、リーダーを次のノードへ進めます。 |
| virtual [ReadInnerXml](./readinnerxml/)() | 派生クラスでオーバーライドされた場合、マークアップを含むすべてのコンテンツを文字列として読み取ります。 |
| virtual [ReadOuterXml](./readouterxml/)() | 派生クラスでオーバーライドされた場合、このノードとそのすべての子ノードを表すコンテンツをマークアップを含めて読み取ります。 |
| virtual [ReadStartElement](./readstartelement/)() | 現在のノードが要素であることを確認し、リーダーを次のノードへ進めます。 |
| virtual [ReadStartElement](./readstartelement/)(String) | 現在のコンテンツノードが指定された [XmlReader::get_Name](./get_name/) の値を持つ要素であることを確認し、リーダーを次のノードへ進めます。 |
| virtual [ReadStartElement](./readstartelement/)(String, String) | 現在のコンテンツノードが指定された [XmlReader::get_LocalName](./get_localname/) と [XmlReader::get_NamespaceURI](./get_namespaceuri/) の値を持つ要素であることを確認し、リーダーを次のノードへ進めます。 |
| virtual [ReadString](./readstring/)() | 派生クラスでオーバーライドされた場合、要素またはテキストノードの内容を文字列として読み取ります。ただし、この操作をより簡潔に処理できるため、代わりに [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) メソッドの使用が推奨されます。 |
| virtual [ReadSubtree](./readsubtree/)() | 現在のノードとそのすべての子孫を読み取るために使用できる新しい [XmlReader](./) インスタンスを返します。 |
| virtual [ReadToDescendant](./readtodescendant/)(String) | [XmlReader](./) を、指定された修飾名を持つ次の子孫要素へ進めます。 |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | [XmlReader](./) を、指定されたローカル名と名前空間URIを持つ次の子孫要素へ進めます。 |
| virtual [ReadToFollowing](./readtofollowing/)(String) | 指定された修飾名を持つ要素が見つかるまで読み取ります。 |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | 指定されたローカル名と名前空間 URI を持つ要素が見つかるまで読み取ります。 |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | 指定された修飾名を持つ次の兄弟要素へ [XmlReader](./) を進めます。 |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | 指定されたローカル名と名前空間 URI を持つ次の兄弟要素へ [XmlReader](./) を進めます。 |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | XML ドキュメントに埋め込まれた大きなテキストストリームを読み取ります。 |
| virtual [ResolveEntity](./resolveentity/)() | 派生クラスでオーバーライドされた場合、**EntityReference** ノードのエンティティ参照を解決します。 |
| virtual [Skip](./skip/)() | 現在のノードの子ノードをスキップします。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
