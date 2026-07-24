---
title: "System::Xml::Xsl::XslCompiledTransform::Load‑metod"
linktitle: "Läs in"
second_title: "Aspose.Page för C++"
description: "System::Xml::Xsl::XslCompiledTransform::Load‑metod. Kompilerar stilmallen som finns i IXPathNavigable‑objektet i C++."
type: docs
weight: 300
url: /sv/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


Kompilerar stilmallen som finns i IXPathNavigable-objektet.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller stilmallen. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


Kompilerar XSLT‑stilmallen som finns i IXPathNavigable. [XmlResolver](../../../system.xml/xmlresolver/) löser alla XSLT‑element **import** eller **include** och XSLT‑inställningarna bestämmer behörigheterna för stilmallen.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Ett objekt som implementerar IXPathNavigable‑gränssnittet. Det kan vara antingen en [XmlNode](../../../system.xml/xmlnode/) (vanligtvis ett [XmlDocument](../../../system.xml/xmldocument/)), eller ett XPathDocument som innehåller stilmallen. |
| settings | SharedPtr\<XsltSettings\> | [XsltSettings](../../xsltsettings/) att tillämpa på stilmallen. Om detta är **nullptr**, används inställningen [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | SharedPtr\<XmlResolver\> | [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa eventuella stilmallar som refereras i XSLT‑elementen **import** och **include**. Om detta är **nullptr**, löses externa resurser inte. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


Kompilerar stilmallen som finns i [XmlReader](../../../system.xml/xmlreader/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | En [XmlReader](../../../system.xml/xmlreader/) som innehåller stilmallen. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Kompilerar XSLT‑stilmallen som finns i [XmlReader](../../../system.xml/xmlreader/). [XmlResolver](../../../system.xml/xmlresolver/) löser alla XSLT‑element **import** eller **include** och XSLT‑inställningarna bestämmer behörigheterna för stilmallen.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) som innehåller stilmallen. |
| settings | const SharedPtr\<XsltSettings\>\& | [XsltSettings](../../xsltsettings/) att tillämpa på stilmallen. Om detta är **nullptr**, används inställningen [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa eventuella stilmallar som refereras i XSLT‑elementen **import** och **include**. Om detta är **nullptr**, löses externa resurser inte. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


Laddar och kompilerar stilmallen som finns på den angivna URI:n.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| stylesheetUri | const String\& | URI för stilmallen. |

## Se även

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


Laddar och kompilerar XSLT‑stilmallen som anges av URI:n. [XmlResolver](../../../system.xml/xmlresolver/) löser alla XSLT **import**‑ eller **include**‑element och XSLT‑inställningarna bestämmer behörigheterna för stilmallen.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| stylesheetUri | const String\& | URI för stilmallen. |
| settings | const SharedPtr\<XsltSettings\>\& | [XsltSettings](../../xsltsettings/) att tillämpa på stilmallen. Om detta är **nullptr**, används inställningen [XsltSettings::get_Default](../../xsltsettings/get_default/). |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) som används för att lösa stilmallens URI och eventuella stilmallar som refereras i XSLT **import**‑ och **include**‑element. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
