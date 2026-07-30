---
title: "System::Xml::Xsl::XslTransform::Load Methode"
linktitle: "Load"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::XslTransform::Load Methode. Lädt das XSLT-Stylesheet, das im IXPathNavigable in C++ enthalten ist."
type: docs
weight: 200
url: /de/cpp/system.xml.xsl/xsltransform/load/
---
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Lädt das XSLT-Stylesheet, das im IXPathNavigable enthalten ist.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das das XSLT-Stylesheet enthält. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Lädt das XSLT-Stylesheet, das im IXPathNavigable enthalten ist.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable-Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das das XSLT-Stylesheet enthält. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/) verwendet, um alle Stylesheets zu laden, die in **xsl:import**- und **xsl:include**-Elementen referenziert werden. Wenn dies **nullptr** ist, werden externe Ressourcen nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss dieser Methode nicht zwischengespeichert. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) method


Lädt das XSLT-Stylesheet, das im XPathNavigator enthalten ist.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stylesheet | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ein XPathNavigator-Objekt, das das XSLT-Stylesheet enthält. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Lädt das XSLT-Stylesheet, das im XPathNavigator enthalten ist.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stylesheet | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Ein XPathNavigator-Objekt, das das XSLT-Stylesheet enthält. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/) verwendet, um alle Stylesheets zu laden, die in **xsl:import**- und **xsl:include**-Elementen referenziert werden. Wenn dies **nullptr** ist, werden externe Ressourcen nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss dieser Methode nicht zwischengespeichert. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&) method


Lädt das XSLT-Stylesheet, das im [XmlReader](../../../system.xml/xmlreader/) enthalten ist.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Ein [XmlReader](../../../system.xml/xmlreader/)-Objekt, das das XSLT-Stylesheet enthält. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Lädt das XSLT-Stylesheet, das im [XmlReader](../../../system.xml/xmlreader/) enthalten ist.

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Ein [XmlReader](../../../system.xml/xmlreader/)-Objekt, das das XSLT-Stylesheet enthält. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/) verwendet, um alle Stylesheets zu laden, die in **xsl:import**- und **xsl:include**-Elementen referenziert werden. Wenn dies **nullptr** ist, werden externe Ressourcen nicht aufgelöst. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss dieser Methode nicht zwischengespeichert. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const String\&) method


Lädt das XSLT-Stylesheet, das durch eine URL angegeben wird.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| url | const String\& | Die URL, die das zu ladende XSLT-Stylesheet angibt. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Load(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Lädt das XSLT-Stylesheet, das durch eine URL angegeben wird.

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| url | const String\& | Die URL, die das zu ladende XSLT-Stylesheet angibt. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der zum Laden des Stylesheets und aller darin referenzierten Stylesheets (über **xsl:import** und **xsl:include**) verwendet wird. Wenn dies **nullptr** ist, wird ein Standard-[XmlUrlResolver](../../../system.xml/xmlurlresolver/) ohne Benutzeranmeldeinformationen verwendet, um das Stylesheet zu öffnen. Der Standard-[XmlUrlResolver](../../../system.xml/xmlurlresolver/) wird nicht zum Auflösen externer Ressourcen im Stylesheet verwendet, sodass **xsl:import**- und **xsl:include**-Elemente nicht aufgelöst werden. Der [XmlResolver](../../../system.xml/xmlresolver/) wird nach Abschluss dieser Methode nicht zwischengespeichert. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
