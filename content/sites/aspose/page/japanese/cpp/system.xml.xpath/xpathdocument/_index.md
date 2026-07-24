---
title: "System::Xml::XPath::XPathDocument クラス"
linktitle: "XPathDocument"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathDocument クラス。C++ の XPath データモデルを使用して、XML ドキュメントの高速で読み取り専用のインメモリ表現を提供します。"
type: docs
weight: 200
url: /ja/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


[XPath](../) データモデルを使用して、XML ドキュメントの高速で読み取り専用のインメモリ表現を提供します。

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | この [XPathDocument](./) のノードをナビゲートするための、読み取り専用の [XPathNavigator](../xpathnavigator/) オブジェクトを初期化します。 |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | 指定された [XmlReader](../../system.xml/xmlreader/) オブジェクトに含まれる XML データから、[XPathDocument](./) クラスの新しいインスタンスを初期化します。 |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | 指定された空白処理を使用して、指定された [XmlReader](../../system.xml/xmlreader/) オブジェクトに含まれる XML データから、[XPathDocument](./) クラスの新しいインスタンスを初期化します。 |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | 指定された TextReader オブジェクトに含まれる XML データから、[XPathDocument](./) クラスの新しいインスタンスを初期化します。 |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | 指定された Stream オブジェクトの XML データから、[XPathDocument](./) クラスの新しいインスタンスを初期化します。 |
| [XPathDocument](./xpathdocument/)(const String\&) | 指定されたファイルの XML データから、[XPathDocument](./) クラスの新しいインスタンスを初期化します。 |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | 指定された空白処理を使用して、指定されたファイルの XML データから、[XPathDocument](./) クラスの新しいインスタンスを初期化します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 備考



このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

## 参照

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
