---
title: "System::Xml::Xsl::XslCompiledTransform::Load method"
linktitle: "Laden"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Xsl::XslCompiledTransform::Load method. Compileert het stijlblad dat zich bevindt in het IXPathNavigable-object in C++."
type: docs
weight: 300
url: /nl/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Compileert de stylesheet die zich bevindt in het IXPathNavigable-object.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat het stijlblad bevat. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


Compileert het XSLT-stijlblad dat zich bevindt in de IXPathNavigable. De [XmlResolver](../../../system.xml/xmlresolver/) lost alle XSLT **import**- of **include**-elementen op en de XSLT-instellingen bepalen de permissies voor het stijlblad.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Een object dat de IXPathNavigable-interface implementeert. Het kan een [XmlNode](../../../system.xml/xmlnode/) zijn (meestal een [XmlDocument](../../../system.xml/xmldocument/)), of een XPathDocument dat het stijlblad bevat. |
| settings | SharedPtr\<XsltSettings\> | De [XsltSettings](../../xsltsettings/) die op het stijlblad moet worden toegepast. Als dit **nullptr** is, wordt de [XsltSettings::get_Default](../../xsltsettings/get_default/)-instelling toegepast. |
| stylesheetResolver | SharedPtr\<XmlResolver\> | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om alle stijlbladen die worden verwezen in XSLT **import**- en **include**-elementen op te lossen. Als dit **nullptr** is, worden externe bronnen niet opgelost. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


Compileert het stijlblad dat zich bevindt in de [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | Een [XmlReader](../../../system.xml/xmlreader/) die het stijlblad bevat. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Compileert het XSLT-stijlblad dat zich bevindt in de [XmlReader](../../../system.xml/xmlreader/). De [XmlResolver](../../../system.xml/xmlresolver/) lost alle XSLT **import**- of **include**-elementen op en de XSLT-instellingen bepalen de permissies voor het stijlblad.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | De [XmlReader](../../../system.xml/xmlreader/) die het stijlblad bevat. |
| settings | const SharedPtr\<XsltSettings\>\& | De [XsltSettings](../../xsltsettings/) die op het stijlblad moet worden toegepast. Als dit **nullptr** is, wordt de [XsltSettings::get_Default](../../xsltsettings/get_default/)-instelling toegepast. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om alle stijlbladen die worden verwezen in XSLT **import**- en **include**-elementen op te lossen. Als dit **nullptr** is, worden externe bronnen niet opgelost. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


Laadt en compileert de stylesheet die zich bevindt op de opgegeven URI.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheetUri | const String\& | De URI van het stijlblad. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Laadt en compileert het XSLT-stijlblad dat is opgegeven door de URI. De [XmlResolver](../../../system.xml/xmlresolver/) lost alle XSLT **import**- of **include**-elementen op en de XSLT-instellingen bepalen de permissies voor het stijlblad.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stylesheetUri | const String\& | De URI van het stijlblad. |
| settings | const SharedPtr\<XsltSettings\>\& | De [XsltSettings](../../xsltsettings/) die op het stijlblad moet worden toegepast. Als dit **nullptr** is, wordt de [XsltSettings::get_Default](../../xsltsettings/get_default/)-instelling toegepast. |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om de stijlblad-URI en alle stijlbladen die worden verwezen in XSLT **import**- en **include**-elementen op te lossen. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
