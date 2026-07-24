---
title: "System::Xml::XPath::XPathExpression::Compile メソッド"
linktitle: "コンパイル"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathExpression::Compile メソッド。指定された XPath 式をコンパイルし、C++ でその XPath 式を表す XPathExpression オブジェクトを返します。"
type: docs
weight: 600
url: /ja/cpp/system.xml.xpath/xpathexpression/compile/
---
## XPathExpression::Compile(const String\&) method


指定された [XPath](../../) 式をコンパイルし、その [XPath](../../) 式を表す [XPathExpression](../) オブジェクトを返します。

```cpp
static SharedPtr<XPathExpression> System::Xml::XPath::XPathExpression::Compile(const String &xpath)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | const String\& | [XPath](../../) 式。 |

### ReturnValue

[XPathExpression](../) オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../)
* Class [String](../../../system/string/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::Compile(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) method


指定された [XPath](../../) 式をコンパイルし、名前空間解決のために指定された [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用し、[XPath](../../) 式を表す [XPathExpression](../) オブジェクトを返します。

```cpp
static SharedPtr<XPathExpression> System::Xml::XPath::XPathExpression::Compile(const String &xpath, const SharedPtr<IXmlNamespaceResolver> &nsResolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | const String\& | [XPath](../../) 式。 |
| nsResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | 名前空間解決のために [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) インターフェイスを実装するオブジェクトです。 |

### ReturnValue

[XPathExpression](../) オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
