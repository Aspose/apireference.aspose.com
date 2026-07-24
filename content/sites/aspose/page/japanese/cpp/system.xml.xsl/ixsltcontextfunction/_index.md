---
title: "System::Xml::Xsl::IXsltContextFunction クラス"
linktitle: "IXsltContextFunction"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::IXsltContextFunction クラス。C++ の実行時に Extensible Stylesheet Language for Transformations (XSLT) スタイルシートで定義された特定の関数へのインターフェイスを提供します。"
type: docs
weight: 100
url: /ja/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


実行時に拡張スタイルシート言語 for Transformations (XSLT) スタイルシートで定義された特定の関数へのインターフェイスを提供します。

```cpp
class IXsltContextFunction : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | 関数の引数リストに対して提供された XML Path Language（[XPath](../../system.xml.xpath/)）型を返します。この情報は関数のシグネチャを特定するために使用でき、オーバーロードされた関数を区別することができます。 |
| virtual [get_Maxargs](./get_maxargs/)() | 関数の最大引数数を返します。これにより、ユーザーはオーバーロードされた関数を区別できます。 |
| virtual [get_Minargs](./get_minargs/)() | 関数の最小引数数を返します。これにより、ユーザーはオーバーロードされた関数を区別できます。 |
| virtual [get_ReturnType](./get_returntype/)() | 関数が返す [XPath](../../system.xml.xpath/) 型を表す XPathResultType を返します。 |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | 指定されたコンテキストで、与えられた引数を使用して関数を呼び出すメソッドを提供します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
