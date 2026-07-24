---
title: "System::Xml::Schema::XmlSchemaValidator クラス"
linktitle: "XmlSchemaValidator"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator クラス。XML Schema Definition Language (XSD) スキーマ検証エンジンを表します。XmlSchemaValidator クラスは C++ では継承できません。"
type: docs
weight: 7000
url: /ja/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


XML [Schema](../) Definition Language (XSD) [Schema](../) 検証エンジンを表します。[XmlSchemaValidator](./) クラスは継承できません。

```cpp
class XmlSchemaValidator : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | 検証に使用されるスキーマセットに、XML [Schema](../) Definition Language (XSD) スキーマを追加します。 |
| [EndValidation](./endvalidation/)() | 検証を終了し、XML ドキュメント全体の同一性制約をチェックします。 |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | 検証中のXMLノードの行番号情報を返します。 |
| [get_SourceUri](./get_sourceuri/)() | 検証中のXMLノードのソースURIを返します。 |
| [get_ValidationEventSender](./get_validationeventsender/)() | 検証イベントの送信者オブジェクトとして送信されたオブジェクトを返します。 |
| [GetExpectedAttributes](./getexpectedattributes/)() | 現在の要素コンテキストに対して期待される属性を返します。 |
| [GetExpectedParticles](./getexpectedparticles/)() | 現在の要素コンテキストにおける期待されるパーティクルを返します。 |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | 要素コンテキストで、デフォルト属性に対する同一性制約を検証し、[XmlSchemaAttribute](../xmlschemaattribute/) オブジェクトで指定された List を、以前に [XmlSchemaValidator::ValidateAttribute](./validateattribute/) メソッドを使用して検証されていないデフォルト値を持つ属性に対して追加します。 |
| [Initialize](./initialize/)() | [XmlSchemaValidator](./) オブジェクトの状態を初期化します。 |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | 部分検証用に指定された [XmlSchemaObject](../xmlschemaobject/) を使用して、[XmlSchemaValidator](./) オブジェクトの状態を初期化します。 |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | 検証中の XML ノードの行番号情報を設定します。 |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | 検証中の XML ノードのソース URI を設定します。 |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | 検証イベントの送信者オブジェクトとして送信されるオブジェクトを設定します。 |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlResolver](../../system.xml/xmlresolver/) オブジェクトを設定し、**xs:import** および **xs:include** 要素、さらに **xsi:schemaLocation** と **xsi:noNamespaceSchemaLocation** 属性の解決に使用します。 |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | 現在の要素コンテンツの検証をスキップし、親要素のコンテキストでコンテンツを検証できるように [XmlSchemaValidator](./) オブジェクトを準備します。 |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | 現在の要素コンテキストで属性名、名前空間 URI、値を検証します。 |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | 現在の要素コンテキストで属性名、名前空間 URI、値を検証します。 |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | 現在のコンテキストで要素を検証します。 |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | 現在のコンテキストで、指定された **xsi:Type**、**xsi:Nil**、**xsi:SchemaLocation**、および **xsi:NoNamespaceSchemaLocation** 属性値を使用して要素を検証します。 |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | 単純コンテンツを持つ要素については、要素のテキスト内容がそのデータ型に従って有効かどうかを検証し、複合コンテンツを持つ要素については、現在の要素の内容が完全であるかどうかを検証します。 |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | 指定された要素のテキスト内容がそのデータ型に従って有効かどうかを検証します。 |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | 要素コンテキスト内のすべての必須属性が存在するかを検証し、要素の子コンテンツを検証できるように [XmlSchemaValidator](./) オブジェクトを準備します。 |
| [ValidateText](./validatetext/)(const String\&) | 指定されたテキスト **string** が現在の要素コンテキストで許可されているかを検証し、現在の要素が単純コンテンツを持つ場合は検証のためにテキストを蓄積します。 |
| [ValidateText](./validatetext/)(XmlValueGetter) | 指定された [XmlValueGetter](../xmlvaluegetter/) オブジェクトが返すテキストが現在の要素コンテキストで許可されているかを検証し、現在の要素が単純コンテンツを持つ場合は検証のためにテキストを蓄積します。 |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | 指定された **string** の空白が現在の要素コンテキストで許可されているかを検証し、現在の要素が単純コンテンツを持つ場合は検証のために空白を蓄積します。 |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | 指定された [XmlValueGetter](../xmlvaluegetter/) オブジェクトが返す空白が現在の要素コンテキストで許可されているかを検証し、現在の要素が単純コンテンツを持つ場合は検証のために空白を蓄積します。 |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | [XmlSchemaValidator](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
