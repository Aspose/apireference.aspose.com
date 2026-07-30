---
title: "System::Xml::Xsl::XslTransform::Load 方法"
linktitle: "Load"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XslTransform::Load 方法。加载 C++ 中 IXPathNavigable 包含的 XSLT 样式表。"
type: docs
weight: 200
url: /zh/cpp/system.xml.xsl/xsltransform/load/
---
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


加载包含在 IXPathNavigable 中的 XSLT 样式表。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是[XmlNode](../../../system.xml/xmlnode/)（通常是[XmlDocument](../../../system.xml/xmldocument/)），也可以是包含 XSLT 样式表的 XPathDocument。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


加载包含在 IXPathNavigable 中的 XSLT 样式表。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是[XmlNode](../../../system.xml/xmlnode/)（通常是[XmlDocument](../../../system.xml/xmldocument/)），也可以是包含 XSLT 样式表的 XPathDocument。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于加载 **xsl:import** 和 **xsl:include** 元素中引用的任何样式表的[XmlResolver](../../../system.xml/xmlresolver/)。如果此值为 **nullptr**，则不会解析外部资源。该 [XmlResolver](../../../system.xml/xmlresolver/) 在此方法完成后不会被缓存。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) method


加载包含在 XPathNavigator 中的 XSLT 样式表。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 样式表 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 包含 XSLT 样式表的 XPathNavigator 对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


加载包含在 XPathNavigator 中的 XSLT 样式表。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 样式表 | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | 包含 XSLT 样式表的 XPathNavigator 对象。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于加载 **xsl:import** 和 **xsl:include** 元素中引用的任何样式表的[XmlResolver](../../../system.xml/xmlresolver/)。如果此值为 **nullptr**，则不会解析外部资源。该 [XmlResolver](../../../system.xml/xmlresolver/) 在此方法完成后不会被缓存。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&) method


加载包含在[XmlReader](../../../system.xml/xmlreader/)中的 XSLT 样式表。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | 包含 XSLT 样式表的[XmlReader](../../../system.xml/xmlreader/)对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


加载包含在[XmlReader](../../../system.xml/xmlreader/)中的 XSLT 样式表。

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | 包含 XSLT 样式表的[XmlReader](../../../system.xml/xmlreader/)对象。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于加载 **xsl:import** 和 **xsl:include** 元素中引用的任何样式表的[XmlResolver](../../../system.xml/xmlresolver/)。如果此值为 **nullptr**，则不会解析外部资源。该 [XmlResolver](../../../system.xml/xmlresolver/) 在此方法完成后不会被缓存。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const String\&) method


加载由 URL 指定的 XSLT 样式表。

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| url | const String\& | 指定要加载的 XSLT 样式表的 URL。 |

## 另见

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


加载由 URL 指定的 XSLT 样式表。

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| url | const String\& | 指定要加载的 XSLT 样式表的 URL。 |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | 用于加载样式表以及 **xsl:import** 和 **xsl:include** 元素中引用的任何样式表的[XmlResolver](../../../system.xml/xmlresolver/)。如果此值为 **nullptr**，则使用默认的 [XmlUrlResolver](../../../system.xml/xmlurlresolver/)（不带用户凭据）打开样式表。默认的 [XmlUrlResolver](../../../system.xml/xmlurlresolver/) 不用于解析样式表中的任何外部资源，因此 **xsl:import** 和 **xsl:include** 元素不会被解析。该 [XmlResolver](../../../system.xml/xmlresolver/) 在此方法完成后不会被缓存。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
