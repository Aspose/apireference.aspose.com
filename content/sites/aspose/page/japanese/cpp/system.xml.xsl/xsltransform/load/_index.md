---
title: "System::Xml::Xsl::XslTransform::Load メソッド"
linktitle: "ロード"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XslTransform::Load メソッド。C++ で IXPathNavigable に含まれる XSLT スタイルシートを読み込みます。"
type: docs
weight: 200
url: /ja/cpp/system.xml.xsl/xsltransform/load/
---
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


IXPathNavigable に含まれる XSLT スタイルシートを読み込みます。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または XSLT スタイルシートを含む XPathDocument のいずれかです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


IXPathNavigable に含まれる XSLT スタイルシートを読み込みます。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは、[XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）または XSLT スタイルシートを含む XPathDocument のいずれかです。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | **xsl:import** および **xsl:include** 要素で参照されるすべてのスタイルシートを読み込むために使用される [XmlResolver](../../../system.xml/xmlresolver/) です。これが **nullptr** の場合、外部リソースは解決されません。このメソッドが完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) method


XPathNavigator に含まれる XSLT スタイルシートを読み込みます。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| スタイルシート | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XSLT スタイルシートを含む XPathNavigator オブジェクトです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


XPathNavigator に含まれる XSLT スタイルシートを読み込みます。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| スタイルシート | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | XSLT スタイルシートを含む XPathNavigator オブジェクトです。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | **xsl:import** および **xsl:include** 要素で参照されるすべてのスタイルシートを読み込むために使用される [XmlResolver](../../../system.xml/xmlresolver/) です。これが **nullptr** の場合、外部リソースは解決されません。このメソッドが完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) に含まれる XSLT スタイルシートを読み込みます。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) に XSLT スタイルシートが含まれるオブジェクトです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


[XmlReader](../../../system.xml/xmlreader/) に含まれる XSLT スタイルシートを読み込みます。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) に XSLT スタイルシートが含まれるオブジェクトです。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | **xsl:import** および **xsl:include** 要素で参照されるすべてのスタイルシートを読み込むために使用される [XmlResolver](../../../system.xml/xmlresolver/) です。これが **nullptr** の場合、外部リソースは解決されません。このメソッドが完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&) method


URL で指定された XSLT スタイルシートを読み込みます。

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| url | const String\& | 読み込む XSLT スタイルシートを指定する URL です。 |

## 参照

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


URL で指定された XSLT スタイルシートを読み込みます。

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| url | const String\& | 読み込む XSLT スタイルシートを指定する URL です。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) は、スタイルシートおよび **xsl:import** や **xsl:include** 要素で参照されるすべてのスタイルシートを読み込むために使用します。これが **nullptr** の場合、ユーザー認証情報のないデフォルトの [XmlUrlResolver](../../../system.xml/xmlurlresolver/) がスタイルシートを開くために使用されます。デフォルトの [XmlUrlResolver](../../../system.xml/xmlurlresolver/) は、スタイルシート内の外部リソースを解決するためには使用されず、その結果 **xsl:import** と **xsl:include** 要素は解決されません。このメソッドが完了した後、[XmlResolver](../../../system.xml/xmlresolver/) はキャッシュされません。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
