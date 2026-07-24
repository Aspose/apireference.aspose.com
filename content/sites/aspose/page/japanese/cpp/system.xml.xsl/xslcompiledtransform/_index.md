---
title: "System::Xml::Xsl::XslCompiledTransform class"
linktitle: "XslCompiledTransform"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XslCompiledTransform クラス。C++ で XSLT スタイルシートを使用して XML データを変換します。"
type: docs
weight: 300
url: /ja/cpp/system.xml.xsl/xslcompiledtransform/
---
## XslCompiledTransform class


XSLT スタイルシートを使用して XML データを変換します。

```cpp
class XslCompiledTransform : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_OutputSettings](./get_outputsettings/)() | スタイルシートの **xsl:output** 要素から派生した出力情報を含む [XmlWriterSettings](../../system.xml/xmlwritersettings/) オブジェクトを返します。 |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/) に含まれるスタイルシートをコンパイルします。 |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/) に含まれる XSLT スタイルシートをコンパイルします。[XmlResolver](../../system.xml/xmlresolver/) は XSLT の **import** または **include** 要素を解決し、XSLT 設定はスタイルシートの権限を決定します。 |
| [Load](./load/)(const String\&) | 指定された URI にあるスタイルシートを読み込み、コンパイルします。 |
| [Load](./load/)(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | URI で指定された XSLT スタイルシートを読み込み、コンパイルします。[XmlResolver](../../system.xml/xmlresolver/) は XSLT の **import** または **include** 要素を解決し、XSLT 設定はスタイルシートの権限を決定します。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | IXPathNavigable オブジェクトに含まれるスタイルシートをコンパイルします。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) | IXPathNavigable に含まれる XSLT スタイルシートをコンパイルします。 [XmlResolver](../../system.xml/xmlresolver/) は任意の XSLT **import** または **include** 要素を解決し、XSLT 設定はスタイルシートの権限を決定します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) | IXPathNavigable オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | IXPathNavigable オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 [XsltArgumentList](../xsltargumentlist/) は追加の実行時引数を提供します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | IXPathNavigable オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を TextWriter に出力します。 [XsltArgumentList](../xsltargumentlist/) は追加の実行時引数を提供します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | IXPathNavigable オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果をストリームに出力します。 [XsltArgumentList](../xsltargumentlist/) は追加の実行時引数を提供します。 |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) | [XmlReader](../../system.xml/xmlreader/) オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | [XmlReader](../../system.xml/xmlreader/) オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 [XsltArgumentList](../xsltargumentlist/) は追加の実行時引数を提供します。 |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | [XmlReader](../../system.xml/xmlreader/) オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を TextWriter に出力します。 [XsltArgumentList](../xsltargumentlist/) は追加の実行時引数を提供します。 |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | [XmlReader](../../system.xml/xmlreader/) オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果をストリームに出力します。 [XsltArgumentList](../xsltargumentlist/) は追加の実行時引数を提供します。 |
| [Transform](./transform/)(const String\&, const SharedPtr\<XmlWriter\>\&) | URI で指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | URI で指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 [XsltArgumentList](../xsltargumentlist/) は追加の実行時引数を提供します。 |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | URI で指定された入力ドキュメントを使用して変換を実行し、結果を TextWriter に出力します。 |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | URI で指定された入力ドキュメントを使用して変換を実行し、結果をストリームに出力します。 [XsltArgumentList](../xsltargumentlist/) は追加の実行時引数を提供します。 |
| [Transform](./transform/)(const String\&, const String\&) | URI で指定された入力ドキュメントを使用して変換を実行し、結果をファイルに出力します。 |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/) オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 [XsltArgumentList](../xsltargumentlist/) は追加の実行時引数を提供し、[XmlResolver](../../system.xml/xmlresolver/) は XSLT **document()** 関数を解決します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | IXPathNavigable オブジェクトで指定された入力ドキュメントを使用して変換を実行し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 [XsltArgumentList](../xsltargumentlist/) は追加の実行時引数を提供し、[XmlResolver](../../system.xml/xmlresolver/) は XSLT **document()** 関数を解決します。 |
| [XslCompiledTransform](./xslcompiledtransform/)() | [XslCompiledTransform](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
