---
title: "System::Xml::Xsl::XslCompiledTransform::Load 方法"
linktitle: "Load"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XslCompiledTransform::Load 方法。编译 IXPathNavigable 对象中包含的样式表，在 C++ 中实现。"
type: docs
weight: 300
url: /zh/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


编译包含在 IXPathNavigable 对象中的样式表。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），也可以是包含样式表的 XPathDocument。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


编译 IXPathNavigable 中包含的 XSLT 样式表。[XmlResolver](../../../system.xml/xmlresolver/) 解析任何 XSLT **import** 或 **include** 元素，XSLT 设置决定样式表的权限。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | 实现 IXPathNavigable 接口的对象。它可以是 [XmlNode](../../../system.xml/xmlnode/)（通常是 [XmlDocument](../../../system.xml/xmldocument/)），也可以是包含样式表的 XPathDocument。 |
| settings | SharedPtr\<XsltSettings\> | 要应用于样式表的 [XsltSettings](../../xsltsettings/)。如果此值为 **nullptr**，则使用 [XsltSettings::get_Default](../../xsltsettings/get_default/) 设置。 |
| stylesheetResolver | SharedPtr\<XmlResolver\> | 用于解析 XSLT **import** 和 **include** 元素中引用的任何样式表的 [XmlResolver](../../../system.xml/xmlresolver/)。如果此值为 **nullptr**，则不会解析外部资源。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


编译包含在 [XmlReader](../../../system.xml/xmlreader/) 中的样式表。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | 一个包含样式表的 [XmlReader](../../../system.xml/xmlreader/)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


编译包含在 [XmlReader](../../../system.xml/xmlreader/) 中的 XSLT 样式表。 [XmlResolver](../../../system.xml/xmlresolver/) 解析任何 XSLT **import** 或 **include** 元素，XSLT 设置决定样式表的权限。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | 包含样式表的 [XmlReader](../../../system.xml/xmlreader/)。 |
| settings | const SharedPtr\<XsltSettings\>\& | 要应用于样式表的 [XsltSettings](../../xsltsettings/)。如果此值为 **nullptr**，则使用 [XsltSettings::get_Default](../../xsltsettings/get_default/) 设置。 |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | 用于解析 XSLT **import** 和 **include** 元素中引用的任何样式表的 [XmlResolver](../../../system.xml/xmlresolver/)。如果此值为 **nullptr**，则不会解析外部资源。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


加载并编译位于指定 URI 的样式表。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stylesheetUri | const String\& | 样式表的 URI。 |

## 另见

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


加载并编译由 URI 指定的 XSLT 样式表。 [XmlResolver](../../../system.xml/xmlresolver/) 解析任何 XSLT **import** 或 **include** 元素，XSLT 设置决定样式表的权限。

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| stylesheetUri | const String\& | 样式表的 URI。 |
| settings | const SharedPtr\<XsltSettings\>\& | 要应用于样式表的 [XsltSettings](../../xsltsettings/)。如果此值为 **nullptr**，则使用 [XsltSettings::get_Default](../../xsltsettings/get_default/) 设置。 |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | 用于解析样式表 URI 以及 XSLT **import** 和 **include** 元素中引用的任何样式表的 [XmlResolver](../../../system.xml/xmlresolver/)。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
