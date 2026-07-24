---
title: "System::Xml::Xsl::IXsltContextVariable クラス"
linktitle: "IXsltContextVariable"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::IXsltContextVariable クラス。C++ の実行時にスタイルシートで定義された特定の変数へのインターフェイスを提供します。"
type: docs
weight: 200
url: /ja/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


実行時にスタイルシートで定義された特定の変数へのインターフェイスを提供します。

```cpp
class IXsltContextVariable : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | 変数を実行時に評価し、変数の値を表すオブジェクトを返します。 |
| virtual [get_IsLocal](./get_islocal/)() | 変数がローカルかどうかを示す値を返します。 |
| virtual [get_IsParam](./get_isparam/)() | 変数が Extensible Stylesheet Language Transformations (XSLT) パラメータかどうかを示す値を返します。これはスタイルシートまたはテンプレートへのパラメータになる可能性があります。 |
| virtual [get_VariableType](./get_variabletype/)() | 変数の XML Path Language（[XPath](../../system.xml.xpath/)）型を表す XPathResultType を返します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
