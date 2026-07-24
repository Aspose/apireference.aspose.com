---
title: "System::Xml::Xsl::XsltContext クラス"
linktitle: "XsltContext"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XsltContext クラス。Extensible Stylesheet Language for Transformations (XSLT) プロセッサの現在の実行コンテキストをカプセル化し、C++ で XPath 式内の関数、パラメータ、名前空間を解決できるようにします（XML Path Language (XPath)）。"
type: docs
weight: 500
url: /ja/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Extensible Stylesheet Language for Transformations (XSLT) プロセッサの現在の実行コンテキストをカプセル化し、XML Path Language（[XPath](../../system.xml.xpath/)）が関数、パラメータ、名前空間を [XPath](../../system.xml.xpath/) 式内で解決できるようにします。

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | 派生クラスでオーバーライドされた場合、XSLT プロセッサ（つまり [XslTransform](../xsltransform/) クラス）によってドキュメントが読み込まれた順序に基づいて、2 つのドキュメントの基本 Uniform Resource Identifiers (URIs) を比較します。 |
| virtual [get_Whitespace](./get_whitespace/)() | 派生クラスでオーバーライドされた場合、出力に空白ノードを含めるかどうかを示す値を取得します。 |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | 派生クラスでオーバーライドされた場合、指定されたコンテキストで空白ノードを保持するか除去するかを評価します。 |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | 派生クラスでオーバーライドされた場合、関数参照を解決し、その関数を表す [IXsltContextFunction](../ixsltcontextfunction/) を返します。[IXsltContextFunction](../ixsltcontextfunction/) は実行時に関数の戻り値を取得するために使用されます。 |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | 派生クラスでオーバーライドされた場合、変数参照を解決し、その変数を表す [IXsltContextVariable](../ixsltcontextvariable/) を返します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
