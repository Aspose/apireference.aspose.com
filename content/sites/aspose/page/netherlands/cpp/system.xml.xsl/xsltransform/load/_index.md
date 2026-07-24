---
title: "System::Xml::Xsl::XslTransform::Load-methode"
linktitle: "Laden"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XslTransform::Load-methode. Laadt het XSLT-stylesheet dat zich bevindt in de IXPathNavigable in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml.xsl/xsltransform/load/
---
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Laadt het XSLT‑stijlblad dat zich bevindt in de IXPathNavigable.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat het XSLT-stylesheet bevat. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Laadt het XSLT‑stijlblad dat zich bevindt in de IXPathNavigable.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat het XSLT-stylesheet bevat. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om alle stylesheets te laden die worden verwezen in **xsl:import**- en **xsl:include**-elementen. Als dit **nullptr** is, worden externe bronnen niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet in de cache opgeslagen nadat deze methode is voltooid. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) method


Laadt het XSLT‑stijlblad dat zich bevindt in de XPathNavigator.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Een XPathNavigator-object dat het XSLT-stylesheet bevat. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Laadt het XSLT‑stijlblad dat zich bevindt in de XPathNavigator.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Een XPathNavigator-object dat het XSLT-stylesheet bevat. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om alle stylesheets te laden die worden verwezen in **xsl:import**- en **xsl:include**-elementen. Als dit **nullptr** is, worden externe bronnen niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet in de cache opgeslagen nadat deze methode is voltooid. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&) method


Laadt het XSLT-stylesheet dat zich bevindt in de [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Een [XmlReader](../../../system.xml/xmlreader/) object dat het XSLT-stylesheet bevat. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Laadt het XSLT-stylesheet dat zich bevindt in de [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Een [XmlReader](../../../system.xml/xmlreader/) object dat het XSLT-stylesheet bevat. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om alle stylesheets te laden die worden verwezen in **xsl:import**- en **xsl:include**-elementen. Als dit **nullptr** is, worden externe bronnen niet opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet in de cache opgeslagen nadat deze methode is voltooid. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&) method


Laadt het XSLT‑stijlblad gespecificeerd door een URL.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| url | const String\& | De URL die het te laden XSLT-stylesheet specificeert. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Laadt het XSLT‑stijlblad gespecificeerd door een URL.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| url | const String\& | De URL die het te laden XSLT-stylesheet specificeert. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die moet worden gebruikt om het stylesheet en eventuele stylesheet(s) die worden verwezen in **xsl:import**- en **xsl:include**-elementen te laden. Als dit **nullptr** is, wordt een standaard [XmlUrlResolver](../../../system.xml/xmlurlresolver/) zonder gebruikersreferenties gebruikt om het stylesheet te openen. De standaard [XmlUrlResolver](../../../system.xml/xmlurlresolver/) wordt niet gebruikt om externe bronnen in het stylesheet op te lossen, zodat **xsl:import**- en **xsl:include**-elementen niet worden opgelost. De [XmlResolver](../../../system.xml/xmlresolver/) wordt niet gecachet na het voltooien van deze methode. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
