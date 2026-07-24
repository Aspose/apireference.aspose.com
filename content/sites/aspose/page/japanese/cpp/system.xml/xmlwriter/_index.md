---
title: "System::Xml::XmlWriter クラス"
linktitle: "XmlWriter"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlWriter クラス。C++ で XML データを含むストリームまたはファイルを生成するための、高速でキャッシュされない、前方のみの方式を提供するライターを表します。"
type: docs
weight: 4400
url: /ja/cpp/system.xml/xmlwriter/
---
## XmlWriter class


XML データを含むストリームまたはファイルを生成する高速でキャッシュされていない前方のみの方法を提供するライターを表します。

```cpp
class XmlWriter : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Close](./close/)() | 派生クラスでオーバーライドされた場合、このストリームと基になるストリームを閉じます。 |
| static [Create](./create/)(const String\&) | 指定されたファイル名を使用して新しい [XmlWriter](./) インスタンスを作成します。 |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | ファイル名と [XmlWriterSettings](../xmlwritersettings/) オブジェクトを使用して新しい [XmlWriter](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | 指定されたストリームを使用して新しい [XmlWriter](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | ストリームと [XmlWriterSettings](../xmlwritersettings/) オブジェクトを使用して新しい [XmlWriter](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | 指定された TextWriter を使用して新しい [XmlWriter](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | TextWriter と [XmlWriterSettings](../xmlwritersettings/) オブジェクトを使用して新しい [XmlWriter](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | 指定された [Text::StringBuilder](../../system.text/stringbuilder/) を使用して新しい [XmlWriter](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | [Text::StringBuilder](../../system.text/stringbuilder/) と [XmlWriterSettings](../xmlwritersettings/) オブジェクトを使用して新しい [XmlWriter](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | 指定された [XmlWriter](./) オブジェクトを使用して新しい [XmlWriter](./) インスタンスを作成します。 |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | 指定された [XmlWriter](./) と [XmlWriterSettings](../xmlwritersettings/) オブジェクトを使用して新しい [XmlWriter](./) インスタンスを作成します。 |
| [Dispose](./dispose/)() override | 現在の [XmlWriter](./) クラスのインスタンスが使用しているすべてのリソースを解放します。 |
| virtual [Flush](./flush/)() | 派生クラスでオーバーライドされた場合、バッファ内の内容を基になるストリームにフラッシュし、さらに基になるストリームもフラッシュします。 |
| virtual [get_Settings](./get_settings/)() | この [XmlWriter](./) インスタンスの作成に使用された [XmlWriterSettings](../xmlwritersettings/) オブジェクトを返します。 |
| virtual [get_WriteState](./get_writestate/)() | 派生クラスでオーバーライドされた場合、ライターの状態を取得します。 |
| virtual [get_XmlLang](./get_xmllang/)() | 派生クラスでオーバーライドされた場合、現在の **xml:lang** スコープを取得します。 |
| virtual [get_XmlSpace](./get_xmlspace/)() | 派生クラスでオーバーライドされた場合、現在の **xml:space** スコープを表す [XmlSpace](../xmlspace/) を取得します。 |
| virtual [LookupPrefix](./lookupprefix/)(String) | 派生クラスでオーバーライドされた場合、現在の名前空間スコープで名前空間 URI に対して定義された最も近いプレフィックスを返します。 |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | 派生クラスでオーバーライドされた場合、[XmlReader](../xmlreader/) の現在位置で見つかったすべての属性を書き出します。 |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | 派生クラスでオーバーライドされた場合、指定されたローカル名、名前空間 URI、値を持つ属性を書き込みます。 |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | 派生クラスでオーバーライドされた場合、指定されたローカル名と値を持つ属性を書き出します。 |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | 派生クラスでオーバーライドされた場合、指定されたプレフィックス、ローカル名、名前空間 URI、値を持つ属性を書き出します。 |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 派生クラスでオーバーライドされた場合、指定されたバイナリバイト列を Base64 としてエンコードし、結果のテキストを書き出します。 |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | 派生クラスでオーバーライドされた場合、指定されたバイナリバイト列を **BinHex** としてエンコードし、結果のテキストを書き出します。 |
| virtual [WriteCData](./writecdata/)(String) | 派生クラスでオーバーライドされた場合、指定されたテキストを含む **...** ブロックを書き出します。 |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | 派生クラスでオーバーライドされた場合、指定された Unicode 文字値の文字エンティティの生成を強制します。 |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | 派生クラスでオーバーライドされた場合、テキストをバッファ単位で書き込みます。 |
| virtual [WriteComment](./writecomment/)(String) | 派生クラスでオーバーライドされた場合、指定されたテキストを含むコメント **** を書き出します。 |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | 派生クラスでオーバーライドされた場合、指定された名前とオプションの属性を使用して DOCTYPE 宣言を書き出します。 |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | 指定されたローカル名と値で要素を書き込みます。 |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | 指定されたローカル名、名前空間 URI、値で要素を書き込みます。 |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | 指定されたプレフィックス、ローカル名、名前空間 URI、値で要素を書き込みます。 |
| virtual [WriteEndAttribute](./writeendattribute/)() | 派生クラスでオーバーライドされた場合、前の XmlWriter::WriteStartAttribute(String,String) 呼び出しを閉じます。 |
| virtual [WriteEndDocument](./writeenddocument/)() | 派生クラスでオーバーライドされた場合、開いている要素や属性をすべて閉じ、ライターを開始状態に戻します。 |
| virtual [WriteEndElement](./writeendelement/)() | 派生クラスでオーバーライドされた場合、1 つの要素を閉じ、対応する名前空間スコープをポップします。 |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | 派生クラスでオーバーライドされた場合、エンティティ参照を **&name**; として書き出します。 |
| virtual [WriteFullEndElement](./writefullendelement/)() | 派生クラスでオーバーライドされた場合、1 つの要素を閉じ、対応する名前空間スコープをポップします。 |
| virtual [WriteName](./writename/)(const String\&) | 派生クラスでオーバーライドされた場合、指定された名前を書き出し、W3C XML 1.0 勧告に従って有効な名前であることを確認します（[https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)）。 |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | 派生クラスでオーバーライドされた場合、指定された名前を書き出し、W3C XML 1.0 勧告に従って有効な NmToken であることを確認します（[https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)）。 |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | 派生クラスでオーバーライドされた場合、リーダーからライターへすべてをコピーし、リーダーを次の兄弟要素の開始位置へ移動させます。 |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | XPathNavigator オブジェクトからライターへすべてをコピーします。XPathNavigator の位置は変更されません。 |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | 派生クラスでオーバーライドされた場合、名前とテキストの間にスペースを入れた処理命令を書き出します。例: **<?name text?>**。 |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | 派生クラスでオーバーライドされた場合、名前空間で修飾された名前を書き出します。このメソッドは、指定された名前空間に対して有効なプレフィックスを検索します。 |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | 派生クラスでオーバーライドされた場合、文字バッファから生のマークアップを手動で書き出します。 |
| virtual [WriteRaw](./writeraw/)(const String\&) | 派生クラスでオーバーライドされた場合、文字列から生のマークアップを手動で書き出します。 |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | 指定されたローカル名と名前空間 URI で属性の開始を書き込みます。 |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | 派生クラスでオーバーライドされた場合、指定されたプレフィックス、ローカル名、名前空間 URI で属性の開始を書き込みます。 |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | 指定されたローカル名で属性の開始を書き込みます。 |
| virtual [WriteStartDocument](./writestartdocument/)() | 派生クラスでオーバーライドされた場合、バージョン "1.0" の XML 宣言を書き込みます。 |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | 派生クラスでオーバーライドされた場合、バージョン "1.0" とスタンドアロン属性を含む XML 宣言を書き込みます。 |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | 派生クラスでオーバーライドされた場合、指定された開始タグを書き込み、指定された名前空間に関連付けます。 |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | 派生クラスでオーバーライドされた場合、指定された開始タグを書き込み、指定された名前空間とプレフィックスに関連付けます。 |
| [WriteStartElement](./writestartelement/)(const String\&) | 派生クラスでオーバーライドされた場合、指定されたローカル名の開始タグを書き出します。 |
| virtual [WriteString](./writestring/)(const String\&) | 派生クラスでオーバーライドされた場合、指定されたテキストコンテンツを書き込みます。 |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | 派生クラスでオーバーライドされた場合、サロゲート文字ペアのサロゲート文字エンティティを生成して書き込みます。 |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | オブジェクトの値を書き込みます。 |
| virtual [WriteValue](./writevalue/)(const String\&) | [String](../../system/string/) の値を書き込みます。 |
| virtual [WriteValue](./writevalue/)(bool) | [Boolean](../../system/boolean/) の値を書き込みます。 |
| virtual [WriteValue](./writevalue/)(DateTime) | [DateTime](../../system/datetime/) の値を書き込みます。 |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | [DateTimeOffset](../../system/datetimeoffset/) の値を書き込みます。 |
| virtual [WriteValue](./writevalue/)(double) | [Double](../../system/double/) の値を書き込みます。 |
| virtual [WriteValue](./writevalue/)(float) | 単精度浮動小数点数を書き込みます。 |
| virtual [WriteValue](./writevalue/)(Decimal) | [Decimal](../../system/decimal/) の値を書き込みます。 |
| virtual [WriteValue](./writevalue/)(int32_t) | [Int32](../../system/int32/) の値を書き込みます。 |
| virtual [WriteValue](./writevalue/)(int64_t) | [Int64](../../system/int64/) の値を書き込みます。 |
| virtual [WriteWhitespace](./writewhitespace/)(String) | 派生クラスでオーバーライドされた場合、指定された空白文字を書き出します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
