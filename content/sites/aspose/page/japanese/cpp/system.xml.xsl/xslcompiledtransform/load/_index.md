---
title: "System::Xml::Xsl::XslCompiledTransform::Load メソッド"
linktitle: "ロード"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XslCompiledTransform::Load メソッド。C++ で IXPathNavigable オブジェクトに含まれるスタイルシートをコンパイルします。"
type: docs
weight: 300
url: /ja/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


IXPathNavigable オブジェクトに含まれるスタイルシートをコンパイルします。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは [XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）またはスタイルシートを含む XPathDocument のいずれかです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


IXPathNavigable に含まれる XSLT スタイルシートをコンパイルします。[XmlResolver](../../../system.xml/xmlresolver/) は XSLT の **import** または **include** 要素を解決し、XSLT 設定がスタイルシートの権限を決定します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable インターフェイスを実装するオブジェクトです。これは [XmlNode](../../../system.xml/xmlnode/)（通常は [XmlDocument](../../../system.xml/xmldocument/)）またはスタイルシートを含む XPathDocument のいずれかです。 |
| settings | SharedPtr\<XsltSettings\> | スタイルシートに適用する [XsltSettings](../../xsltsettings/)。これが **nullptr** の場合、[XsltSettings::get_Default](../../xsltsettings/get_default/) 設定が適用されます。 |
| stylesheetResolver | SharedPtr\<XmlResolver\> | XSLT の **import** および **include** 要素で参照されるスタイルシートを解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。これが **nullptr** の場合、外部リソースは解決されません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) に含まれるスタイルシートをコンパイルします。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | スタイルシートを含む [XmlReader](../../../system.xml/xmlreader/)。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


[XmlReader](../../../system.xml/xmlreader/) に含まれる XSLT スタイルシートをコンパイルします。[XmlResolver](../../../system.xml/xmlresolver/) は XSLT の **import** または **include** 要素を解決し、XSLT 設定がスタイルシートの権限を決定します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | スタイルシートを含む [XmlReader](../../../system.xml/xmlreader/)。 |
| settings | const SharedPtr\<XsltSettings\>\& | スタイルシートに適用する [XsltSettings](../../xsltsettings/)。これが **nullptr** の場合、[XsltSettings::get_Default](../../xsltsettings/get_default/) 設定が適用されます。 |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | XSLT の **import** および **include** 要素で参照されるスタイルシートを解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。これが **nullptr** の場合、外部リソースは解決されません。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


指定された URI にあるスタイルシートを読み込み、コンパイルします。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| stylesheetUri | const String\& | スタイルシートの URI。 |

## 参照

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


URI で指定された XSLT スタイルシートを読み込み、コンパイルします。 [XmlResolver](../../../system.xml/xmlresolver/) は XSLT の **import** または **include** 要素を解決し、XSLT 設定はスタイルシートの権限を決定します。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| stylesheetUri | const String\& | スタイルシートの URI。 |
| settings | const SharedPtr\<XsltSettings\>\& | スタイルシートに適用する [XsltSettings](../../xsltsettings/)。これが **nullptr** の場合、[XsltSettings::get_Default](../../xsltsettings/get_default/) 設定が適用されます。 |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | スタイルシートの URI および XSLT の **import** と **include** 要素で参照されるすべてのスタイルシートを解決するために使用される [XmlResolver](../../../system.xml/xmlresolver/)。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
