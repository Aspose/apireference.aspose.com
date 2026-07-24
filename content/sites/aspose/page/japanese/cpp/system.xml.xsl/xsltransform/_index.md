---
title: "System::Xml::Xsl::XslTransform クラス"
linktitle: "XslTransform"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XslTransform クラス。C++ で拡張可能スタイルシート言語（XSLT）スタイルシートを使用して XML データを変換します。"
type: docs
weight: 700
url: /ja/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


拡張スタイルシート言語 for Transformations (XSLT) スタイルシートを使用して XML データを変換します。

```cpp
class XslTransform : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/) に含まれる XSLT スタイルシートを読み込みます。 |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/) に含まれる XSLT スタイルシートを読み込みます。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | IXPathNavigable に含まれる XSLT スタイルシートを読み込みます。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | IXPathNavigable に含まれる XSLT スタイルシートを読み込みます。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | XPathNavigator に含まれる XSLT スタイルシートを読み込みます。 |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XPathNavigator に含まれる XSLT スタイルシートを読み込みます。 |
| [Load](./load/)(const String\&) | URL で指定された XSLT スタイルシートを読み込みます。 |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | URL で指定された XSLT スタイルシートを読み込みます。 |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XslTransform::Transform](./transform/) メソッドが呼び出されたときに外部リソースを解決するために使用される [XmlResolver](../../system.xml/xmlresolver/) を設定します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 指定された **args** を使用して XPathNavigator の XML データを変換し、結果を [XmlReader](../../system.xml/xmlreader/) に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | 指定された **args** を使用して XPathNavigator の XML データを変換し、結果を [XmlReader](../../system.xml/xmlreader/) に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 指定された args を使用して XPathNavigator の XML データを変換し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | 指定された args を使用して XPathNavigator の XML データを変換し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 指定された **args** を使用して XPathNavigator の XML データを変換し、結果を Stream に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | 指定された **args** を使用して XPathNavigator の XML データを変換し、結果を Stream に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 指定された **args** を使用して XPathNavigator の XML データを変換し、結果を TextWriter に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | 指定された **args** を使用して XPathNavigator の XML データを変換し、結果を TextWriter に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を [XmlReader](../../system.xml/xmlreader/) に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | 指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を [XmlReader](../../system.xml/xmlreader/) に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を TextWriter に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | 指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を TextWriter に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を Stream に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | 指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を Stream に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | 指定された **args** を使用して IXPathNavigable の XML データを変換し、結果を [XmlWriter](../../system.xml/xmlwriter/) に出力します。 |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 入力ファイルの XML データを変換し、結果を出力ファイルに書き込みます。 |
| [Transform](./transform/)(const String\&, const String\&) | 入力ファイルの XML データを変換し、結果を出力ファイルに書き込みます。 |
| [XslTransform](./xsltransform/)() | [XslTransform](./) クラスの新しいインスタンスを初期化します。 |
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
