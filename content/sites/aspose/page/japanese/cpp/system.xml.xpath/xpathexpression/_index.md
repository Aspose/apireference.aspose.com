---
title: "System::Xml::XPath::XPathExpression クラス"
linktitle: "XPathExpression"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathExpression クラス。C++ でコンパイルされた XPath 式を表す型付きクラスを提供します。"
type: docs
weight: 300
url: /ja/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


コンパイルされた [XPath](../) 式を表す型付きクラスを提供します。

```cpp
class XPathExpression : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | 派生クラスでオーバーライドされた場合、指定された IComparer オブジェクトに従って [XPath](../) 式で選択されたノードをソートします。 |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | 派生クラスでオーバーライドされた場合、提供されたパラメーターに従って [XPath](../) 式で選択されたノードをソートします。 |
| virtual [Clone](./clone/)() | 派生クラスでオーバーライドされた場合、この [XPathExpression](./) のクローンを返します。 |
| static [Compile](./compile/)(const String\&) | 指定された [XPath](../) 式をコンパイルし、その式を表す [XPathExpression](./) オブジェクトを返します。 |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | 指定された [XPath](../) 式をコンパイルし、名前空間解決のために指定された [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用し、その式を表す [XPathExpression](./) オブジェクトを返します。 |
| virtual [get_Expression](./get_expression/)() | 派生クラスでオーバーライドされた場合、[XPathExpression](./) の **string** 表現を取得します。 |
| virtual [get_ReturnType](./get_returntype/)() | 派生クラスでオーバーライドされた場合、[XPath](../) 式の結果型を取得します。 |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | 派生クラスでオーバーライドされた場合、名前空間解決に使用する [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) オブジェクトを指定します。 |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | 派生クラスでオーバーライドされた場合、名前空間解決に使用する [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) オブジェクトを指定します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
