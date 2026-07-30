---
title: "System::Xml::Xsl::XslCompiledTransform::Load Methode"
linktitle: "Load"
second_title: "Aspose.Font für C++"
description: "System::Xml::Xsl::XslCompiledTransform::Load Methode. Kompiliert das im IXPathNavigable‑Objekt enthaltene Stylesheet in C++."
type: docs
weight: 300
url: /de/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Kompiliert das Stylesheet, das im IXPathNavigable-Objekt enthalten ist.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable‑Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das das Stylesheet enthält. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


Kompiliert das im IXPathNavigable enthaltene XSLT‑Stylesheet. Der [XmlResolver](../../../system.xml/xmlresolver/) löst alle XSLT‑**import**‑ oder **include**‑Elemente auf und die XSLT‑Einstellungen bestimmen die Berechtigungen für das Stylesheet.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ein Objekt, das das IXPathNavigable‑Interface implementiert. Es kann entweder ein [XmlNode](../../../system.xml/xmlnode/) (typischerweise ein [XmlDocument](../../../system.xml/xmldocument/)) oder ein XPathDocument sein, das das Stylesheet enthält. |
| settings | SharedPtr\<XsltSettings\> | Die [XsltSettings](../../xsltsettings/), die auf das Stylesheet angewendet werden sollen. Wenn dies **nullptr** ist, wird die Einstellung [XsltSettings::get_Default](../../xsltsettings/get_default/) verwendet. |
| stylesheetResolver | SharedPtr\<XmlResolver\> | Der [XmlResolver](../../../system.xml/xmlresolver/), der verwendet wird, um alle in XSLT‑**import**‑ und **include**‑Elementen referenzierten Stylesheets aufzulösen. Wenn dies **nullptr** ist, werden externe Ressourcen nicht aufgelöst. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


Kompiliert das Stylesheet, das im [XmlReader](../../../system.xml/xmlreader/) enthalten ist.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Ein [XmlReader](../../../system.xml/xmlreader/), der das Stylesheet enthält. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Kompiliert das XSLT-Stylesheet, das im [XmlReader](../../../system.xml/xmlreader/) enthalten ist. Der [XmlResolver](../../../system.xml/xmlresolver/) löst alle XSLT **import**- oder **include**-Elemente auf und die XSLT-Einstellungen bestimmen die Berechtigungen für das Stylesheet.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Der [XmlReader](../../../system.xml/xmlreader/), der das Stylesheet enthält. |
| settings | const SharedPtr\<XsltSettings\>\& | Die [XsltSettings](../../xsltsettings/), die auf das Stylesheet angewendet werden sollen. Wenn dies **nullptr** ist, wird die Einstellung [XsltSettings::get_Default](../../xsltsettings/get_default/) verwendet. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der verwendet wird, um alle in XSLT‑**import**‑ und **include**‑Elementen referenzierten Stylesheets aufzulösen. Wenn dies **nullptr** ist, werden externe Ressourcen nicht aufgelöst. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


Lädt und kompiliert das Stylesheet, das sich an der angegebenen URI befindet.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stylesheetUri | const String\& | Der URI des Stylesheets. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Lädt und kompiliert das XSLT-Stylesheet, das durch den URI angegeben ist. Der [XmlResolver](../../../system.xml/xmlresolver/) löst alle XSLT **import**- oder **include**-Elemente auf und die XSLT-Einstellungen bestimmen die Berechtigungen für das Stylesheet.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stylesheetUri | const String\& | Der URI des Stylesheets. |
| settings | const SharedPtr\<XsltSettings\>\& | Die [XsltSettings](../../xsltsettings/), die auf das Stylesheet angewendet werden sollen. Wenn dies **nullptr** ist, wird die Einstellung [XsltSettings::get_Default](../../xsltsettings/get_default/) verwendet. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der verwendet wird, um den URI des Stylesheets und alle in XSLT **import**- und **include**-Elementen referenzierten Stylesheets aufzulösen. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
