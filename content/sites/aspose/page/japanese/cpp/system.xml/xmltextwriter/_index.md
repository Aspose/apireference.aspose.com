---
title: "System::Xml::XmlTextWriter クラス"
linktitle: "XmlTextWriter"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextWriter クラス。C++ において、W3C 拡張マークアップ言語 (XML) 1.0 および XML 名前空間の勧告に準拠した XML データを含むストリームまたはファイルを高速かつ非キャッシュ、前方のみで生成するライターを表します。"
type: docs
weight: 4000
url: /ja/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


W3C Extensible Markup Language (XML) 1.0 および Namespaces in XML の勧告に準拠した XML データを含むストリームまたはファイルを生成する高速でキャッシュされていない前方のみの方法を提供するライターを表します。

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() override | このストリームと基になるストリームを閉じます。 |
| [Flush](./flush/)() override | バッファ内の内容を基になるストリームにフラッシュし、さらに基になるストリームもフラッシュします。 |
| [get_BaseStream](./get_basestream/)() | 基になるストリームオブジェクトを返します。 |
| [get_Formatting](./get_formatting/)() | 出力の書式設定方法を示します。 |
| [get_Indentation](./get_indentation/)() | 階層の各レベルで書き込む IndentChars の数を、[XmlTextWriter::set_Formatting](./set_formatting/) が [Formatting::Indented](../formatting/) に設定されている場合に返します。 |
| [get_IndentChar](./get_indentchar/)() | [XmlTextWriter::set_Formatting](./set_formatting/) が [Formatting::Indented](../formatting/) に設定されている場合に、インデントに使用する文字を返します。 |
| [get_Namespaces](./get_namespaces/)() | 名前空間サポートを行うかどうかを示す値を返します。 |
| [get_QuoteChar](./get_quotechar/)() | 属性値を引用する際に使用する文字を返します。 |
| [get_WriteState](./get_writestate/)() override | ライターの状態を返します。 |
| [get_XmlLang](./get_xmllang/)() override | 現在の **xml:lang** スコープを返します。 |
| [get_XmlSpace](./get_xmlspace/)() override | 現在の **xml:space** スコープを表す [XmlSpace](../xmlspace/) を返します。 |
| [LookupPrefix](./lookupprefix/)(String) override | 名前空間 URI に対して、現在の名前空間スコープで定義されている最も近いプレフィックスを返します。 |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | 出力の書式設定方法を示します。 |
| [set_Indentation](./set_indentation/)(int32_t) | [XmlTextWriter::set_Formatting](./set_formatting/) が [Formatting::Indented](../formatting/) に設定されている場合に、階層の各レベルで書き込む IndentChars の数を設定します。 |
| [set_IndentChar](./set_indentchar/)(char16_t) | [XmlTextWriter::set_Formatting](./set_formatting/) が [Formatting::Indented](../formatting/) に設定されている場合に、インデントに使用する文字を設定します。 |
| [set_Namespaces](./set_namespaces/)(bool) | 名前空間サポートを行うかどうかを示す値を設定します。 |
| [set_QuoteChar](./set_quotechar/)(char16_t) | 属性値を引用する際に使用する文字を設定します。 |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 指定されたバイナリバイトを base64 としてエンコードし、結果のテキストを書き出します。 |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | 指定されたバイナリバイトを binhex としてエンコードし、結果のテキストを書き出します。 |
| [WriteCData](./writecdata/)(String) override | 指定されたテキストを含む **...** ブロックを書き出します。 |
| [WriteCharEntity](./writecharentity/)(char16_t) override | 指定された Unicode 文字値の文字エンティティ生成を強制します。 |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | テキストをバッファ単位で順に書き込みます。 |
| [WriteComment](./writecomment/)(String) override | 指定されたテキストを含むコメント **** を書き出します。 |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | 指定された名前とオプションの属性を使用して DOCTYPE 宣言を書き出します。 |
| [WriteEndAttribute](./writeendattribute/)() override | 前の [XmlTextWriter::WriteStartAttribute](./writestartattribute/) 呼び出しを閉じます。 |
| [WriteEndDocument](./writeenddocument/)() override | 開いている要素や属性をすべて閉じ、ライターを開始状態に戻します。 |
| [WriteEndElement](./writeendelement/)() override | 1 つの要素を閉じ、対応する名前空間スコープをポップします。 |
| [WriteEntityRef](./writeentityref/)(const String\&) override | エンティティ参照を **&name**; として書き出します。 |
| [WriteFullEndElement](./writefullendelement/)() override | 1 つの要素を閉じ、対応する名前空間スコープをポップします。 |
| [WriteName](./writename/)(const String\&) override | 指定された名前を書き出し、[W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) に従って有効な名前であることを保証します。 |
| [WriteNmToken](./writenmtoken/)(const String\&) override | 指定された名前を書き出し、[W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) に従って有効な **NmToken** であることを保証します。 |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | 名前とテキストの間にスペースを入れた処理命令を次のように書き出します: **<?name text?>**。 |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | 名前空間で修飾された名前を書き出します。このメソッドは、指定された名前空間に対してスコープ内のプレフィックスを検索します。 |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | 文字バッファから生のマークアップを手動で書き出します。 |
| [WriteRaw](./writeraw/)(const String\&) override | 文字列から生のマークアップを手動で書き出します。 |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | 属性の開始を書き出します。 |
| [WriteStartDocument](./writestartdocument/)() override | バージョン \"1.0\" の XML 宣言を書き出します。 |
| [WriteStartDocument](./writestartdocument/)(bool) override | バージョン \"1.0\" とスタンドアロン属性を含む XML 宣言を書き出します。 |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | 指定された開始タグを書き出し、指定された名前空間とプレフィックスに関連付けます。 |
| [WriteString](./writestring/)(const String\&) override | 指定されたテキストコンテンツを書き出します。 |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | サロゲート文字ペアのサロゲート文字エンティティを生成して書き出します。 |
| [WriteWhitespace](./writewhitespace/)(String) override | 指定された空白を書き出します。 |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | 指定されたストリームとエンコーディングを使用して、[XmlTextWriter](./) クラスのインスタンスを作成します。 |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | 指定されたファイルを使用して、[XmlTextWriter](./) クラスのインスタンスを作成します。 |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | 指定された TextWriter を使用して、[XmlTextWriter](./) クラスのインスタンスを作成します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



代わりに [XmlWriter](../xmlwriter/) クラスを使用することが推奨されます。

このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
