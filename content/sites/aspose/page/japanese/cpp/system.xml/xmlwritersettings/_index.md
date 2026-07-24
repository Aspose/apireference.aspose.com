---
title: "System::Xml::XmlWriterSettings class"
linktitle: "XmlWriterSettings"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlWriterSettings クラス。C++ の XmlWriter::Create メソッドで作成された XmlWriter オブジェクトでサポートする機能のセットを指定します。"
type: docs
weight: 4500
url: /ja/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


[XmlWriter](../xmlwriter/) オブジェクトが [XmlWriter::Create](../xmlwriter/create/) メソッドで作成された際にサポートする機能のセットを指定します。

```cpp
class XmlWriterSettings : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() | [XmlWriterSettings](./) インスタンスのコピーを作成します。 |
| [get_CheckCharacters](./get_checkcharacters/)() | ドキュメント内のすべての文字が W3C の [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets) の「2.2 Characters」セクションに準拠しているかを XML ライターがチェックすべきかどうかを示す値を返します。 |
| [get_CloseOutput](./get_closeoutput/)() | [XmlWriter](../xmlwriter/) が [XmlWriter::Close](../xmlwriter/close/) メソッド呼び出し時に基になるストリームまたは TextWriter も閉じるべきかどうかを示す値を返します。 |
| [get_ConformanceLevel](./get_conformancelevel/)() | XML ライターが XML 出力に対してチェックする準拠レベルを返します。 |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | [XmlWriter](../xmlwriter/) が URI 属性をエスケープしないかどうかを示す値を返します。 |
| [get_Encoding](./get_encoding/)() | 使用するテキストエンコーディングの種類を返します。 |
| [get_Indent](./get_indent/)() | 要素をインデントするかどうかを示す値を返します。 |
| [get_IndentChars](./get_indentchars/)() | インデント時に使用する文字列を返します。この設定は [XmlWriterSettings::set_Indent](./set_indent/) の値が **true** に設定されている場合に使用されます。 |
| [get_NamespaceHandling](./get_namespacehandling/)() | [XmlWriter](../xmlwriter/) が XML コンテンツを書き込む際に重複した名前空間宣言を削除すべきかどうかを示す値を返します。デフォルトの動作は、ライターが名前空間リゾルバーに存在するすべての名前空間宣言を出力することです。 |
| [get_NewLineChars](./get_newlinechars/)() | 改行に使用する文字列を返します。 |
| [get_NewLineHandling](./get_newlinehandling/)() | 出力の改行を正規化するかどうかを示す値を返します。 |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | 属性を新しい行に書き込むかどうかを示す値を返します。 |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | XML 宣言を省略するかどうかを示す値を返します。 |
| [get_OutputMethod](./get_outputmethod/)() | [XmlWriter](../xmlwriter/) の出力をシリアライズする際に使用される方法を返します。 |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | [XmlWriter](../xmlwriter/) が [XmlWriter::Close](../xmlwriter/close/) メソッド呼び出し時に、未閉じの要素タグすべてに閉じタグを追加するかどうかを示す値を返します。 |
| [Reset](./reset/)() | 設定クラスのメンバーをデフォルト値にリセットします。 |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | XML ライターがドキュメント内のすべての文字が W3C の [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets) の「2.2 Characters」セクションに準拠しているかをチェックすべきかどうかを示す値を設定します。 |
| [set_CloseOutput](./set_closeoutput/)(bool) | [XmlWriter](../xmlwriter/) が [XmlWriter::Close](../xmlwriter/close/) メソッド呼び出し時に基になるストリームまたは TextWriter も閉じるべきかどうかを示す値を設定します。 |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | XML ライターが XML 出力に対してチェックする準拠レベルを設定します。 |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | [XmlWriter](../xmlwriter/) が URI 属性をエスケープしないかどうかを示す値を設定します。 |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | 使用するテキストエンコーディングの種類を設定します。 |
| [set_Indent](./set_indent/)(bool) | 要素をインデントするかどうかを示す値を設定します。 |
| [set_IndentChars](./set_indentchars/)(const String\&) | インデント時に使用する文字列を設定します。この設定は、[XmlWriterSettings::set_Indent](./set_indent/) の値が **true** に設定されている場合に使用されます。 |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | XML コンテンツを書き込む際に、[XmlWriter](../xmlwriter/) が重複した名前空間宣言を削除すべきかどうかを示す値を設定します。デフォルトの動作は、ライターの名前空間リゾルバーに存在するすべての名前空間宣言を出力することです。 |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | 改行に使用する文字列を設定します。 |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | 出力の改行を正規化するかどうかを示す値を設定します。 |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | 属性を新しい行に書き込むかどうかを示す値を設定します。 |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | XML 宣言を省略するかどうかを示す値を設定します。 |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | [XmlWriter](../xmlwriter/) が [XmlWriter::Close](../xmlwriter/close/) メソッドが呼び出されたときに、未閉じの要素タグすべてに閉じタグを追加するかどうかを示す値を設定します。 |
| [XmlWriterSettings](./xmlwritersettings/)() | [XmlWriterSettings](./) クラスの新しいインスタンスを初期化します。 |
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
